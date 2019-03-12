package com.sanilk.rfidtemp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Rfidtemp3Application {

    public static void main(String[] args) {
        SpringApplication.run(Rfidtemp3Application.class, args);
    }

    @Bean
    public Service getService(){
        return new Service();
    }

}
