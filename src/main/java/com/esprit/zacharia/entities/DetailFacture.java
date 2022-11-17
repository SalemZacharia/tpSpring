package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idDetailFacture;
    private Integer qteCommande ;
    private float prixTotalDetail;
    private Integer pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produits;
}
