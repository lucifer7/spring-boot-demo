package com.yang.monitor;

//import org.aspectj.lang.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;

/**
 * Usage: <b> </b>
 *
 * @author Jingyi.Yang
 * @since 2016/9/12
 **/
@Aspect
@Component
public class ServiceMonitor {
    /*@Autowired
    private CounterService counterService;

    @Before
    public void countServiceInvoke(Joinpoint joinpoint) {
        counterService.increment(joinpoint.getSignature());
    }*/
}
