package com.userservice.controller.intern;

import com.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<?> test(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

}
