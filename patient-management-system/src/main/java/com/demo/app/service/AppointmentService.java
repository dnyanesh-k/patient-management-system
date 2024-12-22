package com.demo.app.service;

import java.util.Optional;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Appointment;

public interface AppointmentService {

	Optional<Appointment> getAppointments(Long doctorId);

	ApiResponse markAppointmentAsComplete(Long appointmentId);

}
