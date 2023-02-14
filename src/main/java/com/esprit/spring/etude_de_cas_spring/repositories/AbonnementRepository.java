package com.esprit.spring.etude_de_cas_spring.repositories;
import com.esprit.spring.etude_de_cas_spring.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
