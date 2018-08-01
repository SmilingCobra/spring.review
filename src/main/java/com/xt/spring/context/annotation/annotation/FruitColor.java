package com.xt.spring.context.annotation.annotation;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(FIELD)
public @interface FruitColor {
	enum Color  {RED,GREEN,WHITE};
	Color fruitColor() default Color.RED;
}
