package com.demo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.dto.PatientDTO;
import com.demo.app.entities.Patient;
import com.demo.app.entities.User;
import com.demo.app.repository.PatientRepository;
import com.demo.app.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public ApiResponse createPatient(PatientDTO patientDTO) {
		
		User user = userRepository.findById(patientDTO.getUserId())
				.orElseThrow(()-> new RuntimeException("Patient not found."));
		
		
		Patient patient = new Patient();
		patient.setFirstName(patientDTO.getFirstName());
		patient.setLastName(patientDTO.getLastName());
		patient.setDateOfBirth(patientDTO.getDateOfBirth());
		patient.setContactNumber(patientDTO.getContactNumber());
		patient.setGender(patientDTO.getGender());
		patient.setAddress(patientDTO.getAddress());
		patient.setUser(user);
		
		Patient newPatient = patientRepository.save(patient);
		return new ApiResponse("Patient created with id:" + newPatient.getId());
	}

}
