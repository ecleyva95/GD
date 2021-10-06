package com.digitalgarage.GD.repositories;

import com.digitalgarage.GD.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepo")
public interface IUserRepo extends JpaRepository<User,Integer> {
}
