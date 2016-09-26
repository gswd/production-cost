package com.bjgreenchem.production.cost.dao;

import com.bjgreenchem.production.cost.model.Student;

import tk.mybatis.mapper.common.Mapper;

public interface StudentMapper extends Mapper<Student>{
	 public Student getStudent(Student student);
	 public void insertStudent(Student student);
}
