package com.example.myJavaDemo.service;

import com.example.myJavaDemo.model.User;

public class DataServiceImpl implements DataService {

    @Override
    public User retrieveAllData() {
        User user = new User();
        user.setId(3);
        user.setName("Mack");
        user.setTeamName("BA");
        user.setSalary(10000);
        return user;
    }
}
