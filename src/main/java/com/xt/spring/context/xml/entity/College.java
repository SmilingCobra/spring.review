package com.xt.spring.context.xml.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class College {
	public College(){
		System.out.println("College对象被创建！！！！");
		
	}
private String collName;
private List list;
private Map map;
private Set set;
public String getCollName() {
	return collName;
}

public void setCollName(String collName) {
	this.collName = collName;
}

public List getList() {
	return list;
}

public void setList(List list) {
	this.list = list;
}

public Map getMap() {
	return map;
}

public void setMap(Map map) {
	this.map = map;
}

public Set getSet() {
	return set;
}

public void setSet(Set set) {
	this.set = set;
}

@Override
public String toString() {
	return "College [collName=" + collName + ", list=" + list + ", map=" + map + ", set=" + set + "]";
}

}
