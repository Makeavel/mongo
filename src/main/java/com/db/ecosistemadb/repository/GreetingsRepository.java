package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Greeting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingsRepository extends MongoRepository<Greeting, String> {
}
