package com.esprit.spring.etude_de_cas_spring.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idSkieur")
    private Integer idSkieur; // Clé primaire
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}
