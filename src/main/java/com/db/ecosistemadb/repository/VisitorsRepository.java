package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Visitor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorsRepository extends MongoRepository<Visitor, String> {
}
