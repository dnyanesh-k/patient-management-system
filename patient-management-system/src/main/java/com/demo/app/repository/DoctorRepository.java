package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
