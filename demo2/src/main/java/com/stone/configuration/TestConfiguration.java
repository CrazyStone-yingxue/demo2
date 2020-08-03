package com.stone.configuration;

import com.stone.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class TestConfiguration {
    @Bean(name = "user")
    public User getUser() {
        User user = new User("1", "石头", "123466", "110@163.com");
        return user;
    }
}
