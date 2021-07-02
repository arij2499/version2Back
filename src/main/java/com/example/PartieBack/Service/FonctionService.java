package com.example.PartieBack.Service;

import com.example.PartieBack.entities.Fonction;

import java.util.List;

public interface FonctionService {


    Fonction saveFonction(Fonction fc);

    Fonction updateFonction(Fonction fc);

    void deleteFonction(Fonction fc);

    void deleteFonctionById(Long id);

    Fonction getFonction(Long id);

    List<Fonction> getAllFonctions();
}
