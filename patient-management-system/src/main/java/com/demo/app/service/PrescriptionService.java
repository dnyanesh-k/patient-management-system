package com.demo.app.service;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Prescription;

public interface PrescriptionService {

	ApiResponse createPrescription(Prescription prescription);

}
