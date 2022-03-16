package com.example.eval_spring.controller;


import com.example.eval_spring.entity.Editeur;
import com.example.eval_spring.service.EditeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/editeur")
public class EditeurRestController {

    @Autowired
    EditeurService service;

    @GetMapping("")
    public List<Editeur> init() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void get(@PathVariable("id") long id){
        service.delete(id);
    }

    @GetMapping("/pairlist")
    public List<Editeur> listePaire() {
        List<Editeur> editeurs = service.getAll();
        List<Editeur> pairlist = new ArrayList<Editeur>();
        for (Editeur editeur : editeurs) {
            if (editeur.getId() % 2 == 0) {
                pairlist.add(editeur);
            }
        }
        return pairlist;
    }
}
