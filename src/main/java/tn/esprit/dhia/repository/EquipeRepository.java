package tn.esprit.dhia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dhia.entity.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
}
