package com.empfehlo.empfehlungsapp.controllers;

import com.empfehlo.empfehlungsapp.entities.Mitarbeiter;
import com.empfehlo.empfehlungsapp.repositories.MitarbeiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mitarbeiter")
public class MitarbeiterController {

    @Autowired
    private MitarbeiterRepository mitarbeiterRepository;

    // Alle Mitarbeiter auslesen (GET)
    @GetMapping
    public List<Mitarbeiter> getAlleMitarbeiter() {
        return mitarbeiterRepository.findAll();
    }

    // Neuen Mitarbeiter speichern (POST)
    @PostMapping
    public Mitarbeiter addMitarbeiter(@RequestBody Mitarbeiter mitarbeiter) {
        return mitarbeiterRepository.save(mitarbeiter);
    }
}

