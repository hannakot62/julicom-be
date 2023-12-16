package com.hannakot62.be.service;

import com.hannakot62.be.model.SpacePart;
import com.hannakot62.be.model.Users;

import java.util.List;

public interface UsersService {

    public Users saveUser (Users users);
    public List<Users> getAllUsers();
    public Users getUserById(String id);
    public void deleteUserById(String id);
}
