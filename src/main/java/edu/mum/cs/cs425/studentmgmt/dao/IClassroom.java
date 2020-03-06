package edu.mum.cs.cs425.studentmgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;

public interface IClassroom extends JpaRepository<Classroom, Long>{
	
}
