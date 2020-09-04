package com.service.impl;

import com.model.UserDetails;
import com.service.inf.UserDetailsinf;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsimpl {

    List<UserDetails> userDetailsList = new ArrayList<UserDetails>();
    UserDetails userdetails = new UserDetails();


    public void save() {
        userdetails.setId(1);
        userdetails.setLastname("lastname");
        userdetails.setName("Name");

    }

    public void add() {

    }

    public void update() {

    }

    public void delete() {

    }
}
