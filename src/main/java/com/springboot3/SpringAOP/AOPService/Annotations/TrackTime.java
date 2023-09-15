package com.springboot3.SpringAOP.AOPService.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Defines the level of the annotation i.e class level or method level
@Retention(RetentionPolicy.RUNTIME) // Defines at what time will the annotation will be executed
public @interface TrackTime {
}
