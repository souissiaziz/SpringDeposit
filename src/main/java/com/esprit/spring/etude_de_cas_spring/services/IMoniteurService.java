package com.esprit.spring.etude_de_cas_spring.services;

import com.esprit.spring.etude_de_cas_spring.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur e);

    Moniteur updateMoniteur (Moniteur e);

    Moniteur retrieveMoniteur (Integer idMoniteur);

    void deleteMoniteur( Integer idMoniteur);
}
