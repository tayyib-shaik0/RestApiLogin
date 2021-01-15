package com.io.login.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.login.restapi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
