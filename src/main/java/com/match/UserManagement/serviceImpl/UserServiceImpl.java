package com.match.UserManagement.serviceImpl;

import com.match.UserManagement.model.User;
import com.match.UserManagement.repository.UserRepository;
import com.match.UserManagement.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public ResponseEntity<?> registerUser(User user) throws Exception {
        try {
            userRepository.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("User Succesfully Registered !!");
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public ResponseEntity<?> getAll() throws Exception {
        try {
            List<User> allUsers = userRepository.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(allUsers);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    /**
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public ResponseEntity<?> getById(String userId) throws Exception {
        try {
            Optional<User> user = userRepository.findById(Long.parseLong(userId));
            return ResponseEntity.status(HttpStatus.OK).body(user);
        } catch (Exception e) {
            throw new Exception();
        }
    }


}
