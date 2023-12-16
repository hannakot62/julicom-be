package com.hannakot62.be.service;

import com.hannakot62.be.model.Users;
import com.hannakot62.be.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users saveUser(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUserById(String id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public void deleteUserById(String id) {
        usersRepository.deleteById(id);
    }
}
