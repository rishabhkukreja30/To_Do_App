package com.example.firstwebapp.todoapp.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! How are you?";
    }

    @RequestMapping("/hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
