package com.esprit.spring.etude_de_cas_spring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table( name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numCours")
    private Long numCours; // Clé primaire
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private Integer creneau;

    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptions;

}
