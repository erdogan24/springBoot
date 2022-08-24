package com.bookstore.demo.Services;

import com.bookstore.demo.Repository.UserRepository;
import com.bookstore.demo.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
