package com.springboot3.SpringAOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    //Pointcut- Defined when to use these aspects

    private final Logger logger= LoggerFactory.getLogger(getClass());

//  @Pointcut("execution(* com.springboot3.SpringAOP.AOPService.*.*(..)")
    @Before("com.springboot3.SpringAOP.Aspects.CommonPointcutConfig.allPackageConfigUsingBean()") // Used because we want it to get executed before a method is called
    public Void logMethodCallBeforeExecution(JoinPoint joinPoint) {

        logger.info("Before Aspect - {} is called with arguments - {} "
                ,joinPoint, joinPoint.getArgs());
        return null;
    }

    @After("com.springboot3.SpringAOP.Aspects.CommonPointcutConfig.serviceAndRepoPackageConfig()")
    public Void logMethodCallAfterExecution(JoinPoint joinPoint) {

        logger.info("After Aspect - {} has executed ", joinPoint);
        return null;

    }

    @AfterThrowing(
            pointcut = "com.springboot3.SpringAOP.Aspects.CommonPointcutConfig.serviceAndRepoPackageConfig()",
            throwing = "exception"
    )
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
        logger.info("AfterThrowing Aspect - {} has thrown an exception {}"
                ,  joinPoint, exception);
    }


    @AfterReturning(
            pointcut = "com.springboot3.SpringAOP.Aspects.CommonPointcutConfig.serviceAndRepoPackageConfig()",
            returning = "resultValue"
    )
    public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint,
                                                      Object resultValue) {
        logger.info("AfterReturning Aspect - {} has returned {}"
                ,  joinPoint, resultValue);
    }


}
