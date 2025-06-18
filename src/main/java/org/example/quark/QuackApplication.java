package org.example.quark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class QuackApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuackApplication.class, args);
    }
}
