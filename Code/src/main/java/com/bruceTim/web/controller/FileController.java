package com.bruceTim.web.controller;

import com.bruceTim.core.util.ImageUploadUtil;
import com.bruceTim.web.util.GlobalData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by BruceTim on 2016/12/19.
 */
@Controller
@RequestMapping("/files")
public class FileController {

    /**
     * ckeditor图片上传
     *
     * @Title imageUpload
     * @param request
     * @param response
     */
    @RequestMapping("/upload")
    public void imageUpload(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "type", defaultValue = "base64") String type) {
        try {
            if (GlobalData.FILE_UPLOAD_TYPE_CKEDITOR.equals(type)) {
                ImageUploadUtil.ckeditor(request, response, GlobalData.FILE_UPLOAD_PATH_CKEDITOR);
            } else if (GlobalData.FILE_UPLOAD_TYPE_BASE64.equals(type)){

            }

        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
