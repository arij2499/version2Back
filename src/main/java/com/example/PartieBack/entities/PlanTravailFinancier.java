package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class PlanTravailFinancier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PTF_id;
    private String annee_PTF;
    private Long engagement_PTF;
    private Long paiement_PTF;


}
