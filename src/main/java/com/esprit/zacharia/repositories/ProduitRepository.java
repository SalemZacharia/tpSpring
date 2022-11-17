package com.esprit.zacharia.repositories;

import com.esprit.zacharia.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
