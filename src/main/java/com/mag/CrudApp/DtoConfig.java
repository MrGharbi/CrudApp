package com.mag.CrudApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DtoConfig {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Bean
    public int run (String... args) throws Exception{
        String sql = "CREATE TABLE IF NOT EXISTS testmag ( " +
                "user_id UUID PRIMARY KEY," +
                "firstName VARCHAR(50) UNIQUE NOT NULL," +
                "lastName VARCHAR(50) UNIQUE NOT NULL," +
                "email VARCHAR(50) UNIQUE NOT NULL);";
        int result =jdbcTemplate.update(sql);
        System.out.println("Hey hey it's Done");
        System.out.println(result);
        return result;
    }
}
