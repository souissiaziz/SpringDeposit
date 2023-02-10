package com.esprit.spring.etude_de_cas_spring.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Abonnement")
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numAbon")
    private Long numAbon; // Clé primaire
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}