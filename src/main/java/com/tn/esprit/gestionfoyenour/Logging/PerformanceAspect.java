package com.tn.esprit.gestionfoyenour.Logging;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {

    @Around("execution (* com.tn.esprit.gestionfoyenour.services.CourServiceImp.*(..))")
    public Object executionTime(ProceedingJoinPoint pjp) throws Throwable {

        long t1 = System.currentTimeMillis();

        
        Object obj = pjp.proceed();
        long executionTime = System.currentTimeMillis() - t1;
        String methodName = pjp.getSignature().getName();
        log.info("The runtime of the method ( " + methodName + " ) = " + executionTime + " milliseconds.");
        return obj;
    }
}
