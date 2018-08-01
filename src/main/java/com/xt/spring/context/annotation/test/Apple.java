package com.xt.spring.context.annotation.test;

import com.xt.spring.context.annotation.annotation.FruitColor;
import com.xt.spring.context.annotation.annotation.FruitColor.Color;
import com.xt.spring.context.annotation.annotation.FruitName;
import com.xt.spring.context.annotation.annotation.FruitProvider;

public class Apple {
	@FruitName(value = "FuShi Apple")
	private String fruitName;
	@FruitColor(fruitColor=Color.RED)
	private String fruitColor;
	@FruitProvider(id=1,user = "Tom" ,address = "China")
	private FruitProvider provider;
}
