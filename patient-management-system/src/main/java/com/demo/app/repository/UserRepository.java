package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.app.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
