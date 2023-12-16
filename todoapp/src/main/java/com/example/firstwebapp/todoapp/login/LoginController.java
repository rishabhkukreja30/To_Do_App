package com.example.firstwebapp.todoapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

//    @RequestMapping("/login")
//    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//        model.put("name", name);
//        logger.info("Request parameter value is: {}", name);
//        return "login";
//    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name , @RequestParam String password ,ModelMap model) {
        model.put("name" ,name);
        model.put("password", password);
        return "welcome";
    }


}
