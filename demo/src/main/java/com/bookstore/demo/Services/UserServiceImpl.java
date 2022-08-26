package com.bookstore.demo.Services;

import com.bookstore.demo.Repository.UserRepository;
import com.bookstore.demo.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LogManager.getLogger(UserServiceImpl.class);

    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        log.info("Tüm userler çağrıldı");
        return userRepository.findAll();
    }

    @Override
    public void delete(long id) {
        log.info(id +" id ' li user silindi ! ");
        userRepository.deleteById(id);
    }

    @Override
    public User registerAUser(User user) {
        log.info("User kaydı yapıldı.!"+user.toString());
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        log.info(" User güncelendi.!"+user.toString());
        return userRepository.save(user);
    }
}
