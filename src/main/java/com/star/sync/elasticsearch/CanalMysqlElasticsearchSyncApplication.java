package com.star.sync.elasticsearch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 */
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.star.sync.elasticsearch.dao")
public class CanalMysqlElasticsearchSyncApplication {
    public static void main(String[] args) {
        SpringApplication.run(CanalMysqlElasticsearchSyncApplication.class, args);
    }
}