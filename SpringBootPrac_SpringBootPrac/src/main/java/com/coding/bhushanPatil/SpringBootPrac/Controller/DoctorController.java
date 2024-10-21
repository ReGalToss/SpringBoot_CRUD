package com.coding.bhushanPatil.SpringBootPrac.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coding.bhushanPatil.SpringBootPrac.DTO.DoctorDTO;
import com.coding.bhushanPatil.SpringBootPrac.Entity.DoctorEntity;
import com.coding.bhushanPatil.SpringBootPrac.Service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorService DS;
	
	@GetMapping(path="/doctor/{id}")
	public DoctorDTO getdoctorbyID(@PathVariable("id") Long doctorID) {
		return DS.getdoctorbyID(doctorID);
	}
	

	
	@PostMapping(path="/doctor")
	public DoctorDTO createNewDoctorProfile(@RequestBody DoctorDTO DDTO) {
		return DS.createNewDoctorProfile(DDTO);
	}
	
	
	@DeleteMapping(path="/doctors/{id}")
	public String deleteDoctorProfilebyId(@PathVariable("id") Long Doc_id) {
		DS.deleteDoctorProfilebyId(Doc_id);
		return "Entry Deleted";
	}

}
