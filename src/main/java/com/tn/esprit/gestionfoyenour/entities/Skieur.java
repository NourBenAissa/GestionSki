package com.tn.esprit.gestionfoyenour.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.logging.Level;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skieur {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    String nomSkieur;
    String prenS;
    String Ville;
    @ManyToMany(mappedBy = "skieurs")
    Set<Piste> pistes;
    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    @JsonIgnore
    Set <Inscription> inscriptions;
}
