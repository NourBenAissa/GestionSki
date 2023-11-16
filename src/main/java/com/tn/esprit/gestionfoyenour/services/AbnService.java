package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.entities.Abonnement;


import java.util.List;

public interface AbnService {
    Abonnement addAbn(Abonnement abn);
    Abonnement uddateAbn(Abonnement abn);
    boolean deleteByIdAbn(long id);
    List<Abonnement> getAllAbns();
    Abonnement getIdAbn(long id);
}
