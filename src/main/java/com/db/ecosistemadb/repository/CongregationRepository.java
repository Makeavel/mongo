package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Congregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongregationRepository extends MongoRepository<Congregation , String> {
}
