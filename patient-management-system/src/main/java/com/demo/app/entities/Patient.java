package com.demo.app.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends BaseEntity{
	
	@Column(nullable = false,length = 15)
	private String firstName;

	@Column(nullable = false,length = 15)
	private String lastName;
	
	@Column(nullable = false)
	private LocalDate dateOfBirth;
	
	@Column(nullable = false,length = 15)
	private String contactNumber;

	@Column(nullable = false)
	private String gender;	
	
	@Column(nullable = false,length = 100)
	private String address;
	
	@OneToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",nullable = false)
	private User user;
	
//	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
//    private List<Invoice> invoices;
//	

}
