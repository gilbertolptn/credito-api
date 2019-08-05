package br.com.tt.creditoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CreditoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditoApiApplication.class, args);
    }

}
