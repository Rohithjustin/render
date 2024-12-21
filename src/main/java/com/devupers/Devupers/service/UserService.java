package com.devupers.Devupers.service;

import com.devupers.Devupers.model.UserModel;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public interface UserService {
    UserModel createDetail(UserModel detail);
}
