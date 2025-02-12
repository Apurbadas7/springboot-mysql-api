package com.AD.LoginApplication.Controller;

import com.AD.LoginApplication.DTO.RequestDTO;
import com.AD.LoginApplication.DTO.ResponseDTO;
import com.AD.LoginApplication.Entity.User;
import com.AD.LoginApplication.Service.UserService;
import com.AD.LoginApplication.Service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private final UserService userService;
    @Autowired
    private UserService2 userService2;

    @Autowired
    public UserController( UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseDTO login(@RequestBody RequestDTO request) {
        return userService.doLogin(request);
    }
    @PostMapping("/adduser")
    public String InsertData(@RequestBody User user){
        return userService2.UserData(user);
    }
    @PostMapping("/getuserbyid")
    public User getUserById(@RequestBody User user) {
        return userService2.getUser(user);
    }
}

