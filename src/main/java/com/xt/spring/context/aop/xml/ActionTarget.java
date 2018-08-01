package com.xt.spring.context.aop.xml;

public class ActionTarget implements ActionInter{
	public Double despoit(String cardId,double money){
		System.out.println("向"+cardId+"中存入"+money+"元");
		
		return money;
	}
	
	public void pay(String cardId,double money) {
		if(money>50){
			
				try {
					throw new Exception("余额不足!!!"+"您要取的钱为: "+money);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		System.out.println(cardId+"支付了"+money+"元");
	}
}
