package com.example.PartieBack.Service;

import com.example.PartieBack.entities.Facture;

import java.util.List;

public interface FactureService {
    Facture saveFacture(Facture fr);

    Facture updateFacture(Facture fr);

    void deleteFacture(Facture fr);

    void deleteFactureById(Long id);

    Facture getFacture(Long id);

    List<Facture> getAllFactures();
}
