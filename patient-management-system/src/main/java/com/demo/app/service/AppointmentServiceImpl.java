package com.demo.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Appointment;
import com.demo.app.entities.AppointmentStatus;
import com.demo.app.repository.AppointmentRepository;
import com.demo.app.repository.PatientRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Optional<Appointment> getAppointmentsByDoctorId(Long doctorId) {
		return appointmentRepository.findByDoctorId(doctorId);
	}

	@Override
	public ApiResponse markAppointmentAsComplete(Long appointmentId) {

		Appointment appointment  = appointmentRepository.findById(appointmentId)
				.orElseThrow(() -> new RuntimeException("Apointment not found"));

		appointment.setStatus(AppointmentStatus.COMPLETED);
		Appointment newAppointment = appointmentRepository.save(appointment);

		return new ApiResponse("Appointment with id" + newAppointment.getId() + " is completed Successfully!!");
	}

	@Override
	public Optional<Appointment> getAppointmentsByPatientId(Long patientId) {
 
		return appointmentRepository.findByPatientId(patientId);
	}

	@Override
	public ApiResponse bookAppointment(Appointment appointment) {
		Appointment newAppointment = appointmentRepository.save(appointment); 
		return new ApiResponse("Appointment with id :"+newAppointment.getId()+" booked successfully!!");
	}

	@Override
	public ApiResponse cancleAppointment(Long appointmentId) {
		Appointment appointment = appointmentRepository.findById(appointmentId)
				.orElseThrow(()-> new RuntimeException("Appointment not found"));
		
		appointment.setStatus(AppointmentStatus.CANCELLED);
		
		Appointment newAppointment = appointmentRepository.save(appointment);
		return new ApiResponse("Appointment with id"+newAppointment.getId()+"cancelled successfully!!");
	}

}
