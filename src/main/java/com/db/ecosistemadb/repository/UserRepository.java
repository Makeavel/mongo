package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
