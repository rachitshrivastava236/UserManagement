package com.match.UserManagement.service;

import com.match.UserManagement.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> registerUser(User user) throws Exception;

     ResponseEntity<?> getAll() throws Exception;

    ResponseEntity<?> getById(String userId) throws Exception;

}
