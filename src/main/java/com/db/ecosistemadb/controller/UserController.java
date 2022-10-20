package com.db.ecosistemadb.controller;

import com.db.ecosistemadb.model.User;
import com.db.ecosistemadb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/eco")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createProfiles(@RequestBody User id){
        return userService.save(id);
    }
}
