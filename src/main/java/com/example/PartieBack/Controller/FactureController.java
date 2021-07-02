package com.example.PartieBack.Controller;

import com.example.PartieBack.Service.FactureService;
import com.example.PartieBack.entities.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factures/api")
@CrossOrigin(origins ="http://localhost:4200")
public class FactureController {
    @Autowired
    FactureService factureService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Facture>> getAllFactures() {
        List<Facture> factures = factureService.getAllFactures();
        return new ResponseEntity<>(factures, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFactureById(@PathVariable("id") Long id) {
        factureService.deleteFactureById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Facture> updateFacture(@RequestBody Facture fr) {
        Facture updateFacture = factureService.updateFacture(fr);
        return new ResponseEntity<>(updateFacture, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Facture> addFacture(@RequestBody Facture fr) {
        Facture newFacture = factureService.saveFacture(fr);
        return new ResponseEntity<>(newFacture, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public Facture findFactureById(@PathVariable("id") Long id)

    {
        return factureService.getFacture(id);
    }
}
