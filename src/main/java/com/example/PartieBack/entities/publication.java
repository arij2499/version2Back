package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pub_id;
    private String etat;
    private Date date_lancement;
    private Date date_notification;
}
