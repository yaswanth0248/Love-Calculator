package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DataVo.DataVo;
import com.example.demo.DataVo.StudentVo;
import com.example.demo.service.StudentServiceImpl;

@RestController
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
	public String insertDetails(@RequestBody StudentVo studentVo) {
		String s;
		s = studentServiceImpl.insertDetails(studentVo);

		return s;
	}

	@GetMapping(value = "/getstudent", produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentVo getDetails(@RequestParam(value = "firstName") String fName) {
		StudentVo studentVo = new StudentVo();
		studentVo = studentServiceImpl.getDetails(fName);

		return studentVo;
	}

	@PostMapping(value = "/getstudentsDetailsdob", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StudentVo> getDetailsOnDob(@RequestBody DataVo name) {
		List<StudentVo> studentVoList = new ArrayList<StudentVo>();
		studentVoList = studentServiceImpl.getStudentDetailsOnDob(name);

		return studentVoList;
	}

}
