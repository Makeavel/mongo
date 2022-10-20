package com.db.ecosistemadb.service;

import com.db.ecosistemadb.model.User;
import com.db.ecosistemadb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository userRepository;

    @Override
    public User save(User id) {

        User usuario = this.userRepository.findById(id.getIdNome().getId())
                .orElseThrow(() -> new IllegalArgumentException("Inexistente"));


        return this.userRepository.save(usuario);
    }
}
