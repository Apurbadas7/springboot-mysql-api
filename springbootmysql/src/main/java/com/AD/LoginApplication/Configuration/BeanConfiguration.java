package com.AD.LoginApplication.Configuration;

import com.AD.LoginApplication.DTO.RequestDTO;
import com.AD.LoginApplication.Service.UserService;
import com.AD.LoginApplication.Service.UserService02;
import com.AD.LoginApplication.Service.UserService2;
import com.AD.LoginApplication.Service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    UserService getUserService1(){
        return new UserServiceImpl();
    }
    @Bean
     UserService02 getUserService2(){
        return new UserService2();
    }

    @Bean
    RequestDTO getRequest(){
        return new RequestDTO();
    }
}
