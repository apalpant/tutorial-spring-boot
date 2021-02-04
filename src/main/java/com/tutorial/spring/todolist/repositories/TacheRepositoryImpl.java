package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Tache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Implementation de {@link TacheRepositoryCustom}
 */
@Repository
public class TacheRepositoryImpl implements TacheRepositoryCustom {

    /**
     * L'entity manager
     */
    @Autowired
    EntityManager entityManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Tache> rechercherToutesParPrioriteAsc() {
        return this.entityManager.createQuery("SELECT t FROM Tache t ORDER BY t.priorite ASC", Tache.class).getResultList();
    }
}
