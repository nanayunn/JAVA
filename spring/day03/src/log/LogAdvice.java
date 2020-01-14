package log;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogAdvice {
	public void before(JoinPoint jp) {
		Date date = new Date();
		String mname =
				jp.getSignature().getName();
		Object argobj[] =
				jp.getArgs();
		System.out.println("Log:....."+date.toString()+mname+" "+argobj[0].toString());
	}
	public void afterReturn(JoinPoint jp, Object reObject) {
		System.out.println("Log:Start.....");
		String mname = 
				jp.getSignature().getName();
		Object arg[]=jp.getArgs();
		System.out.println("Log" + mname+" "+arg[0].toString()+reObject.toString());
	}
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		StopWatch w = new StopWatch();
		w.start();
		System.out.println("before....");
		
		result = pjp.proceed();
		System.out.println("after....");
		w.stop();
		System.out.println(w.getTotalTimeMillis());
		return result;
	}
}
