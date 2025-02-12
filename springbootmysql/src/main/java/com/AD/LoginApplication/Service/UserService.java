package com.AD.LoginApplication.Service;

import com.AD.LoginApplication.DTO.RequestDTO;
import com.AD.LoginApplication.DTO.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public ResponseDTO doLogin(RequestDTO requests);



}
