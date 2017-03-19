import com.fasterxml.jackson.databind.ObjectMapper;
import org.expotest.Application;
import org.expotest.config.DBConfig;
import org.expotest.config.ViewConfig;
import org.expotest.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Mazdarati on 12.03.2017.
 */

@EnableAspectJAutoProxy(proxyTargetClass=true)
@SpringBootApplication(scanBasePackages = {"org.expotest.controllers", "org.expotest.services"})
@Import({ WebSecurityConfig.class, DBConfig.class, ViewConfig.class})
public class ApplicationTest extends WebMvcConfigurerAdapter {

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

}
