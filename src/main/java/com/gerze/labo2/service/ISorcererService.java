package com.gerze.labo2.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.gerze.labo2.domain.entities.Sorcerer;

public interface ISorcererService {
    public Sorcerer createSorcerer(Sorcerer sorcerer);

    public List<Sorcerer> findAllSorcerers();

    public Optional<Sorcerer> findSorcererById(UUID id);

    public Sorcerer updateSorcerer(Sorcerer sorcerer);

    public void deleteSorcerer(UUID id);

    public List<Sorcerer> findAllSorcererBySchool(String school);

    public List<Sorcerer> findAllSorcererByGrade(String grade);

    public List<Sorcerer> findAllActiveSorcerer();
}
