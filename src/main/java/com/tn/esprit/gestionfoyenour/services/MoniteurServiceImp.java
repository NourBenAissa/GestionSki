package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.Rep.MoniteurRep;
import com.tn.esprit.gestionfoyenour.entities.Moniteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurServiceImp implements MoniteurService{

    @Autowired
    MoniteurRep moniteurRep;
    @Override
    public Moniteur addMoni(Moniteur moni) {
        return moniteurRep.save(moni);
    }

    @Override
    public Moniteur uddateMoni(Moniteur moni) {
        return moniteurRep.save(moni);
    }

    @Override
    public boolean deleteByIdMoni(long id) {
        moniteurRep.deleteById(id);
        return !(moniteurRep.existsById(id));
    }

    @Override
    public List<Moniteur> getAllMoni() {
        return (List<Moniteur>) moniteurRep.findAll();

    }

    @Override
    public Moniteur getIdMoni(long id) {
        return moniteurRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no moniteur found with this id"));

    }
}
