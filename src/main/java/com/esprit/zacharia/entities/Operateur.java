package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idOperateur;
    private String nom;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Facture> factureSet;
}
