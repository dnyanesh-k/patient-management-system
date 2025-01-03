package com.demo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Prescription;
import com.demo.app.repository.PrescriptionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionRepository prescriptionRepository;
	@Override
	public ApiResponse createPrescription(Prescription prescription) {
		Prescription newPrescription = prescriptionRepository.save(prescription); 
		return new ApiResponse("Prescription created with id:"+newPrescription.getId());
	}
}
