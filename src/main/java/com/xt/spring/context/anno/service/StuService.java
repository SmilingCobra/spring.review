package com.xt.spring.context.anno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.xt.spring.context.anno.dao.StuDao;
@Service("stuService")
public class StuService {
	@Autowired
	@Qualifier("studentDaoJdbcImpl")
	StuDao stuDao;

	public StuDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(StuDao stuDao) {
		this.stuDao = stuDao;
	}
 public void print(){
	 stuDao.operator();
 }	
}
