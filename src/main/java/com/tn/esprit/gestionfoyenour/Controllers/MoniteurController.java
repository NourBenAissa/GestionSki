package com.tn.esprit.gestionfoyenour.Controllers;

import com.tn.esprit.gestionfoyenour.entities.Moniteur;
import com.tn.esprit.gestionfoyenour.services.MoniteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moniteur")
@RequiredArgsConstructor
public class MoniteurController {

    private final MoniteurService  moniteurService;

    @GetMapping
    public List<Moniteur> getAllMoniteur(){
        return moniteurService.getAllMoni();
    }

    @GetMapping("{id}")
    public Moniteur getIdMoni(@PathVariable long id) {
        return moniteurService.getIdMoni(id);
    }

    @PostMapping
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){
        return moniteurService.addMoni(moniteur);
    }

    @PutMapping
    public Moniteur uddateMoniteur(Moniteur moniteur){
        return moniteurService.uddateMoni(moniteur);
    }
}
