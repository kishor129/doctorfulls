package com.hospital.Repository;

import org.springframework.stereotype.Repository;

import com.hospital.entity.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DoctorRepository extends  JpaRepository<Doctor, Long > {

	Doctor findById(long id);

}