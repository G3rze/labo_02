package com.gerze.labo2.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.gerze.labo2.domain.entities.Sorcerer;
import com.gerze.labo2.repositories.SorcererRepository;
import com.gerze.labo2.service.ISorcererService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SorcererServiceImpl implements ISorcererService {

    private final SorcererRepository sorcererRepository;

    @Override
    public Sorcerer createSorcerer(Sorcerer sorcerer) {
        return sorcererRepository.save(sorcerer);
    }

    @Override
    public List<Sorcerer> findAllSorcerers() {
        return sorcererRepository.findAll();
    }

    @Override
    public Optional<Sorcerer> findSorcererById(UUID id) {
        return sorcererRepository.findById(id);
    }

    @Override
    public Sorcerer updateSorcerer(Sorcerer sorcerer) {
        return sorcererRepository.save(sorcerer);
    }

    @Override
    public void deleteSorcerer(UUID id) {
        sorcererRepository.deleteById(id);
    }

    @Override
    public List<Sorcerer> findAllSorcererBySchool(String school) {
        return sorcererRepository.findBySchool(school);
    }

    @Override
    public List<Sorcerer> findAllSorcererByGrade(String grade) {
        return sorcererRepository.findByGrade(grade);
    }

    @Override
    public List<Sorcerer> findAllActiveSorcerer() {
        return sorcererRepository.findByIsActiveTrue();
    }
    
}
