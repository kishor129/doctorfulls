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
import com.hospital.entity.Doctor;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private HospitalService hospitalservice;
	@PostMapping("")
	public Doctor save(@RequestBody Doctor doctor) {
		System.out.println(doctor.getAge());
		return hospitalservice.saveDoctor(doctor);
	}
	
	@GetMapping("")
	public List<Doctor> findAll() {
		return hospitalservice.findAll();
	}

	@GetMapping("/{id}")
	public Doctor findById(@PathVariable Long id) {
		System.out.println(id);
		return hospitalservice.findById(id);
	}
	
}
