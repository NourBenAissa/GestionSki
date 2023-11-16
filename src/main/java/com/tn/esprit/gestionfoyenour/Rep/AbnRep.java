package com.tn.esprit.gestionfoyenour.Rep;

import com.tn.esprit.gestionfoyenour.entities.Abonnement;
import com.tn.esprit.gestionfoyenour.tabsenum.TypeAbonnement;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AbnRep extends CrudRepository<Abonnement,Long> {

    List<Abonnement> findByTypeAbnOrderByDateDebut(TypeAbonnement typeAbn);
    List<Abonnement> findByDateDebutAfterAndDateFinBefore(LocalDate dateDebut, LocalDate dateFin);
}
