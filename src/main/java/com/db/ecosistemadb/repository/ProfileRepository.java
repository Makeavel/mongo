package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, Integer > {
}
