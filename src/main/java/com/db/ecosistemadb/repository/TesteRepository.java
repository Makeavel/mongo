package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Teste;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TesteRepository extends MongoRepository<Teste, Integer> {
}
