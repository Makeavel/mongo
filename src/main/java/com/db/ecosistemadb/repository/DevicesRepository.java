package com.db.ecosistemadb.repository;

import com.db.ecosistemadb.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends MongoRepository<Device , String> {
}
