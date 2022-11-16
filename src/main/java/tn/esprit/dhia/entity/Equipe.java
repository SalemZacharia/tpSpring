package tn.esprit.dhia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEquipe;
    private String nomEquipe;
    private Niveau  niveau;

    @ManyToMany(mappedBy = "listEquipe")
    private Set<Etudiant> etudiants;

}
