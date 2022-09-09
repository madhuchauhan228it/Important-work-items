package com.sunglowys.resource;

import com.sunglowys.domain.User;
import com.sunglowys.service.UserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {
    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User result = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/users")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User result = userService.update(user);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findAll(PageRequest.of(0,20));
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User result = userService.findOne(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
