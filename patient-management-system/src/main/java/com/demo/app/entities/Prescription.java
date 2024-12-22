package com.demo.app.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "prescriptions")
public class Prescription extends BaseEntity{

	@Column(length = 100)
	private String medicationName;//names of medication
	
	@Column(length = 50)
    private String dosage; //how much quantity 5ml,10ml,etc
	
	@Column(length = 15)
    private String frequency; //no of times to be taken
	
    private LocalDate issueDate;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id",nullable = false)
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "patient_id",nullable = false)
	private Patient patient;
}
