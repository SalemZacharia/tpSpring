package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule ;
    @OneToOne(mappedBy = "detail_Fournisseur")
    private Fournisseur fournisseur;
}
