package com.db.ecosistemadb.controller;

import com.db.ecosistemadb.model.User;
import com.db.ecosistemadb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/eco")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User createProfiles(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/view/{id}")
    public User verPerfil(@PathVariable Integer id){
        return userService.verUser(id);
    }
}
