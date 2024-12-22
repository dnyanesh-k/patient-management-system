package com.demo.app.service;

import java.util.List;

import com.demo.app.dto.ApiResponse;
import com.demo.app.entities.Doctor;
import com.demo.app.entities.Prescription;

public interface DoctorService {

	List<Doctor> getAllDoctors();

	ApiResponse createDoctor(Doctor doctor);

}
