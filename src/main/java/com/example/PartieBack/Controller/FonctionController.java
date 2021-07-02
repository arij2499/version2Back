package com.example.PartieBack.Controller;

import com.example.PartieBack.Service.FonctionService;
import com.example.PartieBack.entities.Fonction;
import com.example.PartieBack.entities.Profil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fonctions/api")
@CrossOrigin(origins ="http://localhost:4200")
public class FonctionController {
    @Autowired
    FonctionService fonctionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Fonction>> getAllFonctions() {
        List<Fonction> fonctions = fonctionService.getAllFonctions();
        return new ResponseEntity<>(fonctions, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFonctionById(@PathVariable("id") Long id) {
        fonctionService.deleteFonctionById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Fonction> updateFonction(@RequestBody Fonction fc) {
        Fonction updateFonction = fonctionService.updateFonction(fc);
        return new ResponseEntity<>(updateFonction, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Fonction> addFonction(@RequestBody Fonction fc) {
        Fonction newFonction = fonctionService.saveFonction(fc);
        return new ResponseEntity<>(newFonction, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public Fonction findFonctionById(@PathVariable ("id") Long id)

    {
        return fonctionService.getFonction(id);
    }


}