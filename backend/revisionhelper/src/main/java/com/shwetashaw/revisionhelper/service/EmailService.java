package com.shwetashaw.revisionhelper.service;

import com.shwetashaw.revisionhelper.model.RevisionItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendReminder(RevisionItem item) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(item.getEmail());
        message.setSubject("🔁 Revision Reminder: " + item.getTopic());
        message.setText(
                "Hi,\n\nThis is your reminder to revise: " + item.getTopic() +
                "\n\nLink: " + item.getUrl() +
                "\n\nStay consistent!\n- Revision Helper"
        );
        mailSender.send(message);
    }
}
