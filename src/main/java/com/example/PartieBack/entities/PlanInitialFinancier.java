package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class PlanInitialFinancier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PIF_id;
    private String annee_PIF;
    private Long engagement_PIF;
    private Long paiement_PIF;


}
