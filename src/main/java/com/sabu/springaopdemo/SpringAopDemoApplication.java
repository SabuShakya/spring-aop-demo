package com.sabu.springaopdemo;

import com.sabu.springaopdemo.business.Business1;
import com.sabu.springaopdemo.business.Business2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringAopDemoApplication implements CommandLineRunner {


    private final Business1 business1;
    private final Business2 business2;

    public SpringAopDemoApplication(Business1 business1, Business2 business2) {
        this.business1 = business1;
        this.business2 = business2;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringAopDemoApplication.class, args);
//        for (String name: applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
    }

    public void invokeAOPStuff() {
//        log.info(business1.calculateSomething());
//        log.info(business2.calculateSomething());
        business1.testSomething();
        business1.annotationAspect();
    }

    @Override
    public void run(String... args) throws Exception {
        invokeAOPStuff();
    }
}
