package com.demo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Doctor;
import com.demo.app.entities.Prescription;
import com.demo.app.repository.DoctorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}
	
	@Override
	public ApiResponse createDoctor(Doctor doctor) {
		
		Doctor newDoctor = doctorRepository.save(doctor);
		return new ApiResponse("Doctor created with id:"+newDoctor.getId());
	}

	

}
