package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facture_id;
    private String nom_facture;
    private String nom_client;
    private Date date_facture;
    private Date date_paiement;
}
