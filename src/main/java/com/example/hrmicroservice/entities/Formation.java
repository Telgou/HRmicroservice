package com.example.hrmicroservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Formation")
public class Formation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFormation")
    private Long idFormation;
    private String Titre;
    private String description;
    private String formateur;
    private String participant;


}