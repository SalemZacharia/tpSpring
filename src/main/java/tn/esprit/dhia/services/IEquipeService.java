package tn.esprit.dhia.services;

import tn.esprit.dhia.entity.Equipe;

public interface IEquipeService {
    public Equipe addEquipe (Equipe equipe);
    public Equipe getById (int id);
}
