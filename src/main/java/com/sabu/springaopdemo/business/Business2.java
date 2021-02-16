package com.sabu.springaopdemo.business;

import com.sabu.springaopdemo.data.Dao2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Business2 {

    private final Dao2 dao2;

    public Business2(Dao2 dao2) {
        this.dao2 = dao2;
    }

    public String calculateSomething() {
        String value = dao2.retrieveSomething();
        log.info("In Business - {}", value);
        return value;
    }


}
