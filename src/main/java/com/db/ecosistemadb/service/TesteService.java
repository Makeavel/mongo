package com.db.ecosistemadb.service;

import com.db.ecosistemadb.model.Teste;
import com.db.ecosistemadb.model.User;
import com.db.ecosistemadb.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface TesteService {


    Teste save(Teste teste) ;

    Teste verUser(Integer id) ;

}

