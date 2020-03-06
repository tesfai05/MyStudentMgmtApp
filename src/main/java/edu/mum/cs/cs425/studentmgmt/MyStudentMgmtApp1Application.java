package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.dao.IClassroom;
import edu.mum.cs.cs425.studentmgmt.dao.IStudent;
import edu.mum.cs.cs425.studentmgmt.dao.ITranscript;
import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;

@SpringBootApplication
public class MyStudentMgmtApp1Application implements CommandLineRunner{
	
//	@Autowired
//	private IClassroom classRepo;
	@Autowired
	private IStudent studentRepo;
//	@Autowired
//	private ITranscript transcriptRepo;
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtApp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Classroom classroom=new Classroom("McLaughlin building", "M218");
		Transcript transcript1=new Transcript("BS Computer Science");
		Student student1=new Student("000-12-0444", "George", "G.","David", 3.60,
				LocalDate.of(2010, 11, 28));
		transcript1.addStudent(student1);
		Student student2=new Student("000-12-0124", "Smith","", "Galverston", 4.00,
				LocalDate.of(2010, 11, 28));
		Transcript transcript2=new Transcript("MS Computer Science");
		transcript2.addStudent(student2);
		classroom.addStudent(student1);
		classroom.addStudent(student2);
		saveStudent(student1);
		saveStudent(student2);
	}
	public void saveStudent(Student std) {
		studentRepo.save(std);
	}

}
