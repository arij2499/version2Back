package com.example.PartieBack.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

import java.util.Set;

@Data
@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long projet_id;
    private String intitule;
    private long cout;
    private boolean En_difficulte;
    private String stade;
    private Date date_ajout;
    private Date datedebut;
    private Date datefin;
    private String difficulte;
    private String localisation;




    @OneToMany( fetch = FetchType.EAGER)
    private Set<PlanInitialFinancier> pif;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<PlanTravailFinancier> ptf;
    
    @OneToMany( fetch = FetchType.EAGER)
    private Set<Facture> factures;


    @OneToMany( fetch = FetchType.EAGER)
    private Set<PlanPassationMarche> PPM;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<Marche> marche;



    @OneToMany( fetch = FetchType.EAGER)
    private Set<AppelOffre> appelOffre;


    @OneToMany( fetch = FetchType.EAGER)
    private Set<RealisationPhysique> RAP;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<PlannficationPhysique> PLP;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<AjustementPhysique> AJP;
    @OneToMany( fetch = FetchType.EAGER)
    private Set<publication> pub;

}
