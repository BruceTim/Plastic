package com.bruceTim.web.util.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created by BruceTim on 2017/1/11.
 */
public class SmtpAuthenticator extends Authenticator {

    private String username;
    private String password;

    public SmtpAuthenticator(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }
}
