package com.tn.esprit.gestionfoyenour.entities;

import com.tn.esprit.gestionfoyenour.tabsenum.Couleur;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // all private
public class Piste {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numPiste;

    String nomPiste;
    Integer longeur;
     Integer pente;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
   @ManyToMany
   Set<Skieur> skieurs;
}
