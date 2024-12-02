package com.arun.department_service.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
//@AllArgsConstructor
public class MessageController {

//    @Value("${spring.boot.message}")
//    private String welcomeMessage;
//    @GetMapping
//    public String getMessage(){
//        return "Hello from Department Service" + welcomeMessage;
//    }
}
