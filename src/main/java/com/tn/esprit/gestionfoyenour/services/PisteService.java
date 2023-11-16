package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.entities.Abonnement;
import com.tn.esprit.gestionfoyenour.entities.Piste;

import java.util.List;

public interface PisteService {
    Piste addPiste(Piste piste);
    Piste uddatePiste(Piste piste);
    boolean deleteByIdAbn(long id);
    List<Piste> getAllPistes();
    Piste getIdPiste(long id);
}
