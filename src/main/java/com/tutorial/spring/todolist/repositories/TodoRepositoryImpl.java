package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TodoRepositoryImpl implements TodoRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Todo> rechercherTousParNiveauAsc() {
        return this.entityManager.createQuery("SELECT t FROM Todo t ORDER BY t.niveau ASC", Todo.class).getResultList();
    }
}
