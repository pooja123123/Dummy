package com.cg.student.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.cg.studentdetails.dao.StudentDaoImpl;
import com.cg.studentdetails.dto.StudentDto;

class StudentDaoImplTest extends StudentDaoImpl {

	@Test
	public void testGetcityDetails() {
		StudentDto sd=new StudentDto();
		sd.setScity("Delhi");
		assertEquals("Delhi",sd.getScity());
		
	}

	@Test
	public void testAddDetails() {
		StudentDto sd=new StudentDto();
		//StudentServiceImpl service=new StudentServiceImpl();
		//StudentDaoImpl dao=new StudentDaoImpl();
		StudentDto dto=new StudentDto();
		sd.setCollegename("IIT-D");
		assertNotEquals(-123,dto.getSid() );
		
	}


	@Test
	public void testGetStudentDetails() {
		StudentDto dto=new StudentDto();
		dto.setSname("Pooja");
		assertEquals("Pooja",dto.getSname());
		
	}

	@Test
	void testGetCollegedetails() {
		StudentDto dto=new StudentDto();
		dto.getCollegename();
		dto.setCollegename("IIT-D");
	assertEquals("IIT-D", dto.getCollegename());
	}

}
