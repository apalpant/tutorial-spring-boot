package com.tutorial.spring.todolist.service;

import com.tutorial.spring.todolist.entities.Tache;

import java.util.List;

/**
 * Interface pour le service de gestion des {@link Tache}
 */
public interface TacheService {

    /**
     * Recherche toutes les {@link Tache}
     *
     * @return la liste de toutes les {@link Tache}
     */
    List<Tache> rechercherToutes();

    /**
     * Creation d'une nouvelle {@link Tache}
     *
     * @param tache la {@link Tache} a creer
     *
     * @return la nouvelle {@link Tache} creee
     */
    Tache creer(Tache tache);

    /**
     * Suppresion d'une {@link Tache} suivant son id
     *
     * @param id l'id de la {@link Tache}
     */
    void supprimer(Long id);

    /**
     * Mise a jour d'une {@link Tache}
     *
     * @param tache la {@link Tache} a mettre a jour
     *
     * @return la {@link Tache} mise a jour
     */
    Tache mettreAJour(Tache tache);

    /**
     * Consultation d'une {@link Tache} suivant son id
     *
     * @param id l'id de la {@link Tache}
     *
     * @return la {@link Tache} correspondant a l'id
     */
    Tache consulter(Long id);

    /**
     * Recherche toutes les {@link Tache} suivant une priorite
     *
     * @param priorite la priorite de la {@link Tache}
     *
     * @return la liste des {@link Tache} correspondant a la priorite
     */
    List<Tache> rechercherParPriorite(int priorite);

    /**
     * Recherche toutes les {@link Tache} suivant un libelle ou une partie du libelle
     *
     * @param libelle le libelle de la {@link Tache}
     *
     * @return la liste des {@link Tache} correspondant au libelle ou une partie du libelle
     */
    List<Tache> rechercherParLibelle(String libelle);

    /**
     * Recherche toutes les {@link Tache} triees par priorite ascendante
     *
     * @return la liste de toutes les {@link Tache} triees par priorite ascendante
     */
    List<Tache> rechercherToutesParPrioriteAsc();
}
