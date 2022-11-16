package tn.esprit.dhia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dhia.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}
