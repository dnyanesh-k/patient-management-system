package com.demo.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.dto.PatientDTO;
import com.demo.app.entities.Patient;

@Service

public interface PatientService {

	List<Patient> getAllPatients();

	ApiResponse createPatient(PatientDTO patientDTO);

}
