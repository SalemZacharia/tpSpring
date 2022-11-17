package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @OneToMany(mappedBy="produits")
    private Set<DetailFacture>   detailFactureSet;
    @ManyToOne
    private Stock stocks;
    @ManyToOne
    private CategorieProduit categorieProduit;
}