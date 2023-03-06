package com.esprit.spring.etude_de_cas_spring.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur;
    private Long numMoniteur; // Clé primaire
    private String nomM;
    private String prenomM;
    private Date dateRecru;
    @OneToMany
    private Set<Cours> cours;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

