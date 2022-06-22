package com.kylexu.snippetgithubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class SnippetGithubActionApplication {


    @RequestMapping("/ping")
    public String ping() {
        String format = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        return "pong! " + format;
    }

    public static void main(String[] args) {
        SpringApplication.run(SnippetGithubActionApplication.class, args);
    }

}
