package com.devupers.Devupers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devupers.Devupers.model.UserModel;
import com.devupers.Devupers.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel createDetail(UserModel detail) {
        return userRepository.save(detail);
    }
}
