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
public class Etudiant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @ManyToOne
    private departement dep;
    @OneToOne(mappedBy = "etudiant")
    private Contrat contrat;
    @ManyToMany
    private Set<Equipe> listEquipe;
}
