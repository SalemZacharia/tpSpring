package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    private categorieFournisseur categorieFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<SecteurActivite> secteurActivitesSet;
    @OneToOne
    private DetailFournisseur detail_Fournisseur;
}

