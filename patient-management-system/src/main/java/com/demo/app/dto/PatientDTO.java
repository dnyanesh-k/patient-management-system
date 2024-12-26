package com.demo.app.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
	
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String contactNumber;
	private String gender;
	private String address;
	private Long userId;

}
