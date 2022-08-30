package com.hospital;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hospital.Repository.DoctorRepository;
import com.hospital.Service.HospitalService;
import com.hospital.entity.Doctor;

@SpringBootTest
class HospitalBackendApplicationTests {
	@Autowired 
	private HospitalService hospitalservice;

@MockBean
private DoctorRepository doctorrepository;
@Test
public void getDoctorTest() {
	when(doctorrepository.findAll()).thenReturn((List<Doctor>) Stream.of(new Doctor(8,"kishor",22,"Male","head")));
	assertEquals(1,hospitalservice.findAll().size());
}
private void assertEquals(int i, int j) {
	// TODO Auto-generated method stub
	
}
@Test
public void addDoctorTest() {
	Doctor doctor=new Doctor(10,"keru",21,"male","bone");
	when(doctorrepository.save(doctor)).thenReturn(doctor);
//	assertEquals(doctor,hospitalservice.saveDoctor(doctor));
}
}

