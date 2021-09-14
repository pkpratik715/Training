package com.reformix.springAop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.reformix.springAop.data.*.*(..))")
	public void dataLayerExcution() {}
	
	@Pointcut("execution(* com.reformix.springAop.business.*.*(..))")
	public void businessLayerExcution() {}

	@Pointcut("dataLayerExcution() && businessLayerExcution()")
	public void allLayerExecution() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContaningDao() {}
	
	@Pointcut("within(com.reformix.springAop.data..*)")
	public void dataLayerExecutionWithWithin() {}
	
	@Pointcut("@annotation(com.reformix.springAop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
