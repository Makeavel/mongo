package com.db.ecosistemadb.controller;


import com.db.ecosistemadb.model.Profiles;
import com.db.ecosistemadb.repository.ProfilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/eco")
public class ProfilesController {

    @Autowired
    private ProfilesRepository profilesRepository;

    @PostMapping("/profiles")
    public Profiles createProfiles(@RequestBody Profiles id){
        return profilesRepository.save(id);
    }
}
