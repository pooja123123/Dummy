package com.cg.studentdetails.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.studentException.exception.StudentException;
import com.cg.studentdetails.dto.StudentDto;
//import com.cg.studentdetails.service.Map;
//import com.cg.studentdetails.service.string;

//import com.cg.studentdetails.dto.StudentDetailsDto;

public interface IStudentDao {
	public void addDetails(StudentDto studentDto);

	public HashMap<String, String> getcityDetails();

	public HashMap<Integer, StudentDto> getStudentDetails();
	
	public Map<String, String> getCollegedetails();

	//public boolean validateName(StudentDto dto) throws StudentException;
}
