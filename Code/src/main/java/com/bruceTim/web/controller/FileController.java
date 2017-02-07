package com.bruceTim.web.controller;

import com.bruceTim.web.service.BosService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by BruceTim on 2016/12/19.
 */
@Controller
@RequestMapping("/files")
public class FileController {

    @Resource
    private BosService bosService;

    /**
     * ckeditor图片上传
     *
     * @Title imageUpload
     * @param request
     * @param response
     */
    @RequestMapping("pictures/upload/ckeditor")
    public void imageUpload(HttpServletRequest request, HttpServletResponse response) {
        try {

            bosService.uploadToBOS(request, response);

        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
