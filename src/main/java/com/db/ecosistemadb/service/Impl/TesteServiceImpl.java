package com.db.ecosistemadb.service.Impl;

import com.db.ecosistemadb.model.Teste;
import com.db.ecosistemadb.repository.TesteRepository;
import com.db.ecosistemadb.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TesteServiceImpl implements TesteService {

    @Autowired
    private TesteRepository repository;

    public Teste save(Teste teste) {
        return repository.save(teste);
    }

    public Teste verUser(Integer id) {
        return null;
    }
}


