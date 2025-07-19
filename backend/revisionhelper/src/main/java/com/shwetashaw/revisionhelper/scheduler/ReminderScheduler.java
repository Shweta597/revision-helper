package com.shwetashaw.revisionhelper.scheduler;

import com.shwetashaw.revisionhelper.model.RevisionItem;
import com.shwetashaw.revisionhelper.repository.RevisionRepository;
import com.shwetashaw.revisionhelper.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ReminderScheduler {

    @Autowired
    private RevisionRepository repository;

    @Autowired
    private EmailService emailService;

    // Every day at 8 AM
    @Scheduled(cron = "0 0 8 * * *")
    public void sendDailyReminders() {
        List<RevisionItem> items = repository.findByRevisionDateAndNotified(LocalDate.now(), false);
        for (RevisionItem item : items) {
            try {
                emailService.sendReminder(item);
                item.setNotified(true);  
                repository.save(item);
            } catch (Exception e) {
                System.out.println(" Failed to send reminder to " + item.getEmail() + ": " + e.getMessage());
            }
        }
    }
}
