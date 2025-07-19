package com.shwetashaw.revisionhelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class RevisionHelperApplication {
    public static void main(String[] args) {
        SpringApplication.run(RevisionHelperApplication.class, args);
    }
}