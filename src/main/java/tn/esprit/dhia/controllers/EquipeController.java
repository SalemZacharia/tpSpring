package tn.esprit.dhia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.dhia.entity.Equipe;
import tn.esprit.dhia.services.EquipeService;

@RestController
public class EquipeController {
    @Autowired
    EquipeService equipeService;

    @PostMapping("/add")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe(equipe);
    }

    public Equipe getById(int id){
        return equipeService.getById(id);
    }
}
