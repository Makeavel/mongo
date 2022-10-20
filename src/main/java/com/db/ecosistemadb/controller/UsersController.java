package com.db.ecosistemadb.controller;

import com.db.ecosistemadb.model.Users;
import com.db.ecosistemadb.repository.UsersRepository;
import com.db.ecosistemadb.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/eco")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    public Users createProfiles(@RequestBody Users id){
        return usersService.save(id);
    }
}
