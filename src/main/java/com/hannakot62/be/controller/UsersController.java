package com.hannakot62.be.controller;

import com.hannakot62.be.model.Users;
import com.hannakot62.be.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/add")
    public String add(@RequestBody Users users) {
        usersService.saveUser(users);
        return "New user added";
    }

    @GetMapping("/getAll")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById (@PathVariable String id){
        Users users = usersService.getUserById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable String id){
        usersService.deleteUserById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Users> updateUserById(@RequestBody Users users, @PathVariable String id){
        Users current = usersService.getUserById(id);
        usersService.saveUser(users);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
