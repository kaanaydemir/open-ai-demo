package com.kaanaydemir.openaidemo;

import com.kaanaydemir.openaidemo.config.OpenApiConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties(OpenApiConfiguration.class)
public class OpenAiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenAiDemoApplication.class, args);
    }

}
