package com.example.hrmicroservice.repositories;

import entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation,Long> {

}
