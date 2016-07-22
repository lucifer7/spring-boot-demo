package com.yang;

import com.yang.runner.StartupRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MainApplication {
    @Bean
    public StartupRunner schedulerRunner() {
        return new StartupRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
