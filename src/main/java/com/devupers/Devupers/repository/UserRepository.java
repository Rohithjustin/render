package com.devupers.Devupers.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.devupers.Devupers.model.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String> {
}
