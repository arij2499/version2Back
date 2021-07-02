package com.example.PartieBack.Service;

import com.example.PartieBack.Repository.ProfilRepository;
import com.example.PartieBack.entities.Profil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilServiceImpl implements ProfilService{

    @Autowired
    ProfilRepository profilRep;

    @Override
    public Profil saveProfil(Profil pf) {
        return profilRep.save(pf);
    }

    @Override
    public Profil updateProfil(Profil pf) {
        return profilRep.save(pf);
    }

    @Override
    public void deleteProfil(Profil pf) {
        profilRep.delete(pf);
    }

    @Override
    public void deleteProfilById(Long id) {
        profilRep.deleteById(id);
    }

    @Override
    public Profil getProfil(Long id) {
        return profilRep.findById(id).get();
    }

    @Override
    public List<Profil> getAllProfils() {
        return profilRep.findAll();
    }
}
