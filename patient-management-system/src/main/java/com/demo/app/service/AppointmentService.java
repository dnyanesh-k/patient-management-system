package com.demo.app.service;

import java.util.Optional;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Appointment;

public interface AppointmentService {

	Optional<Appointment> getAppointmentsByDoctorId(Long doctorId);

	ApiResponse markAppointmentAsComplete(Long appointmentId);

	Optional<Appointment> getAppointmentsByPatientId(Long patientId);

	ApiResponse bookAppointment(Appointment appointment);

	Object cancleAppointment(Long appointmentId);

}
