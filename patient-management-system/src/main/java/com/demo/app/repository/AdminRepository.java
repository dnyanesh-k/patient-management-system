package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.entities.User;

public interface AdminRepository extends JpaRepository<User, Long> {

}
