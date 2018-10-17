package com.juvenxu.mvnbook.account.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @author wangmin
 * @Date 2018-08-16
 *
 */
public class AccountEmailServiceImpl implements AccountEmailService {
    private JavaMailSender javaMailSender;
    private String         systemEmail;

    @Override
    public void sendEmail(String to, String subject, String htmlText) throws AccountEmailException {

      try {
          MimeMessage msg = javaMailSender.createMimeMessage();
          MimeMessageHelper msgHlper = new MimeMessageHelper(msg);
          msgHlper.setFrom(systemEmail);
          msgHlper.setTo(to);
          msgHlper.setSubject(subject);
          msgHlper.setText(htmlText, true);
      } catch (MessagingException e) {
          throw new AccountEmailException("Fail to send mail", e);
      }
        System.out.println("**************  success to send mail ****************");
    }

    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String getSystemEmail() {
        return systemEmail;
    }

    public void setSystemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
    }
}

