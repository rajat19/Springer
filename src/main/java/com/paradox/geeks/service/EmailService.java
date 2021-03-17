package com.paradox.geeks.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("rajat2.srivastava@paytm.com", "rajatsri94@gmail.com");
        message.setSubject("Testing Springer mail");
        message.setText("Hello World\n Springer email");
        javaMailSender.send(message);
    }
}
