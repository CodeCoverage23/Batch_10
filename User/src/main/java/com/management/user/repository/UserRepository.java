package com.management.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.user.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
