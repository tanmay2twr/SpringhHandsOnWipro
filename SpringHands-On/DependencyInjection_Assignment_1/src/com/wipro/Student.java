package com.wipro;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Student {
private String studentId;
private String studentName;
private List<Test> studentTest;
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public List<Test> getStudentTest() {
	return studentTest;
}
public void setStudentTest(List<Test> studentTest) {
	this.studentTest = studentTest;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentTest=" + studentTest + "]";
}


}
