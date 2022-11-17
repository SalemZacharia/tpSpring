package com.esprit.zacharia.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idReglement;
    private float montantPaye;
    private float montantRestant;
    private boolean payee;
    @Temporal(TemporalType.DATE)
    private Date dateReglement;
    @ManyToOne
    private Facture facture;
}
