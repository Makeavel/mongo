package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Profiles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfilesRepository extends MongoRepository<Profiles , Integer > {
}
