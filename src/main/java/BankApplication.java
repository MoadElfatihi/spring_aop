import configration.LoggerConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BankService;

public class BankApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LoggerConfig.class);
        BankService service = (BankService) ctx.getBean("bankService");
       service.transaction(1);
    }
}
