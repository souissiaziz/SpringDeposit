package com.esprit.spring.etude_de_cas_spring.services;

import com.esprit.spring.etude_de_cas_spring.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();

    Abonnement addAbonnement(Abonnement e);

    Abonnement updateAbonnement (Abonnement e);

    Abonnement retrieveAbonnement (Integer idAbonnement);

    void deleteAbonnement( Integer idAbonnement);
}
