package com.coding.bhushanPatil.SpringBootPrac.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.bhushanPatil.SpringBootPrac.Entity.DoctorEntity;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

	//DoctorEntity delete(DoctorEntity dEN, Long doc_id);

}
