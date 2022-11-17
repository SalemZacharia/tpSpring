package com.esprit.zacharia.repositories;

import com.esprit.zacharia.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
