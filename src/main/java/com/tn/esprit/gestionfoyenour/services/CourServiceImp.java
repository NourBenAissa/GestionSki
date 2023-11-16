package com.tn.esprit.gestionfoyenour.services;

import com.tn.esprit.gestionfoyenour.Rep.CoursRep;
import com.tn.esprit.gestionfoyenour.entities.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourServiceImp implements CourService{
    @Autowired
    CoursRep coursRep;
    @Override
    public Cours addCour(Cours c) {
        return coursRep.save(c);
    }

    @Override
    public Cours uddateCour(Cours c) {
        return coursRep.save(c);
    }

    @Override
    public boolean deleteByIdCour(long id) {

        coursRep.deleteById(id);
        return !(coursRep.existsById(id));
    }

    @Override
    public List<Cours> getAllCours() {
        return (List<Cours>) coursRep.findAll();
    }

    @Override
    public Cours getIdCour(long id) {

        return coursRep.findById(id).orElseThrow(() -> new IllegalArgumentException("no cours found with this id"));
    }
}
