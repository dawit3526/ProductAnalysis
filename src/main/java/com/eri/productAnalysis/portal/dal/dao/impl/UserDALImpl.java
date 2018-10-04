package com.eri.productAnalysis.portal.dal.dao.impl;

import com.eri.productAnalysis.portal.dal.dao.UserDAL;
import com.eri.productAnalysis.portal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDALImpl implements UserDAL {


    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public List<User> getAllUsers() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User getUserById(String userId) {
        return null;
    }

    @Override
    public User addNewUser(User user) {
        return null;
    }

    @Override
    public Object getAllUserSettings(String userId) {
        return null;
    }

    @Override
    public String getUserSetting(String userId, String key) {
        return null;
    }

    @Override
    public String addUserSetting(String userId, String key, String value) {
        return null;
    }
}
