package com.esprit.spring.etude_de_cas_spring.repositories;

import com.esprit.spring.etude_de_cas_spring.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
