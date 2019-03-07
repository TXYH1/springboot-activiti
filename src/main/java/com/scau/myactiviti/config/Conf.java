package com.scau.myactiviti.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Conf {

    @Bean
    public DataSource getDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setUrl("jdbc:mysql:///activiti");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return druidDataSource;
    }
}
