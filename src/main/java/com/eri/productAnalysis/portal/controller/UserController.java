package com.eri.productAnalysis.portal.controller;

import com.eri.productAnalysis.portal.dal.dao.UserRepository;
import com.eri.productAnalysis.portal.model.User;
import com.eri.productAnalysis.portal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Controller
@Path("/user")
public class UserController {

    @Inject
    UserService userService;

    private final Logger LOG= LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    public UserController (UserRepository userRepository){
        this.userRepository= userRepository;
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers(){
        List<User> users = userService.getUsers();
        LOG.info ("Getting all users.");
        System.out.println("Output");
        return Response.ok(users).build();
    }



    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
      public Response getUser(@PathParam("userId") String userId){
        LOG.info("Getting user with ID: {}.", userId);
        User user = userService.getUserById(userId);
        return Response.ok(user).build();
    }

    @POST
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewUsers (@RequestBody User user){
        LOG.info("Saving user.");
        userService.addNewUser(user);
        return Response.ok(user).build();
    }


}
