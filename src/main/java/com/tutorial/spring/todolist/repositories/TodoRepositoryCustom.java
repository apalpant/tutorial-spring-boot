package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Todo;

import java.util.List;

public interface TodoRepositoryCustom {

    List<Todo> rechercherTousParNiveauAsc();
}
