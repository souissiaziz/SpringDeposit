package com.esprit.spring.etude_de_cas_spring.repositories;

import com.esprit.spring.etude_de_cas_spring.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
