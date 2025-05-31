package com.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternController {

    @GetMapping
    public ResponseEntity<?> test(){
        return new ResponseEntity<>("lấy thành công 1", HttpStatus.OK);
    }

}
