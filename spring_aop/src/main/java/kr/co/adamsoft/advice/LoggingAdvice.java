package kr.co.adamsoft.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
	@Around("execution(* kr.co.adamsoft.HomeController*.*(..))")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println( methodName +  " is calling.");
		long start = System.currentTimeMillis();
		Object obj = joinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println(methodName +" was called.");
		System.out.println("[LOG] 처리시간 " + (end-start)/ 1000 + "초");
		return obj;
	}
}