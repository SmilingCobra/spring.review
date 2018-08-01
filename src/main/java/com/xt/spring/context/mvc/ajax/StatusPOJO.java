package com.xt.spring.context.mvc.ajax;

public class StatusPOJO {
private Integer index;
private boolean status;
public Integer getIndex() {
	return index;
}
public void setIndex(Integer index) {
	this.index = index;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
@Override
public String toString() {
	return "StatusPOJO [index=" + index + ", status=" + status + "]";
}

}
