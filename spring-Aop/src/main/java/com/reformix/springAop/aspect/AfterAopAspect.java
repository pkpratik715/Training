package com.reformix.springAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//execution(* PACKAGE.*.*(..))
	@AfterReturning(value="com.reformix.springAop.aspect.CommonJoinPointConfig.businessLayerExcution()",returning = "object")
	public void afterReturning(JoinPoint joinPoint,Object object) {
//		Advice
		logger.info("{} returned with value - {}",joinPoint,object);
	}
	 	
	@AfterThrowing(value="com.reformix.springAop.aspect.CommonJoinPointConfig.businessLayerExcution()",throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint,Object exception) {
//		Advice
		logger.info("{} returned with value - {}",joinPoint,exception);
	}
	
	
	@After(value="com.reformix.springAop.aspect.CommonJoinPointConfig.businessLayerExcution()")
	public void after(JoinPoint joinPoint) {
//		Advice
		logger.info("after execution of {}",joinPoint);
	}

}
