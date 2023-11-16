package com.tn.esprit.gestionfoyenour.Controllers;

import com.tn.esprit.gestionfoyenour.entities.Abonnement;
import com.tn.esprit.gestionfoyenour.services.AbnService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("abonnement")
public class AbonnementController {
    private final AbnService abnService;

    @GetMapping
    public List<Abonnement> getAllAbn(){
        return abnService.getAllAbns();
    }

    @GetMapping("{id}")
    public Abonnement getIdAbn(@PathVariable long id) {
        return abnService.getIdAbn(id);
    }

    @PostMapping
    public Abonnement addAbn(@RequestBody Abonnement abonnement){
        return abnService.addAbn(abonnement);
    }

    @PutMapping
    public Abonnement uddateAbn(Abonnement abonnement){
        return abnService.uddateAbn(abonnement);
    }


}

