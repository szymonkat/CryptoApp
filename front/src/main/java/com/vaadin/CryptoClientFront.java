package com.vaadin;

import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableVaadin
@SpringBootApplication
public class CryptoClientFront extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CryptoClientFront.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(CryptoClientFront.class);
    }
}