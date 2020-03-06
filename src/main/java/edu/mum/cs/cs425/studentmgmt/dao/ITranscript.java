package edu.mum.cs.cs425.studentmgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs.cs425.studentmgmt.model.Transcript;

public interface ITranscript extends JpaRepository<Transcript, Long>{

}
