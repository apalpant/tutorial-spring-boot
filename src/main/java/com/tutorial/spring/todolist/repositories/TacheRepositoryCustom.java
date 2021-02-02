package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Tache;

import java.util.List;

public interface TacheRepositoryCustom {

    List<Tache> rechercherToutesParNiveauAsc();
}
