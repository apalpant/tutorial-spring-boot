package com.tutorial.spring.todolist.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Entite representant la Tache
 */
@Entity
public class Tache implements Serializable {

    /**
     * L'id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Le libelle
     */
    private String libelle;

    /**
     * La priorite
     */
    private int priorite;

    /**
     * Constructeur vide
     */
    public Tache() {
    }

    /**
     * Constructeur
     *
     * @param libelle  le libelle de la {@link Tache}
     * @param priorite la priorite de la {@link Tache}
     */
    public Tache(String libelle, int priorite) {
        this.libelle = libelle;
        this.priorite = priorite;
    }

    /**
     * Accesseur pour l'id de la tache
     *
     * @return l'id de la tache
     */
    public Long getId() {
        return id;
    }

    /**
     * Affectation de l'id de la tache
     *
     * @param id l'id de la tache
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Accesseur pour le libelle de la tache
     *
     * @return le libelle de la tache
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Affectation du libelle de la tache
     *
     * @param libelle le libelle de la tache
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Accesseur pour la priorite de la tache
     *
     * @return la priorite de la tache
     */
    public int getPriorite() {
        return priorite;
    }

    /**
     * Affectation de la priorite de la tache
     *
     * @param priorite la priorite de la tache
     */
    public void setPriorite(int priorite) {
        this.priorite = priorite;
    }
}
