package com.example.eval_spring.service;

import com.example.eval_spring.entity.Editeur;

import com.example.eval_spring.repository.EditeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditeurService {
    @Autowired
    private EditeurRepository editeurRepository;

    public List<Editeur> getAll () {
        return(List<Editeur>) editeurRepository.findAll();
    }

    public void delete (Long id) {
        editeurRepository.deleteById(id);
    }
}
