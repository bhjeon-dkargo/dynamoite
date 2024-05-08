package io.dkargo.dynamoite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.dkargo.dynamoite")
public class DynamoiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamoiteApplication.class, args);
    }

}
