package com.javatest.spring_14_2_ex1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// Controller�� ������ 404���� ��

@Controller
public class RedirectController {

	@RequestMapping("/index1")
	public String goIndex() {
		
		
		return "index1";
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public String goStudent(HttpServletRequest httpservletRequest, Model model) {
		
		String pid = httpservletRequest.getParameter("id");
		if(pid.equals("tiger")) {
			return "redirect:studentOk"; // RequestMapping�� value(/studentOk)�� �̵�
		}
		return "redirect:studentNg";
	}
	
	@RequestMapping(value = "/studentOk")
	public String studentOk() {
		return "student/studentOk"; // student ���� ���� studentOk.jsp�� �̵�
	}
	
	@RequestMapping(value = "/studentNg")
	public String studentNg() {
		return "student/studentNg"; // student ���� ���� studentNg.jsp�� �̵�
	}
	
	
	
	@RequestMapping(value = "/feel")
	public String goFeel() {
		
		return "redirect:http://localhost8888/spring_14_2_ex1/good";
	}
	
	@RequestMapping(value = "/good")
	public String goGood() {
		
		return "good";
	}
}
