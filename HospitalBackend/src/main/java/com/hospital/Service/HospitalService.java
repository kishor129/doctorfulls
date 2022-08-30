package com.hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Repository.DoctorRepository;
import com.hospital.Repository.PatientRepository;
import com.hospital.entity.Doctor;
import com.hospital.entity.Patient;
@Service
public class HospitalService {
	@Autowired
private DoctorRepository doctorrepository;
	@Autowired
private PatientRepository patientrepository;
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorrepository.save(doctor);
	}
	public Patient savepatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientrepository.save(patient);
	}
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return doctorrepository.findAll();
	}
	public Doctor findById(long id) {
		// TODO Auto-generated method stub
		return doctorrepository.findById(id);}
	public List<Patient> findAllPatients() {
		// TODO Auto-generated method stub
		return patientrepository.findAll();
	}
	public Patient findPateintById(long id) {
		// TODO Auto-generated method stub
		return patientrepository.findById(id);
	}
}
