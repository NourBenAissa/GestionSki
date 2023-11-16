package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.entities.Moniteur;

import java.util.List;

public interface MoniteurService {
    Moniteur addMoni( Moniteur  moni);
    Moniteur  uddateMoni( Moniteur  moni);
    boolean deleteByIdMoni(long id);
    List< Moniteur > getAllMoni();
    Moniteur  getIdMoni(long id);
}
