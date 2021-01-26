package com.tutorial.spring.todolist.repositories;

import com.tutorial.spring.todolist.entities.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long>, TodoRepositoryCustom {

    List<Todo> findByNiveau(int niveau);

//    @Query("SELECT a FROM Todo a WHERE a.libelle LIKE '%?1%'")
    @Query("SELECT a FROM Todo a WHERE a.libelle LIKE '%' || :libelle || '%'")
    List<Todo> findByLibelle(@Param("libelle") String libelle);
//    Equivalent => List<Todo> findByLibelleContaining(String libelle);
}
