package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;
    @ManyToMany(mappedBy = "secteurActivitesSet",cascade = CascadeType.ALL)
    private Set<Fournisseur> fournisseurSet;

}
