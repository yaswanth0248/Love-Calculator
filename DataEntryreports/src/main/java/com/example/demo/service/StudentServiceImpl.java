package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.DataVo.DataVo;
import com.example.demo.DataVo.StudentVo;
import com.example.demo.Dto.StudentDto;
import com.example.demo.Mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired
	private StudentDao studentDao;
	@Autowired
	private StudentMapper studentMapp;

	@Override
	public StudentVo getDetails(String studentName) {
		StudentVo studentVo = new StudentVo();
		try {
			StudentDto studentDto = studentDao.findByfName(studentName);
			studentVo = studentMapp.convertDtoToVo(studentDto);
		} catch (Exception e) {
			System.out.println(e);
		}

		return studentVo;
	}

	@Override
	public String insertDetails(StudentVo studentVo) {

		StudentDto studentDto = new StudentDto();
		studentDto = studentMapp.convertVoToDto(studentVo);
		studentDao.save(studentDto);
		return "DATA SAVED SUCCESFULLY";
	}

	@Override
	public List<StudentVo> getStudentDetailsOnDob(DataVo name) {
		List<StudentVo> studentVoList = new ArrayList<StudentVo>();
		try {
			List<StudentDto> studentDtoList = studentDao.findByDob(name.getFromDate(), name.getToDate());
			studentVoList = studentMapp.convertDtoToVoList(studentDtoList);
		} catch (Exception e) {
			System.out.println(e);
		}
		return studentVoList;
	}

}
