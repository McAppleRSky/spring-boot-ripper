package com.ironbank.moneyraven;

import com.ironbank.moneyraven.model.ProphetProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

// https://github.com/lavcraft/spring-boot-ripper-gradle
@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class MoneyRavenApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
        SpringApplication.run(MoneyRavenApplication.class, args);
    }
}
