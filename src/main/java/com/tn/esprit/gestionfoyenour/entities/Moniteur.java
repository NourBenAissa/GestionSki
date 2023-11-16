package com.tn.esprit.gestionfoyenour.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Moniteur {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Setter(AccessLevel.NONE)
    Long numMoni;
    String nomM;
    String prenM;
    LocalDate dateRecru;

    @OneToMany
    Set<Cours> cours;
}
