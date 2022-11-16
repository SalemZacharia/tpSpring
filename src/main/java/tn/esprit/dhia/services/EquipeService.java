package tn.esprit.dhia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.dhia.entity.Equipe;
import tn.esprit.dhia.repository.EquipeRepository;

@Service
public class EquipeService implements IEquipeService{
    @Autowired
    EquipeRepository equipeRepository;

    //localhost:9090/add
    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe getById(int id) {
        return equipeRepository.findById(id).orElse(null);
    }
}
