package com.AD.LoginApplication.Service;
import com.AD. LoginApplication. Entity. User;
import org.springframework.stereotype.Service;

@Service
public interface UserService02 {
    public String UserData(User user);
    public User getUser(User user);



}
