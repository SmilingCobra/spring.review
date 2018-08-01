package com.xt.spring.context.mvc.ajax;

public class SumObject {
private int addend01;
private int addend02;
private int sum;
public int getAddend01() {
	return addend01;
}
public void setAddend01(int addend01) {
	this.addend01 = addend01;
}
public int getAddend02() {
	return addend02;
}
public void setAddend02(int addend02) {
	this.addend02 = addend02;
}
public int getSum() {
	return sum;
}
public void setSum(int sum) {
	this.sum = sum;
}
@Override
public String toString() {
	return "SumObject [addend01=" + addend01 + ", addend02=" + addend02 + ", sum=" + sum + "]";
}

}
