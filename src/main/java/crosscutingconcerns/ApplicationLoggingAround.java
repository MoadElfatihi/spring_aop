package crosscutingconcerns;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class ApplicationLoggingAround {

    @Around("execution(* service.BankService.*(..))")
    public void transaction(ProceedingJoinPoint jp) throws Throwable{
        try {
            System.out.println("around 1");
            jp.proceed();
            System.out.println("around 2");
        } catch(Exception e){
            System.out.println("rollback");
        }
    }
}
