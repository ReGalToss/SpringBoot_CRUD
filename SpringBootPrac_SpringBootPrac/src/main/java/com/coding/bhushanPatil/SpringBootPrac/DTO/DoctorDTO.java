package com.coding.bhushanPatil.SpringBootPrac.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
	
	private int id;
	private String name;
	private String department;

}
