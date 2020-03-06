package edu.mum.cs.cs425.studentmgmt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomId;
	private String buildingName;
	private String roomNumber;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "classroom")
	private List<Student> students=new ArrayList<>(); 
	public Classroom() {

	}
	
	public Classroom( String buildingName, String roomNumber) {
		
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void addStudent(Student std) {
		students.add(std);
		std.setClassroom(this);
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Long getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
}
