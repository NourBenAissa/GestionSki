package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.entities.Inscription;

import java.util.List;

public interface InsService {

    Inscription addInsc(Inscription insc);
    Inscription uddateInsc(Inscription insc);
    boolean deleteByIdInsc(long id);
    List<Inscription> getAllInsc();
    Inscription getIdInsc(long id);

    Inscription addRegistrationAndassignToSkieur(long idSkieur, Inscription inscription);

    Inscription assignRegistrationToCours(Long numRegistration, Long numCourse);
}
