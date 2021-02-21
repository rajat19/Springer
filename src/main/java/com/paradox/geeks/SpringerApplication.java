package com.paradox.geeks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
public class SpringerApplication implements ApplicationRunner, CommandLineRunner {
    @Value("${spring.application.name:my_app}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(SpringerApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String name() {
        return name;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Hello World from Application Runner");
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello World from Command Line Runner");
    }
}
