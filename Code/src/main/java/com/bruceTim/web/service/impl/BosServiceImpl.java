package com.bruceTim.web.service.impl;

import com.bruceTim.web.service.BosService;
import com.bruceTim.web.util.BOSClient;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by BruceTim on 2017/2/6.
 */
@Service
public class BosServiceImpl implements BosService {

    @Value("#{configProperties['access.key.id']}")
    private String access_key_id;

    @Value("#{configProperties['access.key']}")
    private String access_key;

    @Value("#{configProperties['endpoint']}")
    private String endpoint;

    @Value("#{configProperties['bucket']}")
    private String bucket;

    // 图片类型
    private static List<String> fileTypes = new ArrayList<String>();

    static {
        fileTypes.add(".jpg");
        fileTypes.add(".jpeg");
        fileTypes.add(".bmp");
        fileTypes.add(".gif");
        fileTypes.add(".png");
    }

    @Override
    public String uploadToBOS (CommonsMultipartFile[] files) throws Exception{
        String fileName = "";
        String originalFilename = "";
        String suffix = "";
        String fileUrl = "";
        StringBuffer sBuffer = new StringBuffer();
        for (CommonsMultipartFile file : files) {
            // 获得图片的原始名称
            originalFilename = file.getOriginalFilename();
            // 获得图片后缀名称,如果后缀不为图片格式，则不上传
            suffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
            // 重命名上传后的文件名 111112323.jpg
            fileName = originalFilename.substring(0, originalFilename.lastIndexOf(".")) + DateUtils.formatDate(new Date(), "yyyyMMddHHmmss") + suffix;
            fileUrl = new BOSClient(access_key_id, access_key, endpoint, bucket).putObject(fileName, file.getInputStream());
            sBuffer.append(fileUrl).append("|");
        }
        if (sBuffer.length() > 0) {
            sBuffer.deleteCharAt(sBuffer.length() - 1);
        }
        return sBuffer.toString();
    }

    @Override
    public void uploadToBOS (HttpServletRequest request, HttpServletResponse response) throws Exception {

        String fileUrl = uploadHandler(request);
        // 结合ckeditor功能
        response.setContentType("text/html;charset=UTF-8");
        String callback = request.getParameter("CKEditorFuncNum");
        PrintWriter out = response.getWriter();
        out.println("<script type=\"text/javascript\">");
        out.println("window.parent.CKEDITOR.tools.callFunction(" + callback + ",'" + fileUrl + "',''" + ")");
        out.println("</script>");
        out.flush();
        out.close();

    }

    private String uploadHandler(HttpServletRequest request) throws Exception {
        // 创建一个通用的多部分解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession()
                .getServletContext());
        // 判断 request 是否有文件上传,即多部分请求
        if (multipartResolver.isMultipart(request)) {
            // 转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            // 取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                // 记录上传过程起始时的时间，用来计算上传时间
                // int pre = (int) System.currentTimeMillis();
                // 取得上传文件
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    return this.uploadToBOS(file);
                }
            }
        }
        return "";
    }

    private String uploadToBOS(MultipartFile file) throws Exception{
        // 取得当前上传文件的文件名称
        String originalFilename = file.getOriginalFilename();
        // 如果名称不为“”,说明该文件存在，否则说明该文件不存在
        if (originalFilename.trim() != "") {
            // 获得图片后缀名称,如果后缀不为图片格式，则不上传
            String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
            if (!fileTypes.contains(suffix)) {
                return "";
            }
            String fileName = originalFilename.substring(0, originalFilename.lastIndexOf(".")) + DateUtils.formatDate(new Date(), "yyyyMMddHHmmss") + suffix;
            return new BOSClient(access_key_id, access_key, endpoint, bucket).putObject(fileName, file.getInputStream());
        }
        return "";
    }
}
