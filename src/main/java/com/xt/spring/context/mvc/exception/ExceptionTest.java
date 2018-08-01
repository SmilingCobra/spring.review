package com.xt.spring.context.mvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller()
@RequestMapping("/exception")
public class ExceptionTest {
@RequestMapping("/exTest")
	public String exceptionTest(@RequestParam(name="money",defaultValue="0",required=false)String m){
	Integer money = Integer.parseInt(m);
	if(money>100){
		System.out.println("----->"+money);
	}else{
		System.out.println("--余额不足-->"+money);
		try {
			throw new NotEnoughMoney("对不起您的金额不足!!!");
		} catch (NotEnoughMoney e) {
		
			e.printStackTrace();
		}
	}
	return "exception/judgement";
}
}
