package com.esprit.spring.etude_de_cas_spring.services;

import com.esprit.spring.etude_de_cas_spring.entities.Moniteur;
import com.esprit.spring.etude_de_cas_spring.repositories.MoniteurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MoniteurService implements IMoniteurService{

    MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        moniteurRepository.save(e);
        return e;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        moniteurRepository.save(e);
        return e;
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return moniteurRepository.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);
    }
}
