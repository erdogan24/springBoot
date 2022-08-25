package com.bookstore.demo.Services;

import com.bookstore.demo.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUser();
    void delete(long id);
    User registerAUser(User user);
}
