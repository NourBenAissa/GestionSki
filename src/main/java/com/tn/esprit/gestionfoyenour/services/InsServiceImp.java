package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.Rep.CoursRep;
import com.tn.esprit.gestionfoyenour.Rep.InsRep;
import com.tn.esprit.gestionfoyenour.Rep.SkieurRep;
import com.tn.esprit.gestionfoyenour.entities.Cours;
import com.tn.esprit.gestionfoyenour.entities.Inscription;
import com.tn.esprit.gestionfoyenour.entities.Skieur;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InsServiceImp implements InsService{


    private final InsRep insRep;

    private final SkieurRep skieurRep;
    private final CoursRep coursRep;

    @Override
    public Inscription addInsc(Inscription insc) {
        return insRep.save(insc);
    }

    @Override
    public Inscription uddateInsc(Inscription insc) {
        return insRep.save(insc);
    }

    @Override
    public boolean deleteByIdInsc(long id) {
        insRep.deleteById(id);
        return !(insRep.existsById(id));
    }

    @Override
    public List<Inscription> getAllInsc() {
        return (List<Inscription>) insRep.findAll();

    }

    @Override
    public Inscription getIdInsc(long id) {
        return insRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no Inscription found with this id"));
    }

    @Override
    public Inscription addRegistrationAndassignToSkieur(long idSkieur, Inscription inscription) {
        Skieur skieur=skieurRep.findById(idSkieur).orElseThrow(() -> new IllegalArgumentException("no skieur found with this id"));
        inscription.setSkieur(skieur);

        return insRep.save(inscription);
    }
    @Transactional
    @Override
    public Inscription assignRegistrationToCours(Long numRegistration, Long numCourse) {
        Cours cours= coursRep.findById(numCourse).orElseThrow(() -> new IllegalArgumentException("no cours found with this id"));
        Inscription inscription= insRep.findById(numRegistration).orElseThrow(() -> new IllegalArgumentException("no inscrpition found with this id"));
        inscription.setCours(cours);
        return inscription;
    }


}
