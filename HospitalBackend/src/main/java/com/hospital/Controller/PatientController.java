package com.hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.Service.HospitalService;
import com.hospital.entity.Patient;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private HospitalService hospitalservice;
	@PostMapping("")
	public Patient save(@RequestBody Patient patient) {
		return hospitalservice.savepatient(patient);
	}
	
	@GetMapping("")
	public List<Patient> findAll() {
		return hospitalservice.findAllPatients();
	}

	@GetMapping("/{id}")
	public Patient findByName(@PathVariable Long  id) {
		return hospitalservice.findPateintById(id);
	}
	
}
