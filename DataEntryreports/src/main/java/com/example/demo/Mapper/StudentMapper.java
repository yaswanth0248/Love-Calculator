package com.example.demo.Mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.DataVo.StudentVo;
import com.example.demo.Dto.StudentDto;

@Component
public class StudentMapper  {

	
	public StudentVo convertDtoToVo(StudentDto studentDto) {
		StudentVo studentVo = new StudentVo();
		studentVo.setfName(studentDto.getfName());
		studentVo.setlName(studentDto.getlName());
		studentVo.setMobileNo(studentDto.getMobileNo());
		studentVo.setDob(studentDto.getDob());
		studentVo.setCreatedDate(studentDto.getCreatedDate());
		return studentVo;
	}

	public StudentDto convertVoToDto(StudentVo studentVo) {
		StudentDto studentDto = new StudentDto();
		studentDto.setfName(studentVo.getfName());
		studentDto.setlName(studentVo.getlName());
		studentDto.setMobileNo(studentVo.getMobileNo());
		studentDto.setDob(studentVo.getDob());
		// studentDto.setCreatedDate(studentVo.getCreatedDate());
		studentDto.setCreatedDate(LocalDateTime.now());

		return studentDto;
	}


	public List<StudentVo> convertDtoToVoList(List<StudentDto> studentDtoList) {

		List<StudentVo> studentVoList = new ArrayList<StudentVo>();
		StudentVo studentVo = new StudentVo();
		for (StudentDto item : studentDtoList) {
			studentVo = convertDtoToVo(item);
			studentVoList.add(studentVo);
		}

		return studentVoList;

	}

	
	public List<StudentDto> convertVoToDtoList(List<StudentVo> studentVoList) {
		List<StudentDto> studentDtoList = new ArrayList<StudentDto>();
		StudentDto studentDto = new StudentDto();
		for (StudentVo item : studentVoList) {
			studentDto = convertVoToDto(item);
			studentDtoList.add(studentDto);
		}

		return studentDtoList;

	}

}
