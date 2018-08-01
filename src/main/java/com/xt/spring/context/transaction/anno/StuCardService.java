package com.xt.spring.context.transaction.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xt.spring.context.transaction.NotEnoughMoney;
@Service
public class StuCardService {

	@Autowired
	private StuCardDao scd;
	

public StuCardDao getScd() {
		return scd;
	}


	public void setScd(StuCardDao scd) {
		this.scd = scd;
	}


/**
 * 转账
 * @param sourceCardNo	付款人
 * @param targetCardNo	收款人
 * @param money			转账钱数
 */
	@Transactional(timeout=5)
public void transferAccount(String sourceCardNo,String targetCardNo,double money){
	StuCard sourceCard = scd.getStuCardByCardNo(sourceCardNo);
	StuCard targetCard = scd.getStuCardByCardNo(targetCardNo);
	double sourceCardRest = sourceCard.getMoney() - money;
	double targetCardRest = targetCard.getMoney() + money;
	sourceCard.setMoney(sourceCardRest);
	targetCard.setMoney(targetCardRest);
	scd.updateCardMoney(sourceCard);
	scd.updateCardMoney(targetCard);
	if(sourceCardRest<0){
		throw new NotEnoughMoney("余额不足!!! 消费金额: "+money+",  剩余金额:  "+(sourceCardRest+money));
	}
}
}
