package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.User;
import com.app.tddt4iots.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getUser() {
        List<User> listUser = userRepository.findAll();
        return ResponseEntity.ok(listUser);
    }

    @PostMapping
    public ResponseEntity<User> insertUser(@RequestBody User user) {
        User newUser = userRepository.save(user);
        return ResponseEntity.ok(newUser);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User upUser = userRepository.save(user);
        if (upUser != null) {
            return ResponseEntity.ok(upUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<User> deletePersons(@PathVariable("id") Long nombreDeUsuario) {
        userRepository.deleteById(nombreDeUsuario);
        return ResponseEntity.ok(null);
    }

}
