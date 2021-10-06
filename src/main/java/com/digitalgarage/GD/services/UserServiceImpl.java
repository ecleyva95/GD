package com.digitalgarage.GD.services;

import com.digitalgarage.GD.entities.User;
import com.digitalgarage.GD.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {


    @Autowired
    @Qualifier("userRepo")
    IUserRepo iUserRepo;

    @Override
    public User createUser(User user) {
        user = iUserRepo.save(user);
        return user;
    }

}
