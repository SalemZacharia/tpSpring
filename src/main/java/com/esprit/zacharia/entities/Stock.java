package com.esprit.zacharia.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idStock;
    private Integer qte;
    private Integer qteMin;
    private String libelleStock;
  @OneToMany(mappedBy = "stocks")
    private Set<Produit> produitSet;
}
