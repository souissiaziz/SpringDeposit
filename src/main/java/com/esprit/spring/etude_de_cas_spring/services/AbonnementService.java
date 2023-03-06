package com.esprit.spring.etude_de_cas_spring.services;

import com.esprit.spring.etude_de_cas_spring.entities.Abonnement;
import com.esprit.spring.etude_de_cas_spring.repositories.AbonnementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AbonnementService implements IAbonnementService {
    AbonnementRepository abonnementRepository;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement e) {
        abonnementRepository.save(e);
        return e;
    }

    @Override
    public Abonnement updateAbonnement(Abonnement e) {
        abonnementRepository.save(e);
        return e;
    }

    @Override
    public Abonnement retrieveAbonnement(Integer idAbonnement) {
        return abonnementRepository.findById(idAbonnement).get();
    }

    @Override
    public void deleteAbonnement(Integer idAbonnement) {
        abonnementRepository.deleteById(idAbonnement);
    }
}
