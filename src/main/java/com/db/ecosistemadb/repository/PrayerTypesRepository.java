package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.PrayerType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrayerTypesRepository extends MongoRepository<PrayerType , String> {
}
