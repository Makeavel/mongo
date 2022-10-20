package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Office;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficesRepository extends MongoRepository<Office , String> {
}
