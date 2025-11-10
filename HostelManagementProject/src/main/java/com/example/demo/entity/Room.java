package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Room {
		
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String roomNumber;
	 private String roomType;  
	 private int availableVacancy;
	 private boolean occupied;
	 
	 @OneToMany(mappedBy = "room")
	 private List<Student> students;

	 public Long getId() {
		 return id;
	 }

	 public void setId(Long id) {
		 this.id = id;
	 }

	 public String getRoomNumber() {
		 return roomNumber;
	 }

	 public void setRoomNumber(String roomNumber) {
		 this.roomNumber = roomNumber;
	 }

	 public String getRoomType() {
		 return roomType;
	 }

	 public void setRoomType(String roomType) {
		 this.roomType = roomType;
	 }

	 public int getAvailableVacancy() {
		 return availableVacancy;
	 }

	 public void setAvailableVacancy(int availableVacancy) {
		 this.availableVacancy = availableVacancy;
	 }

	 public boolean isOccupied() {
		 return occupied;
	 }

	 public void setOccupied(boolean occupied) {
		 this.occupied = occupied;
	 }

	 public List<Student> getStudents() {
		 return students;
	 }

	 public void setStudents(List<Student> students) {
		 this.students = students;
	 }

}
