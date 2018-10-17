package com.juvenxu.mvnbook.account.email;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.GreenMailUtil;
import com.icegreen.greenmail.util.ServerSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.mail.Message;

import static org.junit.Assert.*;

/**
 * 未运行成功
 */
public class AccountEmailServiceTest {
    private GreenMail mailServer;

    @Before
    public void startMailServer() throws Exception{
        mailServer = new GreenMail(ServerSetup.SMTP);
//        mailServer.setUser("mw180819@gmail.com","915102wangmindi");
        mailServer.setUser("1141706486@qq.com","915102wangmindi2");
        mailServer.start();
    }

    @Test
    public void sendEmail() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("account-email.xml");
        AccountEmailService accountEmailService = (AccountEmailService) ctx.getBean("accountEmailService");

        String subject = "The Subject";
        String htmlText = "<h3>Test</h3>";
        accountEmailService.sendEmail("364021814@qq.com",subject,htmlText);

        mailServer.waitForIncomingEmail(2000,1);

        Message[] msgs = mailServer.getReceivedMessages();
        assertEquals(1, msgs.length);
        assertEquals(subject, msgs[0].getSubject());
        assertEquals(htmlText, GreenMailUtil.getBody(msgs[0]).trim());

    }

    @After
    public void stopMailServer() throws Exception{
        mailServer.stop();
    }

}