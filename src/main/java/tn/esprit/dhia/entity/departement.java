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
public class departement
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdDepart;
    private String nomDepart;
    @OneToMany(mappedBy = "dep")
    private Set<Etudiant> ListEtud;

}
