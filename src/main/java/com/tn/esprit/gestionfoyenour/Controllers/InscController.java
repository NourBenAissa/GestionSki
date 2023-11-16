package com.tn.esprit.gestionfoyenour.Controllers;


import com.tn.esprit.gestionfoyenour.entities.Inscription;
import com.tn.esprit.gestionfoyenour.services.InsService;
import jakarta.servlet.Registration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("insc")
public class InscController {

    private final InsService insService;
    @PostMapping("{idSkieur}")
    public Inscription addRegistrationAndassignToSkieur(@PathVariable long idSkieur, @RequestBody Inscription inscription ){
        return insService.addRegistrationAndassignToSkieur(idSkieur,inscription);
    }

   @PutMapping("{numRegistration}/{numCourse}")
    public Inscription assignRegistrationToCours(@PathVariable Long numRegistration,@PathVariable Long numCourse){
        return insService.assignRegistrationToCours(numRegistration,numCourse);
    }

    @GetMapping
        public List<Inscription> getAllInsc(){
        return insService.getAllInsc();
    }

    @GetMapping("{id}")
    public Inscription getIdInsc(@PathVariable long id) {
        return insService.getIdInsc(id);
    }

    @PostMapping
    public Inscription addInsc(@RequestBody Inscription inscription){
        return insService.addInsc(inscription);
    }

    @PutMapping
    public Inscription uddateInsc(Inscription inscription){
        return insService.uddateInsc(inscription);
    }
}

