package com.telusko.simpleWebApp.config;

import org.postgresql.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DbCofig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        //get values from environment variable:
        String dbUrl = System.getenv("SPRING_DATASOURCE_URL");
        String dbUser = System.getenv("SPRING_DATASOURCE_USERNAME");
        String dbPswd = System.getenv("SPRING_DATASOURCE_PASSWORD");

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(dbUrl != null ? dbUrl : "jdbc:postgresql://db:5432/telusko");
        dataSource.setUsername(dbUser != null ? dbUser : "postgres");
        dataSource.setPassword(dbPswd != null ? dbPswd : "Postgre.3110");
//        dataSource.setUrl(dbUrl);
//        dataSource.setUsername(dbUser);
//        dataSource.setPassword(dbPswd);

        System.out.println("Database connection here.");
        return dataSource;
    }
}
