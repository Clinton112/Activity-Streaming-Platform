package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
@ComponentScan("com.stackroute")
public class DownStreamService {
    public static void main(String args[])
    {
        SpringApplication.run(DownStreamService.class, args);

    }
}
