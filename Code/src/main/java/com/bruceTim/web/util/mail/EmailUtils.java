package com.bruceTim.web.util.mail;

import com.bruceTim.web.model.Email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import com.bruceTim.web.util.GlobalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * Created by BruceTim on 2017/1/10.
 */
@Service
public class EmailUtils {

    @Autowired
    private JavaMailSenderImpl senderImpl;

    @Value("${mail.username}")
    private String transfer;

    /**
     * 创建MimeMessage
     * @param email
     * @return
     * @throws MessagingException
     * @throws UnsupportedEncodingException
     */
    public MimeMessage createMimeMessage(Email email, String realPath) throws MessagingException, UnsupportedEncodingException{

        MimeMessage mimeMessage = senderImpl.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(transfer, "精力塑料厂服务器代发");
        messageHelper.setSubject(email.getSender() + " : " +email.getSubject());
        messageHelper.setTo(email.getReceiver());
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("<html><head></head><body>");
        sbuffer.append(email.getContent());
        sbuffer.append("</body></html>");
        // true 表示启动HTML格式的邮件
        messageHelper.setText(sbuffer.toString(),true);

        if (email.getFile1() != null ) {
            addFile(messageHelper, email.getFile1(), realPath);
        }

        if (email.getFile2() != null ) {
            addFile(messageHelper, email.getFile2(), realPath);
        }

        if (email.getFile3() != null ) {
            addFile(messageHelper, email.getFile3(), realPath);
        }

        return mimeMessage;
    }

    /**
     * 添加附件
     * @param messageHelper
     * @param fileUrl
     * @param realPath
     * @throws MessagingException
     */
    private void addFile(MimeMessageHelper messageHelper, String fileUrl, String realPath) throws MessagingException{
        FileSystemResource file = new FileSystemResource(
                new File(realPath + fileUrl));
        // 这里的方法调用和插入图片是不同的。
        messageHelper.addAttachment(fileUrl.substring(fileUrl.lastIndexOf('/'), fileUrl.length()), file);
    }

    public void sendMail(Email email, String realPath) throws UnsupportedEncodingException, MessagingException{
        MimeMessage msg = createMimeMessage(email, realPath);
        senderImpl.send(msg);
    }

    public void send(Email email, HttpServletRequest request) throws Exception{

        email.setTransfer(transfer);
        String realPath = request.getServletContext().getRealPath(GlobalData.FILE_UPLOAD_PATH_EMAIL + "/");

        // 设定mail server
        senderImpl.setHost("smtp.163.com");
        // 建立邮件消息,发送简单邮件和html邮件的区别
        MimeMessage mailMessage = senderImpl.createMimeMessage();
        // 注意这里的boolean,等于真的时候才能嵌套图片，在构建MimeMessageHelper时候，所给定的值是true表示启用，
        // multipart模式 为true时发送附件 可以设置html格式
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,
                true, "utf-8");

        // 设置收件人，寄件人
        messageHelper.setTo(email.getReceiver());
        messageHelper.setFrom(email.getSender());
        messageHelper.setSubject(email.getSubject());

        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("<html><head></head><body>");
        sbuffer.append(email.getContent());
        sbuffer.append("</body></html>");
        // true 表示启动HTML格式的邮件
        messageHelper.setText(sbuffer.toString(),true);

        if (email.getFile1() != null ) {
            String file1Url = email.getFile1();
            FileSystemResource file = new FileSystemResource(
                    new File(realPath + file1Url));
            // 这里的方法调用和插入图片是不同的。
            messageHelper.addAttachment(file1Url.substring(file1Url.lastIndexOf('/'), file1Url.length()), file);
        }

        if (email.getFile2() != null ) {
            String fileUrl = email.getFile2();
            FileSystemResource file = new FileSystemResource(
                    new File(realPath + fileUrl));
            messageHelper.addAttachment(fileUrl.substring(fileUrl.lastIndexOf('/'), fileUrl.length()), file);
        }

        if (email.getFile3() != null ) {
            String fileUrl = email.getFile3();
            FileSystemResource file = new FileSystemResource(
                    new File(realPath + fileUrl));
            messageHelper.addAttachment(fileUrl.substring(fileUrl.lastIndexOf('/'), fileUrl.length()), file);
        }
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true"); // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
        prop.put("mail.smtp.timeout", "25000");
        senderImpl.setJavaMailProperties(prop);
        // 发送邮件
        senderImpl.send(mailMessage);

        System.out.println("邮件发送成功..");
    }

}
