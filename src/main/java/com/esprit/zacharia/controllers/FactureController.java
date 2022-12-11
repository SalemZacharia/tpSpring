package com.esprit.zacharia.controllers;

import com.esprit.zacharia.entities.Facture;
import com.esprit.zacharia.services.IFactureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FactureController {
    IFactureService factureService;

    @GetMapping("/{idFournisseur}")
    public List<Facture> getFacturesByFournisseur(@PathVariable(value = "idFournisseur") Long idFournisseur){
        return  factureService.getFacturesByFournisseur(idFournisseur);
    }
}
