package com.cg.studentdetails.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cg.studentException.exception.StudentException;
import com.cg.studentdetails.dto.StudentDto;
import com.cg.studentdetails.service.IStudentService;
import com.cg.studentdetails.service.StudentServiceImpl;

public class MyMain {

	public static void main(String[] args) {
		String sname;
		String sphone;
		String semail;
		String sage;
		String sgender;
		String scity;
		String status = "not approved";
		String sappointmentdate;
		IStudentService service = new StudentServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {StudentDto dto = new StudentDto();
			System.out.println("choose from the following:");
			System.out.println("1. Enter student details");
			System.out.println("2. View student college");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter student name: ");
				sname = scanner.next();
				System.out.println("Enter phone number: ");
				sphone = scanner.next();
				System.out.println("Enter email:");
				semail = scanner.next();
				System.out.println("Enter age: ");
				sage = scanner.next();
				System.out.println("Enter gender");
				sgender = scanner.next();
				System.out.println("Enter city");
				scity = scanner.next();
				System.out.println("Enter appointment date: ");
				sappointmentdate = scanner.next();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate sdob = LocalDate.parse(sappointmentdate, dateTimeFormatter);

				dto.setSname(sname);
				dto.setSage(sage);
				dto.setSappointmentdate(sdob);
				dto.setScity(scity);
				dto.setSemail(semail);
				dto.setSgender(sgender);
				dto.setSphone(sphone);

				boolean result = false;

				try {
					result = service.validateName(dto);
				} catch (StudentException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
				if (result) {
					service.addDetails(dto);
				} else {
					System.out.println("Error");
				}

				System.out.println(dto.getStatus()+" , your id is: "+dto.getSid());
				
				break;

			case 2:
				System.out.println("enter sid: ");
				int stuid=0;
				stuid=scanner.nextInt();
			    StudentDto sdto=service.viewStudentStatus(stuid);
				System.out.println(sdto.getCollegename());
		
			    break;
			
			}
		} while (choice < 3);
		scanner.close();
	}

}
