package com.springboot3.SpringAOP.Aspects;


import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {

   final Logger logger= LoggerFactory.getLogger(getClass());
    @Around("com.springboot3.SpringAOP.Aspects.CommonPointcutConfig.trackTimeAnnotation()")
    @SneakyThrows
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint){
        long startTime=System.currentTimeMillis();

        Object returnValue=proceedingJoinPoint.proceed();

        long stopTime=System.currentTimeMillis();

        long duration=stopTime-startTime;

        logger.info("Around aspect - {} method executed in - {}",proceedingJoinPoint, duration);

        return returnValue;

    }

}
