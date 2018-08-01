package com.xt.spring.context.anno.entity;

public class College {
	public College(){
		System.out.println("College对象被创建！！！！");
		
	}
private String collName;

public String getCollName() {
	return collName;
}

public void setCollName(String collName) {
	this.collName = collName;
}

@Override
public String toString() {
	return "College [collName=" + collName + "]";
}

}
