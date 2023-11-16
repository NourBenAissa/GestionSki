package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.Rep.AbnRep;
import com.tn.esprit.gestionfoyenour.Rep.CoursRep;
import com.tn.esprit.gestionfoyenour.Rep.InsRep;
import com.tn.esprit.gestionfoyenour.Rep.SkieurRep;
import com.tn.esprit.gestionfoyenour.entities.Abonnement;
import com.tn.esprit.gestionfoyenour.entities.Cours;
import com.tn.esprit.gestionfoyenour.entities.Inscription;
import com.tn.esprit.gestionfoyenour.entities.Skieur;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SkieurServiceImp implements  SkieurService{


    private final SkieurRep skieurRep;
    private final CoursRep coursRep;
    private final AbnRep abnRep;
    private final InsRep insRep;


    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRep.save(skieur);
    }

    @Override
    public Skieur uddateSkieur(Skieur skieur) {
        return skieurRep.save(skieur);
    }

    @Override
    public boolean deleteByIdSkieur(long id) {
        skieurRep.deleteById(id);
        return !(skieurRep.existsById(id));
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return (List<Skieur>) skieurRep.findAll();

    }

    @Override
    public Skieur getIdSkieur(long id) {
        return skieurRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no cours found with this id"));

    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCourse) {


        Cours cours=coursRep.findById(numCourse).orElseThrow(() -> new IllegalArgumentException("no cours found with this id"));

        //Abonnement abonnement=skieur.getAbonnement();
        Inscription inscription= skieur.getInscriptions().stream().findFirst().get();

        inscription.setSkieur(skieur);
        inscription.setCours(cours);
        // skieur.setAbonnement(abonnement);
        //skieur.setInscriptions(new HashSet<>());

        skieurRep.save(skieur);
        insRep.save(inscription);

        return skieur;
    }
}
