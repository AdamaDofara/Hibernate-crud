package com.sati.dao;

import java.util.List;

import com.sati.model.Student;

public interface IStudentDoa {

 void saveStudent(Student student);

 void updateStudent(Student student);

 Student getStudentById(int id);

 List<Student> getAllStudents();

 void deleteStudent(int id);

}
