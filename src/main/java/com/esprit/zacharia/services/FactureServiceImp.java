package com.esprit.zacharia.services;

import com.esprit.zacharia.entities.Facture;
import com.esprit.zacharia.entities.Operateur;
import com.esprit.zacharia.repositories.FactureRepository;
import com.esprit.zacharia.repositories.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class FactureServiceImp implements  IFactureService{
    @Autowired
    OperatorRepository operatorRepository;
    @Autowired
    FactureRepository factureRepository;
     @Override
    public  void assignOperateurToFacture(Long idOperateur, Long idFacture){
         Operateur operateur=operatorRepository.findById(idOperateur).orElse(null);
         Facture   facture=factureRepository.findById(idFacture).orElse(null);
         Set<Facture> fac = new HashSet<>();
         if(operateur!=null && facture != null)
         {
             fac.add(facture);
             operateur.setFactureSet(fac);
             operatorRepository.save(operateur);
         }
     }
}
