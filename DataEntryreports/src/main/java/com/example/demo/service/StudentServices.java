package com.example.demo.service;

import java.util.List;

import com.example.demo.DataVo.DataVo;
import com.example.demo.DataVo.StudentVo;

public interface StudentServices {
	public StudentVo getDetails(String studentName);

	public String insertDetails(StudentVo studentVo);

	public List<StudentVo> getStudentDetailsOnDob(DataVo name);
}
