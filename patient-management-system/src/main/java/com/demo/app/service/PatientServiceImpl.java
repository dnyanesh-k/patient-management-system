package com.demo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Patient;

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public ApiResponse createPatient(Patient patient) {

		Patient newPatient = patientRepository.save(patient);
		return new ApiResponse("Patient created with id:" + newPatient.getId());
	}

}
