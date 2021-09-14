package com.reformix.springAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
	@Before("com.reformix.springAop.aspect.CommonJoinPointConfig.dataLayerExcution()")
	public void before(JoinPoint joinPoint) {
//		Advice
		logger.info("Check for user Access ");
		logger.info("Allowed execution for - {}",joinPoint);
	}

}
