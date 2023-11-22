package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class TestApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		
		 StudentDao dao=context.getBean("studentDao",StudentDao.class);
		Student s1=new Student();
		s1.setStudentId(11144);
		s1.setStudentName("Ranjeet Kumar");
		s1.setStudentCity("Mumbai");
		int insert = dao.insert(s1);
		System.out.println("Numbers of records inserted:.."+insert);
		
	}

}
