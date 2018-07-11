package com.cg.studentException.exception;

public class StudentException extends Exception {
	public StudentException() {
	}

	public StudentException(String arg) {
		System.out.println(arg);
	}
}
