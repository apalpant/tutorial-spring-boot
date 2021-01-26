package com.tutorial.spring.todolist.service;

import com.tutorial.spring.todolist.entities.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAllTodos();

    Todo createTodo(Todo todo);

    void deleteTodoById(Long id);

    Todo updateTodo(Todo todo);

    Todo getTodoById(Long id);

    List<Todo> findByNiveau(int niveau);

    List<Todo> findByLibelle(String libelle);

    List<Todo> rechercherTousParNiveauAsc();
}
