package com.esprit.zacharia.services;

import com.esprit.zacharia.entities.CategorieProduit;
import com.esprit.zacharia.repositories.CategorieProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategorieProduitServiceImp implements ICategorieProduitService{
    @Autowired
    CategorieProduitRepository cpr;
    public List<CategorieProduit> retrieveAllCategorieProduits(){
        return cpr.findAll();
    }
    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp){
        return cpr.save(cp);
    }
    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp){
        return cpr.save(cp);
    }
    @Override
    public CategorieProduit retrieveCategorieProduit(Long id){
        return cpr.findById(id).orElse(null);
    }
    @Override
    public void removeCategorieProduit(Long id){
        cpr.deleteById(id);
    }
    }

