package com.esprit.zacharia.controllers;


import com.esprit.zacharia.entities.CategorieProduit;
import com.esprit.zacharia.repositories.CategorieProduitRepository;
import com.esprit.zacharia.services.ICategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieProduitController {
    @Autowired
    ICategorieProduitService icp;
    @GetMapping("/cp")
    public List<CategorieProduit> retrieveAllStocks()
    {return icp.retrieveAllCategorieProduits();}
    @PostMapping("/addcp")
    public CategorieProduit addcpr(@RequestBody CategorieProduit s){
        return icp.addCategorieProduit(s);
    }
    @PutMapping("/updatecp")
    public CategorieProduit updateStock(@RequestBody CategorieProduit s){
        return icp.updateCategorieProduit(s);
    }
    @GetMapping("/cp/{idcp}")
    public CategorieProduit retrieveStock(@PathVariable Long idcp){
        return icp.retrieveCategorieProduit(idcp);
    }
    @DeleteMapping("/deletecp/{idcp}")
    public void removeStock(@PathVariable Long idcp){
        icp.removeCategorieProduit(idcp);
    }
}
