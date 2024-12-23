package com.devupvers.App.Service;
import com.devupvers.App.Model.UserModel;
import com.devupvers.App.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel createDetail(UserModel detail) {
        return userRepository.save(detail);
    }
}