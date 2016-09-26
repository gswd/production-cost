package com.bjgreenchem.production.cost.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjgreenchem.production.cost.model.Student;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Transactional
@Service("studentService")
public class StudentServiceImpl extends BaseService<Student> implements StudentService{

	
	@Override
	public void createStudent(Student stu) {
		
//		studentMapper.insertStudent(stu);
		save(stu);
		
		
	}
	
	@Override
	public Student getStudent(Student stu) {
		Example example = new Example(Student.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("studId", stu.getStudId());
		return mapper.selectByPrimaryKey(stu.getStudId());
	}

}
