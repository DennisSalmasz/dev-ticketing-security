package com.cyber;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevTicketingOrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevTicketingOrmApplication.class, args);
    }

    //third party beans need to be inside @Configuration -- @SpringBootApplication covers @Configuration !!
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

}
