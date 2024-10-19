package com.cjc.springbootcrudapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springbootcrudapp.model.Student;
import com.cjc.springbootcrudapp.repository.StudentRepository;
import com.cjc.springbootcrudapp.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	StudentRepository sr;

	@Override
	public void saveStudent(Student s) {
		sr.save(s);
	}

	@Override
	public List<Student> loginStudent(String username, String password) {
		if (username.equals("admin") && password.equals("admin")) {
			List<Student> stu = (List<Student>) sr.findAll();
			return stu;
		} else {
			List<Student> stu = sr.findByUsernameAndPassword(username, password);
			return stu;
		}
	}

	@Override
	public List<Student> deleteStudent(int id) {
		 sr.deleteById(id);
		List<Student> list = (List<Student>) sr.findAll();
		return list;
	}

	@Override
	public Student editStudent(int id) {
		 Student stu = sr.findById(id);
		return stu;
		
	}

	@Override
	public List<Student> updateStudent(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		List<Student> list = (List<Student>) sr.findAll();
		return list;
	}
}
