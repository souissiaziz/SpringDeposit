package com.esprit.spring.etude_de_cas_spring.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numMoniteur")
    private Long numMoniteur; // Clé primaire
    private String nomM;
    private String prenomM;
    private Date dateRecru;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}

