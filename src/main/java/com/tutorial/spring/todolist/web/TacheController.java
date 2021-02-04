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

    /**
     * Creation d'une nouvelle {@link Tache}
     *
     * @param tache la {@link Tache} a creer
     *
     * @return la nouvelle {@link Tache} creee
     */
    @PostMapping
    public Tache creer(@RequestBody Tache tache) {
        return this.tacheService.creer(tache);
    }

    /**
     * Recherche toutes les {@link Tache}
     *
     * @return la liste de toutes les {@link Tache}
     */
    @GetMapping
    public List<Tache> rechercherToutes() {
        return this.tacheService.rechercherToutes();
    }

    /**
     * Recherche toutes les {@link Tache} triees par priorite ascendante
     *
     * @return la liste de toutes les {@link Tache} triees par priorite ascendante
     */
    @GetMapping(path = "asc")
    public List<Tache> rechercherToutesParPrioriteAsc() {
        return this.tacheService.rechercherToutesParPrioriteAsc();
    }

    /**
     * Recherche toutes les {@link Tache} suivant une priorite
     *
     * @param priorite la priorite de la {@link Tache}
     *
     * @return la liste des {@link Tache} correspondant a la priorite
     */
    @GetMapping(path = "priorite={priorite}")
    public List<Tache> rechercherParPriorite(@PathVariable int priorite) {
        return this.tacheService.rechercherParPriorite(priorite);
    }

    /**
     * Recherche toutes les {@link Tache} suivant un libelle ou une partie du libelle
     *
     * @param libelle le libelle de la {@link Tache}
     *
     * @return la liste des {@link Tache} correspondant au libelle ou une partie du libelle
     */
    @GetMapping(path = "libelle={libelle}")
    public List<Tache> rechercherParLibelle(@PathVariable String libelle) {
        return this.tacheService.rechercherParLibelle(libelle);
    }

    /**
     * Consultation d'une {@link Tache} suivant son id
     *
     * @param id l'id de la {@link Tache}
     *
     * @return la {@link Tache} correspondant a l'id
     */
    @GetMapping(path = "{id}")
    public Tache consulter(@PathVariable Long id) {
        return this.tacheService.consulter(id);
    }

    /**
     * Mise a jour d'une {@link Tache}
     *
     * @param tache la {@link Tache} a mettre a jour
     *
     * @return la {@link Tache} mise a jour
     */
    @PutMapping
    public Tache mettreAJour(@RequestBody Tache tache) {
        return this.tacheService.mettreAJour(tache);
    }

    /**
     * Suppresion d'une {@link Tache} suivant son id
     *
     * @param id l'id de la {@link Tache}
     */
    @DeleteMapping(path = "{id}")
    public void supprimer(@PathVariable Long id) {
        this.tacheService.supprimer(id);
    }
}
