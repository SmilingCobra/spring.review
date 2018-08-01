package com.xt.spring.context.anno.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoMybatisImpl implements StuDao{

	public void operator() {
		System.out.println("使用mybatis的方式操作数据库");
		
	}

}
