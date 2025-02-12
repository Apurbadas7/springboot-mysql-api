package com.AD.LoginApplication.Repository;


import com.AD.LoginApplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepo extends JpaRepository<User,Integer> {
}
