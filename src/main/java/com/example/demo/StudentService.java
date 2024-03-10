package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	//List<Student> studentList = new ArrayList(Arrays.asList(new Student("1","Sankar","Maths"),new Student("2","Bavesh","Science")));
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getStudentDetails()
	{
				
		return (List<Student>) studentRepo.findAll();
	}
	
	
	/*public Optional<Student> getStudentById(String id)
	{
				
		
		return studentRepo.findById(id);
	}*/
	
	
	public void addStudent(Student student)
	{
				
		studentRepo.save(student);
	}
	
	public void updateStudent(String id,Student student1)
	{
		studentRepo.save(student1);
	}
	
	public void deleteStudent(String id)
	{
				
		studentRepo.deleteById(id);
	}

}
