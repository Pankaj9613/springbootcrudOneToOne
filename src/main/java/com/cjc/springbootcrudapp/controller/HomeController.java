package com.cjc.springbootcrudapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springbootcrudapp.model.Student;
import com.cjc.springbootcrudapp.servicei.StudentServiceI;

@Controller
public class HomeController {

	@Autowired
	StudentServiceI ssi;

	@RequestMapping("/")
	public String preLogin() {
		return "login";
	}

	@RequestMapping("/openregister")
	public String preRegister() {
		return "register";
	}

	@RequestMapping("/save")
	public String register(@ModelAttribute Student s) {
		ssi.saveStudent(s);
		return "login";
	}

	@RequestMapping("/login")
	public String loginStudent(@RequestParam("username") String username, @RequestParam("password") String password,
			Model m) {
		List<Student> list = ssi.loginStudent(username, password);
		if (!list.isEmpty()) {
			m.addAttribute("data", list);
			return "success";
		} else {
			return "login";
		}

	}

	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id, Model m) {
		List<Student> list = ssi.deleteStudent(id);
		m.addAttribute("data", list);
		return "success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("id") int id ,Model m)
	{
		Student stu = ssi.editStudent(id);
		m.addAttribute("data", stu);
		return "edit";
		
	}
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s,Model m)
	{
		 List<Student> list = ssi.updateStudent(s);
		 m.addAttribute("data", list);
		return "success";
		
	}
}
