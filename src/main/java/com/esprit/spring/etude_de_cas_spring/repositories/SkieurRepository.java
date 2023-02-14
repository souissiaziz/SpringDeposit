package com.esprit.spring.etude_de_cas_spring.repositories;

import com.esprit.spring.etude_de_cas_spring.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkieurRepository extends JpaRepository<Skieur,Integer> {
}
