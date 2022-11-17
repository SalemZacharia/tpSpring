package com.esprit.zacharia.services;

import com.esprit.zacharia.entities.CategorieProduit;

import java.util.List;

public interface ICategorieProduitService {
    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit(CategorieProduit cp);

    CategorieProduit updateCategorieProduit(CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit(Long id);

    void removeCategorieProduit(Long id);
}
