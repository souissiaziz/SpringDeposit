package com.esprit.spring.etude_de_cas_spring.repositories;

import com.esprit.spring.etude_de_cas_spring.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepository extends JpaRepository<Piste,Integer> {
}
