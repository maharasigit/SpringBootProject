package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerOld {
	
	@Autowired
	private StudentService studentService;
	
	/*@RequestMapping(value="/getAllStudents",method=RequestMethod.GET)
	public List<Student> getStudentDetails()
	{
		
		return studentService.getStudentDetails();
	}*/
	
	/*@RequestMapping(value="/getStudentById/{id}",method=RequestMethod.GET)
	public Student getStudentDetails(@PathVariable String id)
	{
		
		return studentService.getStudentById(id);
	}*/

	
	/*@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public void addStudentDetail(@RequestBody Student student)
	{
		 studentService.addStudent(student);
	}
	
	
	@RequestMapping(value="/updateStudent/{id}",method=RequestMethod.PUT)
	public void updateStudentDetail(@RequestBody Student student,@PathVariable String id)
	{
		studentService.updateStudent(id,student);
	}
	
	@RequestMapping(value="/deleteStudent/{id}",method=RequestMethod.DELETE)
	public void deleteStudentDetail(@PathVariable String id)
	{
		studentService.deleteStudent(id);
	}*/
}
