package com.example.PartieBack.Service;

import com.example.PartieBack.Repository.FactureRepository;
import com.example.PartieBack.Repository.FonctionRepository;
import com.example.PartieBack.entities.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService{
    @Autowired
    FactureRepository factureRep;
    @Override
    public Facture saveFacture(Facture fr) {
        return factureRep.save(fr);
    }

    @Override
    public Facture updateFacture(Facture fr) {
        return factureRep.save(fr);
    }

    @Override
    public void deleteFacture(Facture fr) {
        factureRep.delete(fr);
    }

    @Override
    public void deleteFactureById(Long id) {
        factureRep.deleteById(id);
    }

    @Override
    public Facture getFacture(Long id) {
        return factureRep.findById(id).get();
    }

    @Override
    public List<Facture> getAllFactures() {
        return factureRep.findAll();
    }
}
