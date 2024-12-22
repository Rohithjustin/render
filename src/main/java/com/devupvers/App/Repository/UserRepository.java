package com.devupvers.App.Repository;


import com.devupvers.App.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {
}
