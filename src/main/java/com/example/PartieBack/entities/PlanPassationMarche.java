package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class PlanPassationMarche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PPM_id;
    private String annee;
    private String ref_ac;
    private String intitule_Ac;
    private String cout;
    private String nature;


}
