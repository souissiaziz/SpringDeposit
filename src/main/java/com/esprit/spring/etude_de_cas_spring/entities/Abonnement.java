package com.esprit.spring.etude_de_cas_spring.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Abonnement")
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAbonnement")
    private Integer idAbonnement; // Clé primaire
    private Long numAbon;
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}