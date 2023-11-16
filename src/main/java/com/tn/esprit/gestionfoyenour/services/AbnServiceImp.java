package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.Rep.AbnRep;
import com.tn.esprit.gestionfoyenour.entities.Abonnement;
import com.tn.esprit.gestionfoyenour.entities.Cours;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AbnServiceImp implements AbnService{

    @Autowired
    AbnRep abnRep;
    @Override
    public Abonnement addAbn(Abonnement abn) {
        return abnRep.save(abn);
    }

    @Override
    public Abonnement uddateAbn(Abonnement abn) {
        return abnRep.save(abn);
    }

    @Override
    public boolean deleteByIdAbn(long id) {
        abnRep.deleteById(id);
        return !(abnRep.existsById(id));
    }

    @Override
    public List<Abonnement> getAllAbns() {
        return (List<Abonnement>) abnRep.findAll();
    }

    @Override
    public Abonnement getIdAbn(long id) {
        return abnRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no abn found with this id"));
    }
}
