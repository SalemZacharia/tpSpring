package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idCategorie;
    private String codeProduti;
    private String libelleCategorie;
    @OneToMany(mappedBy = "categorieProduit")
    private Set<Produit> produitSet;

}
