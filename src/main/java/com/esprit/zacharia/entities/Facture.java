package com.esprit.zacharia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idFacture;
    private float montantRemis;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    private Boolean archive;
    @OneToMany(mappedBy="facture")
    @JsonIgnore
    private Set<Reglement> reglements;
    @OneToMany(mappedBy="facture")
    @JsonIgnore
    private Set<DetailFacture> DetailFacture;
    @ManyToOne
    private Fournisseur fournisseur;

}
