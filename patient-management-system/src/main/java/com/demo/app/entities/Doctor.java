package com.demo.app.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "doctors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends BaseEntity {

	@Column(nullable = false,length = 15)
	private String firstName;
	
	@Column(nullable = false,length = 15)
	private String lastName;
	
	@Column(nullable = false,length = 100)
	private String specialization;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Availability availability;
	
	private Double rating;
	
	@OneToOne
	@JoinColumn(name="user_id",nullable = false)
	private User user;
	
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
	private List<Appointment> appointments;
	
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
	private List<Prescription> prescriptions;
	
	@OneToMany(mappedBy = "doctor",cascade =CascadeType.ALL )
	private List<Feedback> feedback;
	
	
	
}
