package com.match.UserManagement.controller;

import com.match.UserManagement.model.User;
import com.match.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "register")
    ResponseEntity<?> registedUser(@RequestBody User user) throws Exception {
        try {
            return userService.registerUser(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected Error.");
        }
    }

    @GetMapping(path = "getall")
    ResponseEntity<?> getAll() {
        try{
            return userService.getAll();
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Could not find data.");
        }
    }

    @GetMapping(path = "searchbyid")
    ResponseEntity<?> searchById(@RequestParam(name = "userId" , required = false) String userId) {
        try{
            return userService.getById(userId);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Could not User of this Id");
        }
    }
}
