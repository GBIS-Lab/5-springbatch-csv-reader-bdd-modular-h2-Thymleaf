package com.smartphonebatch.model;

import lombok.Data;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "smartphones")
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String marque;
    private String modele;
    //private String capacite;
    private String os;
    private int anneeSortie;
    private double tailleEcran;
    private double prix;
}
