package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.entities.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {

}
