package com.match.UserManagement.service;

import com.match.UserManagement.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> registerUser(User user) throws Exception;
}
