package com.cjc.springbootcrudapp.servicei;

import java.util.List;
import java.util.Optional;

import com.cjc.springbootcrudapp.model.Student;


public interface StudentServiceI {


	public void saveStudent(Student s);

	public List<Student> loginStudent(String username, String password);

	public List<Student> deleteStudent(int id);

	public Student editStudent(int id);

	public List<Student> updateStudent(Student s);

}
