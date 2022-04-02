package com.pyxelart;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyxelart.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
