package com.example.springboot.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:application.yml", factory = YamlPropertySourceFactory.class)
public class YAMLConfig
{
    @Value("${server.port}")
    private String SERVER_PORT;

    public String getServerPort() {
        return SERVER_PORT;
    }
}
