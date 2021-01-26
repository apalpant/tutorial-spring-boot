package com.tutorial.spring.todolist.web;

import com.tutorial.spring.todolist.entities.Todo;
import com.tutorial.spring.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return this.todoService.createTodo(todo);
    }

    @GetMapping
    public List<Todo> getList() {
        return todoService.findAllTodos();
    }

    @GetMapping(path = "asc")
    public List<Todo> getListAsc() {
        return todoService.rechercherTousParNiveauAsc();
    }

    @GetMapping(path = "niveau={niveau}")
    public List<Todo> getListByNiveau(@PathVariable int niveau) {
        return todoService.findByNiveau(niveau);
    }

    @GetMapping(path = "libelle={libelle}")
    public List<Todo> getListByLibelle(@PathVariable String libelle) {
        return todoService.findByLibelle(libelle);
    }

    @GetMapping(path = "{id}")
    public Todo getById(@PathVariable Long id) {
        return this.todoService.getTodoById(id);
    }

    @PutMapping
    public Todo updateTodo(@RequestBody Todo todo) {
        return this.todoService.updateTodo(todo);
    }

    @DeleteMapping(path = "{id}")
    public void deleteTodo(@PathVariable Long id) {
        this.todoService.deleteTodoById(id);
    }
}
