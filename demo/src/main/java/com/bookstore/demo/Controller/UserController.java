package com.bookstore.demo.Controller;


import com.bookstore.demo.Services.UserService;
import com.bookstore.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class UserController {

//initial commit

    @Autowired
    UserService userService;
    @PostMapping("/user")
    public ResponseEntity<?> register(@RequestBody User user){
        userService.registerAUser(user);
        return ResponseEntity.ok().body(user);
    }
    @GetMapping("/user")
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> delete(@PathVariable()long id) {
        userService.delete(id);
        return ResponseEntity.ok().body("İşlem Tamamlandı.");

    }

}
