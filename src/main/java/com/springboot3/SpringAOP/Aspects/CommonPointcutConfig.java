package com.springboot3.SpringAOP.Aspects;

import org.aspectj.lang.annotation.Pointcut;
public class CommonPointcutConfig {

    @Pointcut("execution(* com.springboot3.SpringAOP.*.*.*(..))")
    public void serviceAndRepoPackageConfig(){}

    //All the beans with name/string business will be intercepted
    @Pointcut("bean(*business*)")
    public void allPackageConfigUsingBean() {}

    @Pointcut("@annotation(com.springboot3.SpringAOP.AOPService.Annotations.TrackTime)")
    public void trackTimeAnnotation() {}
}
