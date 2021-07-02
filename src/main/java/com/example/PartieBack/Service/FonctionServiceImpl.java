package com.example.PartieBack.Service;

import com.example.PartieBack.Repository.FonctionRepository;
import com.example.PartieBack.entities.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FonctionServiceImpl implements FonctionService {

    @Autowired
    FonctionRepository fonctionRep;
    @Override
    public Fonction saveFonction(Fonction fc) {
        return fonctionRep.save(fc);
    }

    @Override
    public Fonction updateFonction(Fonction fc) {
        return fonctionRep.save(fc);
    }

    @Override
    public void deleteFonction(Fonction fc) {
        fonctionRep.delete(fc);
    }

    @Override
    public void deleteFonctionById(Long id) {

        fonctionRep.deleteById(id);
    }

    @Override
    public Fonction getFonction(Long id) {
        return fonctionRep.findById(id).get();
    }

    @Override
    public List<Fonction> getAllFonctions() {
        return fonctionRep.findAll();
    }
}
