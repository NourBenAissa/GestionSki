package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.Rep.PisteRep;
import com.tn.esprit.gestionfoyenour.entities.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteServiceImp implements  PisteService{

    @Autowired
    PisteRep pisteRep;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRep.save(piste);
    }

    @Override
    public Piste uddatePiste(Piste piste) {
        return  pisteRep.save(piste);
    }

    @Override
    public boolean deleteByIdAbn(long id) {
        pisteRep.deleteById(id);
        return !(pisteRep.existsById(id));
    }

    @Override
    public List<Piste> getAllPistes() {
        return (List<Piste>) pisteRep.findAll();

    }

    @Override
    public Piste getIdPiste(long id) {
        return pisteRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no piste found with this id"));

    }
}
