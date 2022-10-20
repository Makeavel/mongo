package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users , Integer> {
}
