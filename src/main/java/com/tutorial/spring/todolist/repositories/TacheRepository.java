package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Tache;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TacheRepository extends CrudRepository<Tache, Long>, TacheRepositoryCustom {

    List<Tache> findByNiveau(int niveau);

    @Query("SELECT a FROM Tache a WHERE a.libelle LIKE '%' || :libelle || '%'")
//   Equivalent =>  @Query("SELECT a FROM Tache a WHERE a.libelle LIKE '%?1%'")

    List<Tache> findByLibelle(@Param("libelle") String libelle);
//    Equivalent => List<Tache> findByLibelleContaining(String libelle);
}
