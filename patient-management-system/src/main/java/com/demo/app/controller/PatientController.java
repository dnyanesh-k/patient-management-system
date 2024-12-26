package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.entities.Appointment;
import com.demo.app.service.AppointmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/patients")
public class PatientController{

	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping("/appointments")
	public ResponseEntity<?> getAppointmentsByPatientId(@PathVariable Long patientId) {
		return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.getAppointmentsByPatientId(patientId));
	}
	
	@PostMapping("/appointment")
	public ResponseEntity<?> bookAppointment(@RequestBody Appointment appointment){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.bookAppointment(appointment));
	}
	
	@PostMapping("/appointments/{appointmentId}")
	public ResponseEntity<?> cancleAppointment(@PathVariable Long appointmentId){
		return ResponseEntity.ok(appointmentService.cancleAppointment(appointmentId));
	}
	
}
