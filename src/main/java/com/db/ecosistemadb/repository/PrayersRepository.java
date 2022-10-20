package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Prayer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrayersRepository extends MongoRepository<Prayer , String> {
}
