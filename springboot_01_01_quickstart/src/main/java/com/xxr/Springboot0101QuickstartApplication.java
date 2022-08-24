package com.xxr;

import com.xxr.controller.BookController;
import com.xxr.controller.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ct = SpringApplication.run(Springboot0101QuickstartApplication.class, args);
        System.out.println(ct.getBean(User.class));
        System.out.println(ct.getBean(BookController.class));
    }

}
