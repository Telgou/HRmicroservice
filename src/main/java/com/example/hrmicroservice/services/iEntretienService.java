package com.example.hrmicroservice.services;

import entities.Entretien;

import java.util.List;

public interface iEntretienService {

    List<Entretien> retrieveAllEntretiens();

    Entretien addEntretien(Entretien e);

    Entretien updateEntretien(Entretien e);

    Entretien retrieveEntretien(Long idEntretien);

    void removeEntretien(Long idEntretien);

}