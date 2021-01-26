package com.tutorial.spring.todolist;

import com.tutorial.spring.todolist.entities.Todo;
import com.tutorial.spring.todolist.service.LogService;
import com.tutorial.spring.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Console implements CommandLineRunner {

    @Autowired
    LogService logService;

    @Autowired
    TodoService todoService;

    @Override
    public void run(String... args) throws Exception {
        this.logService.tracer("Console (before main ending...) !");

        this.todoService.createTodo(new Todo("un", 1));
        this.todoService.createTodo(new Todo("deux", 2));
        this.todoService.createTodo(new Todo("trois", 1));
        this.todoService.createTodo(new Todo("troisieme", 1));
    }
}
