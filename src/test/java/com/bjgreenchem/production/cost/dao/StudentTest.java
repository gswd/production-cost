package com.bjgreenchem.production.cost.dao;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjgreenchem.production.cost.model.Student;
import com.bjgreenchem.production.cost.service.StudentService;



public class StudentTest {
	
	private ApplicationContext ctx;
	
	@Before
	public void initialize() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Test
	public void testGetStudent(){
		StudentMapper dao = (StudentMapper)ctx.getBean("studentMapper");
		Student stu = new Student();
		stu.setStudId(1);
		Student result = dao.getStudent(stu);
		System.out.println(result);
	}
	
	@Test
	public void testCreateStudent(){
		StudentService dao = (StudentService)ctx.getBean("studentService");
		Student stu = new Student();
		stu.setDob(new Date());
		stu.setEmail("lihao@123.com");
		stu.setName("erick");
		stu.setPhone("18888888888");
		dao.createStudent(stu);
		
//		Student stu1 = new Student();
//		stu1.setName("erick");
//		Student result = dao.getStudent(stu);
//		System.out.println(result);
	}
}
