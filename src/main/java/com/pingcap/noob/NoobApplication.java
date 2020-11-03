package com.pingcap.noob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class NoobApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoobApplication.class, args);
    }

}
