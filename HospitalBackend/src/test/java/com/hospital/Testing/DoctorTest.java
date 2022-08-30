package com.hospital.Testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hospital.Controller.DoctorController;
import com.hospital.Repository.DoctorRepository;
import com.hospital.entity.Doctor;

@WebMvcTest(DoctorController.class)
public class DoctorTest {
@MockBean
private DoctorRepository doctorrepository;

@Autowired
private MockMvc mockMvc;

@Autowired
private ObjectMapper objectmapping;

@Test
void shouldCreateDoctor() {
	
}
}
