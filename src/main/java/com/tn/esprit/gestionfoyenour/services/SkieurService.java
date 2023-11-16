package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.entities.Skieur;

import java.util.List;

public interface SkieurService {
    Skieur addSkieur(Skieur skieur);
    Skieur uddateSkieur(Skieur skieur);
    boolean deleteByIdSkieur(long id);
    List<Skieur> getAllSkieur();
    Skieur getIdSkieur(long id);

    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCourse);
}
