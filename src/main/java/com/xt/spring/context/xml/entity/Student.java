package com.xt.spring.context.xml.entity;

public class Student {
	
	
	public Student(String stuName, String gender, Integer age) {
		super();
		this.stuName = stuName;
		this.gender = gender;
		this.age = age;
	}

	public Student(){
		System.out.println("Student 对象被创建!!!!");
	}
private String stuName;

private String gender;

private Integer age;

private String address;

private String career;

private College coll;
public String getStuName() {
	return stuName;
}

public void setStuName(String stuName) {
	this.stuName = stuName;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCareer() {
	return career;
}

public void setCareer(String career) {
	this.career = career;
}

public College getColl() {
	return coll;
}

public void setColl(College coll) {
	this.coll = coll;
}

@Override
public String toString() {
	return "Student [stuName=" + stuName + ", gender=" + gender + ", age=" + age + ", address=" + address + ", career="
			+ career + ", coll=" + coll + "]";
}


}
