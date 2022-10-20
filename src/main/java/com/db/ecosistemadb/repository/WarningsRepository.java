package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Warning;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarningsRepository extends MongoRepository<Warning , String> {
}
