package com.example.PartieBack.Service;

import com.example.PartieBack.entities.Projet;
import com.example.PartieBack.entities.publication;

import java.util.List;

public interface pubService {
    publication savePublication(publication p);

    publication updatePublication(publication p);

    void deletePublication(publication p);

    void deletePublicationById(Long id);

    publication getPublication(Long id);

    List<publication> getAllPublications();
}
