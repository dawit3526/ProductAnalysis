package com.eri.productAnalysis.portal.controller;

import com.eri.productAnalysis.portal.dal.dao.UserRepository;
import com.eri.productAnalysis.portal.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="/")
public class UserController {

    private final Logger LOG= LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    public UserController (UserRepository userRepository){
        this.userRepository= userRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers(){

        LOG.info ("Getting all users.");
        System.out.println("Output");
        return userRepository.findAll();
    }


    @RequestMapping (value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable String userId){

        LOG.info("Getting user with ID: {}.", userId);

       // return userRepository.findOne(userId);
        return null;
    }


    @RequestMapping(value="/create", method = RequestMethod.POST)
    public @ResponseBody User addNewUsers (@RequestBody User user){
        LOG.info("Saving user.");
        return userRepository.save(user);
    }


}
