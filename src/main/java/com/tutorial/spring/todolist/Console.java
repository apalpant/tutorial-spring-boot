package com.tutorial.spring.todolist;

import com.tutorial.spring.todolist.entities.Tache;
import com.tutorial.spring.todolist.service.LogService;
import com.tutorial.spring.todolist.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Console implements CommandLineRunner {

    @Autowired
    LogService logService;

    @Autowired
    TacheService tacheService;

    @Override
    public void run(String... args) throws Exception {
        this.logService.tracer("Console (before main ending...) !");

        this.tacheService.creer(new Tache("un", 1));
        this.tacheService.creer(new Tache("deux", 2));
        this.tacheService.creer(new Tache("trois", 1));
        this.tacheService.creer(new Tache("troisieme", 1));
    }
}
