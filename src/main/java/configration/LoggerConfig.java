package configration;

import crosscutingconcerns.ApplicationLogging;
import crosscutingconcerns.ApplicationLoggingAround;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import service.BankService;

@Configuration
@EnableAspectJAutoProxy
public class LoggerConfig {

    @Bean
    public ApplicationLogging applicationLogging() throws Exception {
        return new ApplicationLogging();
    }

    @Bean
    public BankService bankService() throws Exception {
        return new BankService();
    }

    @Bean
    public ApplicationLoggingAround applicationLoggingAround() throws Exception {
        return new ApplicationLoggingAround();
    }
}
