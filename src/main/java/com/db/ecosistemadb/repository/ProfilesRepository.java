package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfilesRepository extends MongoRepository<Profile, Integer > {
}
