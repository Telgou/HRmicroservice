package com.example.hrmicroservice.services;


import com.example.hrmicroservice.repositories.EntretienRepository;
import entities.Entretien;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EntretienService implements iEntretienService {


    EntretienRepository entretienRepository;
    @Override
    public List<Entretien> retrieveAllEntretiens() {
        return entretienRepository.findAll();
    }

    @Override
    public Entretien addEntretien(Entretien e) {
        return entretienRepository.save(e);
    }

    @Override
    public Entretien updateEntretien(Entretien e) {
        return entretienRepository.save(e);
    }

    @Override
    public Entretien retrieveEntretien(Long idEntretien) {
        return entretienRepository.findById(idEntretien).get();
    }

    @Override
    public void removeEntretien(Long idEntretien) {
        entretienRepository.deleteById(idEntretien);
    }

}