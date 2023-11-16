package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.entities.Cours;

import java.util.List;

public interface CourService {
    Cours addCour(Cours c);
    Cours uddateCour(Cours c);
    boolean deleteByIdCour(long id);
    List<Cours> getAllCours();
    Cours getIdCour(long id);


}
