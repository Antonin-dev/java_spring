package com.example.eval_spring.controller;


import com.example.eval_spring.entity.Editeur;
import com.example.eval_spring.service.EditeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EditeurController {
    @Autowired
    EditeurService editeur;
    @GetMapping("/")
    public String init(Model model){
        List<Editeur> editeurs = editeur.getAll();
        model.addAttribute("editeurs", editeurs);
        return "list_editeur";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        editeur.delete(id);
        return "redirect:/";
    }
}
