package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	//save student method
	@Transactional
	public int insert(Student s) {
		
	Integer i= (Integer)this.hibernateTemplate.save(s);
       return i;
		
	}

	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
