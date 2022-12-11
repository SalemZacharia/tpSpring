package com.esprit.zacharia.services;

import com.esprit.zacharia.entities.Facture;

import java.util.List;

public interface IFactureService {
    Facture addFacture(Facture facture);

    void annulerFacture(Long id);
    void assignOperateurToFacture(Long idOperateur, Long idFacture);
    List<Facture> getFacturesByFournisseur(Long idfournisseur);
}
