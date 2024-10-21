package com.coding.bhushanPatil.SpringBootPrac.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.bhushanPatil.SpringBootPrac.DTO.DoctorDTO;
import com.coding.bhushanPatil.SpringBootPrac.Entity.DoctorEntity;
import com.coding.bhushanPatil.SpringBootPrac.Repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository Repo;
	
	@Autowired
	ModelMapper Mapper;
	
	
	public DoctorDTO getdoctorbyID(Long ID) {
		DoctorEntity DE = Repo.getById(ID);
		return Mapper.map(DE, DoctorDTO.class);
	}
	
		
	public DoctorDTO createNewDoctorProfile(DoctorDTO DDTO) {
		DoctorEntity DE = Mapper.map(DDTO, DoctorEntity.class);
		return Mapper.map(Repo.save(DE), DoctorDTO.class);
	}
	
	
	
	public void deleteDoctorProfilebyId(Long Doc_id) {
		Repo.deleteById(Doc_id);
		
		
		
	
	}
		
		
}
	

