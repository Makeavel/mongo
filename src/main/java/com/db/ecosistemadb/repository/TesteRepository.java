package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Teste;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends MongoRepository<Teste, Integer> {
}
