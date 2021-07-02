package com.example.PartieBack.Service;

import com.example.PartieBack.entities.Projet;

import java.util.List;

public interface ProjetService {
    Projet saveProjet(Projet p);

    Projet updateProjett(Projet p);

    void deleteProjet(Projet p);

    void deleteProjetById(Long id);

    Projet getProjet(Long id);

    List<Projet> getAllProjets();
}
