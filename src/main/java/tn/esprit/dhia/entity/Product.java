package tn.esprit.dhia.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private String nom;
    private int prix;



}
