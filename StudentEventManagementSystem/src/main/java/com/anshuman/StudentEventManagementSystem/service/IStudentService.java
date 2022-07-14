package com.anshuman.StudentEventManagementSystem.service;

import java.util.List;

import com.anshuman.StudentEventManagementSystem.entity.Student;

public interface IStudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student theStudent);

	Student getStudent(long theId);

   Student updateStudent(Student student);

	void deleteStudent(long theId);
}
