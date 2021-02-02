package com.tutorial.spring.todolist.web;

import com.tutorial.spring.todolist.entities.Tache;
import com.tutorial.spring.todolist.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller dedie à la gestion des {@link Tache}
 */
@RestController
@RequestMapping("api/todo")
@CrossOrigin(origins = "http://localhost:4200")
public class TacheController {

    /**
     * Le service de gestion des {@link Tache}
     */
    @Autowired
    private TacheService tacheService;

    @PostMapping
    public Tache creer(@RequestBody Tache tache) {
        return this.tacheService.creer(tache);
    }

    @GetMapping
    public List<Tache> rechercherTous() {
        return this.tacheService.rechercherTous();
    }

    @GetMapping(path = "asc")
    public List<Tache> rechercherTousParNiveauAsc() {
        return this.tacheService.rechercherTousParNiveauAsc();
    }

    @GetMapping(path = "niveau={niveau}")
    public List<Tache> rechercherParNiveau(@PathVariable int niveau) {
        return this.tacheService.rechercherParNiveau(niveau);
    }

    @GetMapping(path = "libelle={libelle}")
    public List<Tache> rechercherParLibelle(@PathVariable String libelle) {
        return this.tacheService.rechercherParLibelle(libelle);
    }

    @GetMapping(path = "{id}")
    public Tache consulter(@PathVariable Long id) {
        return this.tacheService.consulter(id);
    }

    @PutMapping
    public Tache mettreAJour(@RequestBody Tache tache) {
        return this.tacheService.mettreAJour(tache);
    }

    @DeleteMapping(path = "{id}")
    public void supprimer(@PathVariable Long id) {
        this.tacheService.supprimer(id);
    }
}
