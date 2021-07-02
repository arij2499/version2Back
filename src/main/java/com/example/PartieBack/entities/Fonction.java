package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
 @Entity
public class Fonction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fonction;
    private String nom_fonction;


}
