package com.kaanaydemir.openaidemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "openai")
public record OpenApiConfiguration(String url) {
}
