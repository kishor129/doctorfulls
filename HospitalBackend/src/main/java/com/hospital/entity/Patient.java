package com.hospital.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long patientId;
	@Column
	private String name;
	@Column
	private long visitedDoctor;
	@Column
	private LocalDate visitedDate;
	
	
	public Patient(Long patientId, String name, long  visitedDoctor, LocalDate visitedDate) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.visitedDate = visitedDate;
	}
	
	public Patient() {
		super();
	}

	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(long  visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public LocalDate getVisitedDate() {
		return visitedDate;
	}
	public void setVisitedDate(LocalDate visitedDate) {
		this.visitedDate = visitedDate;
	}
	
}
