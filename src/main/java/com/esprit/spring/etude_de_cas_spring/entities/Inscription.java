package com.esprit.spring.etude_de_cas_spring.entities;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table( name = "Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numInscription")
    private Long numInscription; // Clé primaire
    private Integer numSemaine;

    @ManyToOne
    Cours cours;
    @ManyToOne
    Skieur skieur;
}
