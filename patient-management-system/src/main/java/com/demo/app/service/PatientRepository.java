package com.demo.app.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
