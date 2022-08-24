package com.xxr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName BookController
 * Description  TODO
 *
 * @author Mr_X
 * @version 1.0
 * @date 2022/8/9 16:42
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("springboot3 is running");
        return "springboot is running return ";
    }
}
