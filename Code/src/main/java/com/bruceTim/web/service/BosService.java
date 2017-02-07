package com.bruceTim.web.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by BruceTim on 2017/2/6.
 */
public interface BosService {

    String uploadToBOS(CommonsMultipartFile[] files) throws Exception;

    void uploadToBOS(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
