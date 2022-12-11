package com.esprit.zacharia.repositories;

import com.esprit.zacharia.entities.Facture;
import com.esprit.zacharia.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {
    List<Facture> getFacturesByFournisseur(Fournisseur fournisseur);
}
