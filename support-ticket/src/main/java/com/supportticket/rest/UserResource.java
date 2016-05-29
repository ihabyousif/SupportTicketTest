package com.supportticket.rest;

import com.supportticket.model.User;
import com.supportticket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/ListUsers", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> listAll(){

        return userRepository.findAll();
    }


}
