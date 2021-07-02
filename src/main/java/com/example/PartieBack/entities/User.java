package com.example.PartieBack.entities;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long utilisateur_id;
    private String nomUtilisateur;
    private String motDePasse;
    private Date datenaissance;
    private Long telephone;
    private String nom;
    private String prenom;
    private String email;
    private String structure;
    private boolean chefProjet;
    private boolean admin;



    @OneToOne(cascade=CascadeType.ALL)
    private Profil profil;

    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="user_projet",joinColumns =@JoinColumn(name="utilisateur_id") ,
            inverseJoinColumns =@JoinColumn(name="projet_id"))
    private Set<Projet> projets;

}

