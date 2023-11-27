package com.example.hrmicroservice.controllers;

import com.example.hrmicroservice.services.CongeService;
import entities.Conge;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/conge")
public class CongeController {

    CongeService congeService;

    @GetMapping("/")
    public List<Conge> getAllConges() {
        return congeService.retrieveAllConges();
    }

    @GetMapping("/{id}")
    public Conge getCongeById(@PathVariable Long id) {
        return congeService.retrieveConge(id);
    }

    @PostMapping("/")
    public Conge addConge(@RequestBody Conge conges) {
        return congeService.addConge(conges);
    }

    @PutMapping("/")
    public Conge updateConge(@RequestBody Conge conges) {
        return congeService.updateConge(conges);
    }

    @DeleteMapping("/{id}")
    public void deleteConge(@PathVariable Long id) {
        congeService.removeConge(id);
    }

    @PostMapping("/addconges")
    public List<Conge> addConges(@RequestBody List<Conge> conges) {
        return congeService.addConges(conges);
    }


}
