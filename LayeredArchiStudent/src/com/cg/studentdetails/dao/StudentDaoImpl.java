package com.cg.studentdetails.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.cg.studentException.exception.IStudentException;
import com.cg.studentException.exception.StudentException;
import com.cg.studentdetails.dto.StudentDto;

public class StudentDaoImpl implements IStudentDao {
	int generatedId = 0;
	private static Map<String, String> collegeDetails = null;//college Details
	private static HashMap<Integer, StudentDto> studentDetails= null;//student details
	static {
		collegeDetails = new HashMap<>();
		studentDetails = new HashMap<>();
		collegeDetails.put("Delhi", "IIT-D");
		collegeDetails.put("Hyderabad", "IIIt H");
		collegeDetails.put("Chennai", "IIt");
		collegeDetails.put("Bangalore", "IIS-B");
		collegeDetails.put("Mumbai", "IIt-M");
	}

	public HashMap<String, String> getcityDetails() {
		return (HashMap<String, String>) collegeDetails;
	}

	@Override
	public void addDetails(StudentDto studentDto) {
		
		generatedId = (int) (Math.abs(Math.random() * 1000));
		studentDto.setSid(generatedId);
		studentDto.setStatus("Approved");

		String city = studentDto.getScity();
		String collegename = collegeDetails.get(city);
		studentDto.setCollegename(collegename);
		studentDetails.put(generatedId, studentDto);
		// return generatedId;
	}

	@Override
	public HashMap<Integer, StudentDto> getStudentDetails() {
		// TODO Auto-generated method stub
		return studentDetails;
	}

	@Override
	public Map<String, String> getCollegedetails() {
		// TODO Auto-generated method stub
		return collegeDetails;
	}

	/*@Override
	public boolean validateName(StudentDto dto) throws StudentException {
		String name = dto.getSname();
		boolean output = false;
		if (!Pattern.matches("[a-zA-Z]+", name)) {
			throw new StudentException(IStudentException.ERROR1);

		} else if (!dto.getSemail().endsWith("com")) {

			throw new StudentException(IStudentException.ERROR2);

		} 
		else if(dto.getSphone()<=10)
		{
			throw new StudentException(IStudentException.ERROR3);
		}
		else
			output = true;
		return output;
	}*/
}
