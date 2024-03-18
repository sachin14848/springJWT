package com.messaging.springjwt.controller;

import com.messaging.springjwt.modal.User;
import com.messaging.springjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/app/v1")
public class HomeController {

    @Autowired
    private UserService userService;



    @RequestMapping("/users")
    public List<User> getUsers(){
        System.out.println("USERS");
        return this.userService.getUsrs();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
