package com.example.hrmicroservice.controllers;

import com.example.hrmicroservice.services.EntretienService;
import entities.Entretien;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/entretien")
public class EntretienController {

    EntretienService entretienService;

    @GetMapping("/")
    public List<Entretien> getAllEntretiens() {
        return entretienService.retrieveAllEntretiens();
    }

    @GetMapping("/{id}")
    public Entretien getEntretienById(@PathVariable Long id) {
        return entretienService.retrieveEntretien(id);
    }

    @PostMapping("/")
    public Entretien addEntretien(@RequestBody Entretien entretien) {
        return entretienService.addEntretien(entretien);
    }

    @PutMapping("/")
    public Entretien updateEntretien(@RequestBody Entretien entretien) {
        return entretienService.updateEntretien(entretien);
    }

    @DeleteMapping("/{id}")
    public void deleteEntretien(@PathVariable Long id) {
        entretienService.removeEntretien(id);
    }

}