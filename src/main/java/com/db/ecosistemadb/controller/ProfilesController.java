package com.db.ecosistemadb.controller;


import com.db.ecosistemadb.model.Profile;
import com.db.ecosistemadb.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/eco")
public class ProfilesController {

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping("/profiles")
    public Profile createProfiles(@RequestBody Profile id){
        return profileRepository.save(id);
    }
}
