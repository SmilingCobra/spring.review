package com.xt.spring.context.mvc.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xt.spring.context.anno.entity.Student;
@Controller()
public class SpringCrud {
@RequestMapping("/showStus")
public String addInit(Map<String,List<Student>> map){
	System.out.println("-------");
	List<Student> stuList = new LinkedList<Student>();
	for(int i=0;i<10;i++){
		stuList.add(new Student("小强"+i,"男",17+i));
	}
	map.put("stuList", stuList);
	return "stu/stuList" ;
}
@RequestMapping("/doRegister")
public String doRegister(Student stu,String[] hobby,@RequestParam(name="password",required=false,defaultValue="123456") String password1){
	for(String h : hobby){
		System.out.println(h);
	}
	
	System.out.println(stu.getStuName()+"<----->"+stu.getGender()+"<---->"+stu.getAge());
	System.out.println("password1:   \t"+password1);
	return "stu/success";
}
}
