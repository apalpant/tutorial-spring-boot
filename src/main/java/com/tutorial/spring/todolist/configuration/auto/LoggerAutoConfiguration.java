package com.tutorial.spring.todolist.configuration.auto;

import com.tutorial.spring.todolist.configuration.properties.LogProperties;
import com.tutorial.spring.todolist.service.LogService;
import com.tutorial.spring.todolist.service.LogServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LogService.class)
@EnableConfigurationProperties(LogProperties.class)
public class LoggerAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LogService logService(){
        return new LogServiceImpl();
    }
}
