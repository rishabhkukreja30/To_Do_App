package com.example.firstwebapp.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public Boolean authenticate(String username, String password) {
        Boolean isValidUsername = username.equalsIgnoreCase("rishabh");
        Boolean isValidPassword = password.equalsIgnoreCase("12345");

        return isValidUsername && isValidPassword;
    }
}
