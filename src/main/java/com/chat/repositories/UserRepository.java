package com.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.entities.User;
import com.chat.repositories.UserRepositoryCustom;

public class UserRepository extends JpaRepository<User,Long>, UserRepositoryCustom{

}
