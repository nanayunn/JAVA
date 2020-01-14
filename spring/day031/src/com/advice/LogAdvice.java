package com.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	@Before("execution(* com..*Service.*(..))")
	public void before(JoinPoint jp) {
		System.out.println("Before...");
	};
	@AfterReturning(pointcut="execution(* com..get*(..))",returning="robj")
	public void afterreturn(JoinPoint jp, Object robj) {
		String mn = jp.getSignature().getName();
		Object obj[]=jp.getArgs();
		System.out.println(mn+" "+obj[0].toString()+robj.toString());
	}
	@Around("execution(* com..get*(..))")
	public Object ar(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		System.out.println("before....");
		result=pjp.proceed();
		System.out.println("after...");
		return result;
	}
}
