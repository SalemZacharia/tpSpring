package com.esprit.zacharia.services;

import com.esprit.zacharia.repositories.FournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FournisseurServiceImp implements IFournisseurService{

    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public void assignOperateurToFacture(Long idOperateur, Long idFacture){

    }
}
