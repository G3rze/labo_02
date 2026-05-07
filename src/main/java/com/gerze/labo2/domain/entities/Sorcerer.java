package com.gerze.labo2.domain.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sorcerer")
@Data
public class Sorcerer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    @Column
    private String name;

    @Column
    private String grade;

    @Column(name = "cursed_technique")
    private String cursedTechnique;

    @Column
    private String school;

    @Column(name = "cursedEnergy")
    private String cursedEnergy;

    @Column(name = "is_active")
    private Boolean isActive;
}
