package com.cg.studentdetails.service;

import com.cg.studentException.exception.StudentException;
import com.cg.studentdetails.dto.StudentDto;

public interface IStudentService {

	public void addDetails(StudentDto studentDto);

	public boolean validateName(StudentDto dto) throws StudentException;
	public StudentDto viewStudentStatus(int sid);

}
