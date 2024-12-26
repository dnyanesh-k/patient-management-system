package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.dto.PatientDTO;
import com.demo.app.entities.Doctor;
import com.demo.app.entities.Patient;
import com.demo.app.service.DoctorService;
import com.demo.app.service.PatientService;
import com.demo.app.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private UserService userService;

	@Autowired
	private PatientService patientService;

	@Autowired
	private DoctorService doctorService;

	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@GetMapping("/doctors")
	public ResponseEntity<?> getAllDoctors() {
		return ResponseEntity.ok(doctorService.getAllDoctors());
	}

	@GetMapping("/patients")
	public ResponseEntity<?> getAllPatients() {
		return ResponseEntity.ok(patientService.getAllPatients());
	}

	@PostMapping("/patient")
	public ResponseEntity<?> createPatient(@RequestBody PatientDTO patient) {
		return ResponseEntity.status(HttpStatus.CREATED).body(patientService.createPatient(patient));
	}
	
	@PostMapping("/doctor")
	public ResponseEntity<?> createDoctor(@RequestBody Doctor doctor) {
		return ResponseEntity.status(HttpStatus.CREATED).body(doctorService.createDoctor(doctor));
	}

}
