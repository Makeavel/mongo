package com.db.ecosistemadb.service;

import com.db.ecosistemadb.model.Profile;
import com.db.ecosistemadb.model.User;
import com.db.ecosistemadb.repository.ProfileRepository;
import com.db.ecosistemadb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public User save(User user) {

        Profile profile = this.profileRepository.findById(user.getProfile().getId())
                .orElseThrow(() -> new IllegalArgumentException("Inexistente"));

        user.setProfile(profile);

        return this.userRepository.save(user);
    }

    @Override
    public User verUser(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Inexistente"));
    }
}
