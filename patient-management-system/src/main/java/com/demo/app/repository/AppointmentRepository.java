package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.app.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
