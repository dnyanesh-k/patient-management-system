package com.demo.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.app.entities.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	Optional<Appointment> findByDoctorId(Long doctorId);

	Optional<Appointment> findByPatientId(Long patientId);

}
