package com.tutorial.spring.todolist.service;

import com.tutorial.spring.todolist.entities.Tache;

import java.util.List;

/**
 * Interface pour le service de gestion des {@link Tache}
 */
public interface TacheService {

    /**
     *
     * @return
     */
    List<Tache> rechercherTous();

    /**
     *
     * @param tache
     * @return
     */
    Tache creer(Tache tache);

    /**
     *
     * @param id
     */
    void supprimer(Long id);

    /**
     *
     * @param tache
     * @return
     */
    Tache mettreAJour(Tache tache);

    /**
     *
     * @param id
     * @return
     */
    Tache consulter(Long id);

    /**
     *
     * @param niveau
     * @return
     */
    List<Tache> rechercherParNiveau(int niveau);

    /**
     *
     * @param libelle
     * @return
     */
    List<Tache> rechercherParLibelle(String libelle);

    /**
     *
     * @return
     */
    List<Tache> rechercherTousParNiveauAsc();
}
