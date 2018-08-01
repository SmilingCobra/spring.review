/**
 * 
 */
package com.xt.spring.context.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *通过注解的形式来配置aspect
 */
@Aspect
@Component
public class ActionLoggerAspect {
	@Pointcut("execution(* com.xt.spring.context.aop.anno.ActionTarget.*(..))")
	public void loggerPointCut(){
		
	}
	@Before("loggerPointCut()")
	public void beforeMethodAdvice(/**连接点声明*/JoinPoint jp){
		Object[] args = jp.getArgs();
		System.out.println("方法"+jp.getSignature().getName()+"执行, \t前置通知启动****************");
		for(Object o :args){
			System.out.print(o+" ");
		}
	}
	
	@AfterReturning(pointcut="loggerPointCut()",returning="result")
	public void afterReturnAdvice(/**连接点声明*/JoinPoint jp,Object result){
		Object[] args = jp.getArgs();
		System.out.println("afterReturnAdvice传入的参数是:  ");
		for(Object o :args){
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("afterReturnAdvice执行的结果是： "+result);
	}
	/**ProceedingJoinPoint 是JoinPoint的继承类 新增了一些方法 它的返回值将会是执行方法的返回值，原方法将不会被执行*/
	public Object roundMethodAdvice(/**连接点声明*/ ProceedingJoinPoint pjp){
		System.out.println("roundMethodAdvice------方法:  "+pjp.getSignature().getName()+"前置通知执行:   ");
		//这个通知方法将代替目标方法进行执行
		Object result = null;
		try {
			
			Object[] args = {"201602",100.3};
			 result = pjp.proceed(args);
			System.out.println("roundMethodAdvice------result:    "+result);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("roundMethodAdvice------方法:  "+pjp.getSignature().getName()+"后置通知通知执行:   ");
		return result;
	}
	
	public void afterExceptionAdvice(/**连接点声明*/JoinPoint jp,Exception ex){
		System.out.println("方法"+jp.getSignature().getName()+"执行, \t后置异常 通知启动****************");
		ex.printStackTrace();
	}
}
