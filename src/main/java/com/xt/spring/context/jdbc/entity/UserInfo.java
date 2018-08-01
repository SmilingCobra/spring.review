package com.xt.spring.context.jdbc.entity;

public class UserInfo {
private String userName;
private String userId;
private Double money;
public UserInfo(){}
public UserInfo(String userName,String userId,Double money){
	this.userName= userName;
	this.userId = userId;
	this.money =money;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public Double getMoney() {
	return money;
}
public void setMoney(Double money) {
	this.money = money;
}
@Override
public String toString() {
	return "UserInfo [userName=" + userName + ", userId=" + userId + ", money=" + money + "]";
}

}
