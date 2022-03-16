package com.example.eval_spring.repository;

import com.example.eval_spring.entity.Editeur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditeurRepository extends CrudRepository<Editeur, Long> {
}
