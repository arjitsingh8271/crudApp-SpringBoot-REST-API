package com.example.crudApp.Controller;

import com.example.crudApp.Repository.UserRepository;
import com.example.crudApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository repo;

    // Get all Users
    // localhost:8080/users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User> users = repo.findAll();
        return users;
    }

    // Get Users by id
    // localhost:8080/users/1221
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        User user = repo.findById(id).get();
        return user;
    }

    // Create User
    // localhost:8080/users/add
    @PostMapping("/users/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
        repo.save(user);
    }

    // Update User
    // localhost:8080/users/update/1224
    @PutMapping("/users/update/{id}")
    public User updateUser(@PathVariable int id) {
        User user = repo.findById(id).get();
        user.setName("Shitu");
        repo.save(user);
        return user;
    }

    // Delete User
    // localhost:8080/users/delete/1222
    @DeleteMapping("/users/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = repo.findById(id).get();
        repo.delete(user);
    }
}
