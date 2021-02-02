package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Tache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TacheRepositoryImpl implements TacheRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Tache> rechercherToutesParNiveauAsc() {
        return this.entityManager.createQuery("SELECT t FROM Tache t ORDER BY t.niveau ASC", Tache.class).getResultList();
    }
}
