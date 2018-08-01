package com.xt.spring.context.mvc.ajax;

public class Goods {
private String goodsName;
private Double goodsPrice;

public Goods() {
	super();
}
public Goods(String goodsName, Double goodsPrice) {
	super();
	this.goodsName = goodsName;
	this.goodsPrice = goodsPrice;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public Double getGoodsPrice() {
	return goodsPrice;
}
public void setGoodsPrice(Double goodsPrice) {
	this.goodsPrice = goodsPrice;
}
@Override
public String toString() {
	return "Goods [goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
}

}
