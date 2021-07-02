package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class PlannficationPhysique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PL_id;
    private String annee_PL;
    private String avancement_PL;

}
