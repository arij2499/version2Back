package com.example.PartieBack.Service;

import com.example.PartieBack.Repository.ProfilRepository;
import com.example.PartieBack.Repository.PublicationRepository;
import com.example.PartieBack.entities.publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl  implements pubService{


    @Autowired
    PublicationRepository pubRep;

    @Override
    public publication savePublication(publication p) {
        return pubRep.save(p);
    }

    @Override
    public publication updatePublication(publication p) {
        return pubRep.save(p);
    }

    @Override
    public void deletePublication(publication p) {
        pubRep.delete(p);
    }

    @Override
    public void deletePublicationById(Long id) {
        pubRep.deleteById(id);
    }

    @Override
    public publication getPublication(Long id) {
        return pubRep.findById(id).get();
    }

    @Override
    public List<publication> getAllPublications() {
        return pubRep.findAll();
    }
}
