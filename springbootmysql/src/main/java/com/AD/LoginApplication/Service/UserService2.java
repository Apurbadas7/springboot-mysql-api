package com.AD.LoginApplication.Service;

import com.AD.LoginApplication.Entity.User;
import com.AD.LoginApplication.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService2 implements UserService02{

    @Autowired
    UserRepo userRepo;
    @Override
    public User getUser(User user) {

       User user1 = userRepo.getById(user.getId());
       user.setName(user1.getName());
        user.setBranch(user1.getBranch());
        user.setEmail(user1.getEmail());
        user.setPassword(user1.getPassword());




        return user;

    }



    User user=new User();
    @Override
    public String UserData(User user) {

        User user1=new User();

        user1.setName(user.getName());
        user1.setBranch(user.getBranch());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());

        userRepo.save(user1);



        return "Inserted";
    }





}
