package com.tutorial.spring.todolist.service;

import com.tutorial.spring.todolist.entities.Todo;
import com.tutorial.spring.todolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> findAllTodos() {
        List<Todo> result = new ArrayList<>();
        this.todoRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Todo createTodo(Todo todo) {
        return this.todoRepository.save(todo);
    }

    @Override
    public void deleteTodoById(Long id) {
        this.todoRepository.deleteById(id);
    }

    @Override
    public Todo updateTodo(Todo todo) {
        Optional<Todo> oldTodo = this.todoRepository.findById(todo.getId());
        if (null != oldTodo) {
            this.todoRepository.save(todo);
        }
        return null;
    }

    @Override
    public Todo getTodoById(Long id) {
        return this.todoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Todo> findByNiveau(int niveau) {
        return this.todoRepository.findByNiveau(niveau);
    }

    @Override
    public List<Todo> findByLibelle(String libelle) {
        return this.todoRepository.findByLibelle(libelle);
    }

    @Override
    public List<Todo> rechercherTousParNiveauAsc() {
        return this.todoRepository.rechercherTousParNiveauAsc();
    }
}
