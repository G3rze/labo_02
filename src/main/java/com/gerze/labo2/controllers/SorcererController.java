package com.gerze.labo2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerze.labo2.domain.entities.Sorcerer;
import com.gerze.labo2.service.impl.SorcererServiceImpl;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api/sorcerers")
@AllArgsConstructor
public class SorcererController {
    private final SorcererServiceImpl sorcererService;

    @PostMapping
    public ResponseEntity<Sorcerer> createSorcerer(@RequestBody Sorcerer sorcerer) {
        return ResponseEntity.ok(sorcererService.createSorcerer(sorcerer));
    }
    
    @GetMapping
    public ResponseEntity<List<Sorcerer>> findAllSorcerer(){
        return ResponseEntity.ok(sorcererService.findAllSorcerers());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Sorcerer> findSorcererById(@PathVariable UUID id) {
        return sorcererService.findSorcererById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sorcerer> updateSorcerer(@PathVariable UUID id, @RequestBody Sorcerer sorcerer) {
        sorcerer.setId(id);
        return ResponseEntity.ok(sorcererService.updateSorcerer(sorcerer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSorcerer(@PathVariable UUID id) {
        sorcererService.deleteSorcerer(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/school/{school}")
    public ResponseEntity<List<Sorcerer>> findAllBySchool(@PathVariable String school) {
        return ResponseEntity.ok(sorcererService.findAllSorcererBySchool(school));
    }

    @GetMapping("/grade/{grade}")
    public ResponseEntity<List<Sorcerer>> findAllByGrade(@PathVariable String grade) {
        return ResponseEntity.ok(sorcererService.findAllSorcererByGrade(grade));
    }

    @GetMapping("/active")
    public ResponseEntity<List<Sorcerer>> findAllActive() {
        return ResponseEntity.ok(sorcererService.findAllActiveSorcerer());
    }
}
