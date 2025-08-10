package com.example;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
public class LoggingAspect {

	    public void logBefore(JoinPoint joinPoint) {
	        System.out.println("[LOG] Before: " + joinPoint.getSignature().getName());
	    }

	    public void logAfterReturning(JoinPoint joinPoint) {
	        System.out.println("[LOG] After Returning: " + joinPoint.getSignature().getName());
	    }

	    public void logAfterThrowing(JoinPoint joinPoint, Throwable ex) {
	        System.out.println("[LOG] Exception in: " + joinPoint.getSignature().getName() + " | Message: " + ex.getMessage());
	    }

	    
	    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
	        long start = System.currentTimeMillis();
	        System.out.println("[LOG] Around Start: " + pjp.getSignature().getName());
	        Object result = pjp.proceed(); // actual method call
	        long end = System.currentTimeMillis();
	        System.out.println("[LOG] Around End: " + pjp.getSignature().getName() + " | Time taken: " + (end - start) + "ms");
	        return result;
	    }
	}

