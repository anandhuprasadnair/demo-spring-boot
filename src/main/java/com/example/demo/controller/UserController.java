package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/{userId}")
    public String getUserName(@PathVariable("userId") String userId){
        log.info("Provided user id: {}", userId);
        return "Dummy username";
    }

}
