package com.example.demo.Dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.StudentDto;

@Repository
public interface StudentDao extends MongoRepository<StudentDto, Serializable> {
//	public List<StudentDto> findByfName1(String fName);

	// public List<StudentDto>findByFName(String fName);
	public List<StudentDto> findBylName(String lname);

	public StudentDto findByfName(String fName);
//
//	@Query("{ 'dob' : { $gt: ?1, $lt: ?2 } }")
//	public List<StudentDto> findByDob(LocalDate localDate, LocalDate localDate2);
//	

	@Query(value = "{dob:{$gte:?0,$lte:?1}}")
	public List<StudentDto> findByDob(LocalDate from, LocalDate to);

//	public List<StudentDto> findByDob(LocalDate dob,);

}
