package com.tn.esprit.gestionfoyenour.entities;

import com.tn.esprit.gestionfoyenour.tabsenum.Support;
import com.tn.esprit.gestionfoyenour.tabsenum.TypeCours;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long numCours;
    Integer niveau;
    Integer creneau;
    Float prix;
    @Enumerated(EnumType.STRING)
    Support support;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
@OneToMany(mappedBy = "cours")
    List<Inscription> inscriptions;
}
