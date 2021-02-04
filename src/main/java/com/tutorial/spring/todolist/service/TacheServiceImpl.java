package com.tutorial.spring.todolist.service;

import com.tutorial.spring.todolist.entities.Tache;
import com.tutorial.spring.todolist.repositories.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implémentation de l'interface du service de gestion des {@link Tache}
 */
@Service
public class TacheServiceImpl implements TacheService {

    /**
     * Repository pour {@link Tache}
     */
    @Autowired
    private TacheRepository tacheRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Tache> rechercherToutes() {
        List<Tache> result = new ArrayList<>();
        this.tacheRepository.findAll().forEach(result::add);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tache creer(Tache tache) {
        return this.tacheRepository.save(tache);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void supprimer(Long id) {
        this.tacheRepository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tache mettreAJour(Tache tache) {
        Optional<Tache> optionalTache = this.tacheRepository.findById(tache.getId());
        if (null != optionalTache) {
            this.tacheRepository.save(tache);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tache consulter(Long id) {
        return this.tacheRepository.findById(id).orElse(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Tache> rechercherParPriorite(int priorite) {
        return this.tacheRepository.findByPriorite(priorite);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Tache> rechercherParLibelle(String libelle) {
        return this.tacheRepository.findByLibelle(libelle);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Tache> rechercherToutesParPrioriteAsc() {
        return this.tacheRepository.rechercherToutesParPrioriteAsc();
    }
}
