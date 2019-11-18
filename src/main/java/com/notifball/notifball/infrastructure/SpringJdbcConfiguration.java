package com.notifball.notifball.infrastructure;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@Import(AbstractJdbcConfiguration.class)
public class SpringJdbcConfiguration {

    @Bean
    NamedParameterJdbcOperations operations(BasicDataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    PlatformTransactionManager transactionManager(BasicDataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public BasicDataSource postgresDataSource(
            @Value("${database.url}") String url,
            @Value("${database.username}") String username,
            @Value("${database.password}") String password,
            @Value("${database.driver}") String driver
    ) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxTotal(4);
        dataSource.setDefaultQueryTimeout(60);
        return dataSource;
    }
}
