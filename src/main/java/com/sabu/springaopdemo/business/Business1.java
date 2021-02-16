package com.sabu.springaopdemo.business;

import com.sabu.springaopdemo.aop.customAnnotation.MethodLogging;
import com.sabu.springaopdemo.data.Dao1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Business1 {

    private final Dao1 dao1;

    public Business1(Dao1 dao1) {
        this.dao1 = dao1;
    }

    public String calculateSomething() {
        String value = dao1.retrieveSomething();
        log.info("In Business - {}",value);
        return value;
    }

    public void testSomething(){
        System.out.println("hello");
    }

    @MethodLogging
    public void annotationAspect(){
        log.info("Annotation ");
    }
}
