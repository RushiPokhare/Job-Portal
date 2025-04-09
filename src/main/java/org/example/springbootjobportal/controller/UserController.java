package org.example.springbootjobportal.controller;


import lombok.AllArgsConstructor;
import org.example.springbootjobportal.model.Users;
import org.example.springbootjobportal.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public List<Users> getAllUsers(){
        return userService.getAllusers();
    }

    @GetMapping(value = "/user/{id}", produces = "application/json") //<-- produces used to View data in JSON Format
    public Users getUserById(@PathVariable int id){
        return userService.getById(id);
    }

    @DeleteMapping("/user/{id}")  //
    public void deleteUserById(@PathVariable int id) {
        userService.deleteById(id);
    }

    @DeleteMapping("/user/all")
    public void deleteAll() {
        userService.deleteAll();
    }

    @PostMapping("/user")
    public Users save(@RequestBody Users users) {
        return userService.save(users);
    }

    @PutMapping("/user")
    public Users update(@RequestBody Users users) {  //<--@RequestBody  means when  I post the data through the postman at that time need the annotation.
        return userService.update(users);
    }
}
