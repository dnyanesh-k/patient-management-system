package com.demo.app.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDTO {
	//used during serialization.
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime creationDateTime;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime updationTimeStamp;

}
