package com.velalar.staffms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.velalar.staffms.model.StaffCollection;

public interface StaffRepo extends MongoRepository<StaffCollection, Integer> {

}
