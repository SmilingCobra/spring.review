package com.xt.spring.context.mvc.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xt.spring.context.anno.entity.Student;
@Controller()
@RequestMapping("/rest")
public class SpringRestful {
	@RequestMapping("/showStus")
	public String stuListInit(Map<String,List<Student>> map){
		
		List<Student> stuList = new LinkedList<Student>();
		for(int i=0;i<10;i++){
			stuList.add(new Student("小强"+i,"男",17+i));
		}
		map.put("stuList", stuList);
		return "rest/stuList" ;
	}
	@RequestMapping(value="/stuManager/${stuName}", method=RequestMethod.POST)
	public String addStu(@PathVariable("stuName") String stuName){
		System.out.println("学生信息添加操作---->"+stuName);
		return "rest/success";
	}
	@RequestMapping(value="/stuManager/${stuName}", method=RequestMethod.GET)
	public String checkStu(@PathVariable("stuName") String stuName){
		System.out.println("学生信息查看操作---->"+stuName);
		return "rest/success";
	}
	@RequestMapping(value="/stuManager/${stuName}", method=RequestMethod.PUT)
	public String updateStu(@PathVariable("stuName") String stuName){
		System.out.println("学生信息修改操作---->"+stuName);
		return "rest/success";
	}
	@RequestMapping(value="/stuManager/${stuName}", method=RequestMethod.DELETE)
	public String deleteStu(@PathVariable("stuName") String stuName){
		System.out.println("学生信息删除操作---->"+stuName);
		return "rest/success";
	}
}
