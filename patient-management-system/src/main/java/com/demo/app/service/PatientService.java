package com.demo.app.service;

import java.util.List;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Patient;

public interface PatientService {

	List<Patient> getAllPatients();

	ApiResponse createPatient(Patient patient);

}
