package com.sabu.springaopdemo.aop.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //  @Target annotation tells us where our annotation will be applicable.
@Retention(RetentionPolicy.RUNTIME)
// And @Retention just states whether the annotation will be available to the JVM at runtime or not.
public @interface MethodLogging {
}
