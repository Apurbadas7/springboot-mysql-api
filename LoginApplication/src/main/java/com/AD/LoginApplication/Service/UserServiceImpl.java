package com.AD.LoginApplication.Service;

import com.AD.LoginApplication.DTO.RequestDTO;
import com.AD.LoginApplication.DTO.ResponseDTO;
import com.AD.LoginApplication.Entity.User;
import com.AD.LoginApplication.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.AD.LoginApplication.Entity.User;

@Service
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    ResponseDTO response;



    @Override
    public ResponseDTO doLogin(RequestDTO request) {





        if (request.getEmail().equals("abc@gmail.com") && request.getPassword().equals("password")) {
            System.out.println("Login successful.");

            response.setName("Apurba");
            response.setEmail(request.getEmail());
            response.setBranch("CS");


            return response;
        }

        System.out.println("Login failed.");
        return response;
    }
}
