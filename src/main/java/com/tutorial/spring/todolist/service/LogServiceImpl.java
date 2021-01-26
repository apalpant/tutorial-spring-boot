package com.tutorial.spring.todolist.service;

import com.tutorial.spring.todolist.configuration.properties.LogProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);

    @Autowired
    LogProperties logProperties;

    @Override
    public void tracer(String message) {
        this.logger.info(logProperties.getPrefixe() + " " + message + " " + logProperties.getSuffixe());
    }
}
