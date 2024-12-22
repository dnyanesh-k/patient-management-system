package com.demo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Appointment;
import com.demo.app.entities.AppointmentStatus;
import com.demo.app.repository.AppointmentRepository;

public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private  AppointmentRepository appointmentRepository;
	
	@Override
	public Optional<Appointment> getAppointments(Long doctorId) {
		return appointmentRepository.findById(doctorId);
	}

	
	@Override
	public ApiResponse markAppointmentAsComplete(Long appointmentId) {
		
		Appointment appointment =  appointmentRepository.findById(appointmentId)
				.orElseThrow(()-> new RuntimeException("Apointment not found"));
		
		appointment.setStatus(AppointmentStatus.COMPLETED);
		Appointment newAppointment = appointmentRepository.save(appointment);
		
		return new ApiResponse("Appointment with id"+ newAppointment.getId() +"completed Successfully!!");
	}

}
