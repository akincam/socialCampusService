package com.akincam.app.socialcampus.controller;
import com.akincam.app.socialcampus.model.UserEntity;
import com.akincam.app.socialcampus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/users")
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> getUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/getUser")
    public UserEntity getUser(String name){
        return userService.getUserByName(name);
    }

    @PostMapping
    public void registerUser(@RequestBody  UserEntity userEntity){
        userService.saveUser(userEntity);
    }

}
