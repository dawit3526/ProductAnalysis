package com.eri.productAnalysis.portal.service.impl;

import com.eri.productAnalysis.portal.dal.dao.impl.UserDALImpl;
import com.eri.productAnalysis.portal.model.User;
import com.eri.productAnalysis.portal.service.UserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    UserDALImpl userDAL;

    @Override
    public List<User> getUsers() {
        return userDAL.getAllUsers();
    }

    @Override
    public User getUserById(String userId) {
        return userDAL.getUserById(userId);
    }

    @Override
    public void addNewUser(User user) {
        userDAL.addNewUser(user);

    }

}
