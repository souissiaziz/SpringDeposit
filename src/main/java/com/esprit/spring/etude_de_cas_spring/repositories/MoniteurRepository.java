package com.esprit.spring.etude_de_cas_spring.repositories;

import com.esprit.spring.etude_de_cas_spring.entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoniteurRepository extends JpaRepository<Moniteur,Integer> {

}
