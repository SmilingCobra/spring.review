package com.xt.spring.context.annotation.test;

import java.lang.reflect.Field;

import com.xt.spring.context.annotation.annotation.FruitColor;
import com.xt.spring.context.annotation.annotation.FruitName;
import com.xt.spring.context.annotation.annotation.FruitProvider;

public class MyTest {
	
	public static void getFruitInfo(String className){
		try {
			Class<?> cls = Class.forName(className);
			Field[] fields = cls.getDeclaredFields();
			for(Field field : fields){
				if(field.isAnnotationPresent(FruitName.class)){
					FruitName fruitName = field.getAnnotation(FruitName.class);
					System.out.println("FruitName: \t"+fruitName.value());
				}
				if(field.isAnnotationPresent(FruitColor.class)){
					FruitColor fruitColor = field.getAnnotation(FruitColor.class);
					System.out.println("FruitColor: \t"+fruitColor.fruitColor());
				}
				if(field.isAnnotationPresent(FruitProvider.class)){
					FruitProvider fruitColor = field.getAnnotation(FruitProvider.class);
					System.out.println("Fruit FruitProvider: ProviderID:"+fruitColor.id()+" Provider:"+fruitColor.user() +" ProviderAddress:"+fruitColor.address());
				}
			}
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getFruitInfo("com.xt.spring.context.annotation.test.Apple");
	}

}
