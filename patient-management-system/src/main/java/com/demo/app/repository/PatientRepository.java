package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.app.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}