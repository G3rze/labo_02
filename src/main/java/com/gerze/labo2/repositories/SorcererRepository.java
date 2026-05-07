package com.gerze.labo2.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerze.labo2.domain.entities.Sorcerer;

@Repository
public interface SorcererRepository extends JpaRepository<Sorcerer, UUID>{
    List<Sorcerer> findBySchool(String school);

    List<Sorcerer> findByGrade(String grade);

    List<Sorcerer> findByIsActiveTrue();
    
}
