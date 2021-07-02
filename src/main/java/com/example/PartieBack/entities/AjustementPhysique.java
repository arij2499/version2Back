package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
public class AjustementPhysique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Aj_id;
    private String annee_Aj;
    private String avancement_Aj;

}
