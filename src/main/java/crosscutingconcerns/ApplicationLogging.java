package crosscutingconcerns;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ApplicationLogging{

    @After("execution(* service.BankService.*(..))")
    public void after(JoinPoint jp) throws Throwable{
        System.out.println("after running ... ");
    }

    @Before("execution(* service.BankService.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("before runing ...");
    }

    @AfterThrowing("execution(* service.BankService.*(..))")
    public void inCaseOfException(JoinPoint jp){
        System.out.println("exception thrown detected by advice");
    }
}
