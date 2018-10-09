package com.eri.productAnalysis.portal.service;

import com.eri.productAnalysis.portal.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getUsers();

    User getUserById(String userId);

    void addNewUser(User user);
}
