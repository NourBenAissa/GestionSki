package com.tn.esprit.gestionfoyenour.entities;

import com.tn.esprit.gestionfoyenour.tabsenum.TypeAbonnement;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long numAbn;
    LocalDate dateDebut;
    LocalDate dateFin;
    Float prixAbn;
@Enumerated(EnumType.STRING)
TypeAbonnement typeAbn;

}
