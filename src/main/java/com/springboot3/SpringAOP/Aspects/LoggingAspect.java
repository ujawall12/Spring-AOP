package com.springboot3.SpringAOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    //Pointcut- Defined when to use these aspects

    private final Logger logger= LoggerFactory.getLogger(getClass());

//  @Pointcut("execution(* com.springboot3.SpringAOP.AOPService.*.*(..)")
    @Before("execution(* com.springboot3.SpringAOP.AOPService.*.*(..))") // Used because we want it to get executed before a method is called
    public Void logMethodCall(JoinPoint joinPoint) {

        logger.info("Before Aspect - Method is called - {} ",joinPoint);
        return null;
    }
}
