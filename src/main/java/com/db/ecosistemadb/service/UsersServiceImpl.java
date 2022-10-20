package com.db.ecosistemadb.service;

import com.db.ecosistemadb.model.Profiles;
import com.db.ecosistemadb.model.Users;
import com.db.ecosistemadb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository userRepository;

    @Override
    public Users save(Users id) {

        Users usuario = this.userRepository.findById(id.getIdNome().getId())
                .orElseThrow(() -> new IllegalArgumentException("Inexistente"));

        System.out.println(usuario);
        return this.userRepository.save(usuario);
    }
}
