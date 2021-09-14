package com.reformix.springAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// execution(* PACKAGE.*.*(..))
	@Around(value="com.reformix.springAop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//		Advice
		long startTime = System.currentTimeMillis();
		 joinPoint.proceed();
		 long timeTaken = System.currentTimeMillis()-startTime;
		logger.info("Time taken by {} is {}",joinPoint,timeTaken);
	}

}
