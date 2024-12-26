package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.entities.Prescription;
import com.demo.app.service.AppointmentService;
import com.demo.app.service.PrescriptionService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private PrescriptionService prescriptionService;

	@Autowired
	private AppointmentService appointmentService;

	@PostMapping("/prescriptions")
	public ResponseEntity<?> createPrescription(@RequestBody Prescription prescription) {

		return ResponseEntity.status(HttpStatus.CREATED).body(prescriptionService.createPrescription(prescription));
	}

	@GetMapping("/appointments/{doctorId}")
	public ResponseEntity<?> getAppointmentsByDoctorId(@PathVariable Long doctorId) {
		return ResponseEntity.ok(appointmentService.getAppointmentsByDoctorId(doctorId));
	}
	
	@GetMapping("/appointments/{id}")
	public ResponseEntity<?> markAppointmentAsComplete(@PathVariable Long appointmentId){
		return ResponseEntity.ok(appointmentService.markAppointmentAsComplete(appointmentId));
	}

}
