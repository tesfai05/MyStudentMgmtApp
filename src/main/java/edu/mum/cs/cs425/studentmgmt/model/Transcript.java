package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transcriptId;
	private String degreeTitle;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "transcript")
	private Student student;
	public Transcript() {
	
	}
	
	public Transcript(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	public void addStudent(Student std) {
		std.setTranscript(this);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getTranscriptId() {
		return transcriptId;
	}
	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
	

}
