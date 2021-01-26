package com.tutorial.spring.todolist.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;

@ConfigurationProperties("custom.log")
public class LogProperties {

    Date prefixe;
    String suffixe;

    public Date getPrefixe() {
        return prefixe;
    }

    public void setPrefixe(Date prefixe) {
        this.prefixe = prefixe;
    }

    public String getSuffixe() {
        return suffixe;
    }

    public void setSuffixe(String suffixe) {
        this.suffixe = suffixe;
    }
}
