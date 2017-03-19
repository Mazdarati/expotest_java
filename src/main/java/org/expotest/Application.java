package org.expotest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.expotest.config.DBConfig;
import org.expotest.config.ViewConfig;
import org.expotest.config.WebSecurityConfig;
import org.expotest.exceptions.AccessDeniedException;
import org.expotest.models.User;
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
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

}
