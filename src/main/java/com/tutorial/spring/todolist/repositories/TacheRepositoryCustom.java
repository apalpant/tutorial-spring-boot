package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Tache;

import java.util.List;

/**
 * Interface custom de gestion de repository de {@link Tache}
 */
public interface TacheRepositoryCustom {

    /**
     * Recherche toutes les {@link Tache} triees par priorite ascendante
     *
     * @return la liste de toutes les {@link Tache} triees par priorite ascendante
     */
    List<Tache> rechercherToutesParPrioriteAsc();
}
