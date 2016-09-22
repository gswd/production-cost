package com.bjgreenchem.production.cost.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjgreenchem.production.cost.model.Student;



public class StudentTest {
	
	private ApplicationContext ctx;
	
	@Before
	public void initialize() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Test
	public void testGetStudent(){
		StudentDao dao = (StudentDao)ctx.getBean("studentDao");
		Student stu = new Student();
		stu.setStudId(1);
		Student result = dao.getStudent(stu);
		System.out.println(result);
	}
}
