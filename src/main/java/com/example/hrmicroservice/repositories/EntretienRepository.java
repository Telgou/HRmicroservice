package com.example.hrmicroservice.repositories;

import entities.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntretienRepository extends JpaRepository<Entretien,Long> {

}
