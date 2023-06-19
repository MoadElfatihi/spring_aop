import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BankService;

public class BankApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml");
       BankService service = (BankService) ctx.getBean("bankService");
        System.out.println(service);
    }
}
