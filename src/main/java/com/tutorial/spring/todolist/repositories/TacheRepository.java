package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Tache;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Interface de gestion de repository de {@link Tache}
 */
public interface TacheRepository extends CrudRepository<Tache, Long>, TacheRepositoryCustom {

    /**
     * Recherche toutes les {@link Tache} suivant une priorite
     *
     * @param priorite la priorite de la {@link Tache}
     *
     * @return la liste des {@link Tache} correspondant a la priorite
     */
    List<Tache> findByPriorite(int priorite);


    /**
     * Recherche toutes les {@link Tache} suivant un libelle ou une partie du libelle
     *
     * @param libelle le libelle de la {@link Tache}
     *
     * @return la liste des {@link Tache} correspondant au libelle ou une partie du libelle
     */
    @Query("SELECT a FROM Tache a WHERE a.libelle LIKE '%' || :libelle || '%'")
//   Equivalent =>  @Query("SELECT a FROM Tache a WHERE a.libelle LIKE '%?1%'")

    List<Tache> findByLibelle(@Param("libelle") String libelle);
//    Equivalent => List<Tache> findByLibelleContaining(String libelle);
}
