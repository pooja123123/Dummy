package com.cg.studentdetails.service;

import java.time.LocalDate;
import java.util.Map;
import java.util.regex.Pattern;

import com.cg.studentException.exception.IStudentException;
import com.cg.studentException.exception.StudentException;
import com.cg.studentdetails.dao.IStudentDao;
import com.cg.studentdetails.dao.StudentDaoImpl;
import com.cg.studentdetails.dto.StudentDto;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao dao = null;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public void addDetails(StudentDto studentDto) {
		Map<String, String> collegeDetails = dao.getcityDetails();
		if (collegeDetails.containsKey(studentDto.getScity())) {
			dao.addDetails(studentDto);
		}

	}

	@Override
	public boolean validateName(StudentDto dto) throws StudentException {
		LocalDate today = LocalDate.now();
		String name = dto.getSname();
		boolean output = false;
		if (!Pattern.matches("^[a-zA-Z]{1,}$", name)) {
			throw new StudentException(IStudentException.ERROR1);
		} else if (!(dto.getSphone().length() == 10)) {

			if (!Pattern.matches("[1-9]+{1,10}", dto.getSphone())) {

				throw new StudentException(IStudentException.ERROR3);
			}
		} else if (!dto.getSemail().endsWith("com")) {

			throw new StudentException(IStudentException.ERROR2);
		}

		else if (!dto.getSappointmentdate().isAfter(today)) {
			throw new StudentException(IStudentException.ERROR4);

		} else
			output = true;
		return output;
	}

	@Override
	public StudentDto viewStudentStatus(int sid) {
		// TODO Auto-generated method stub
		return dao.getStudentDetails().get(sid);
	}

}
