package com.tn.esprit.gestionfoyenour.Controllers;

import com.tn.esprit.gestionfoyenour.entities.Skieur;
import com.tn.esprit.gestionfoyenour.services.SkieurService;
import com.tn.esprit.gestionfoyenour.services.SkieurServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieurController {


    private final SkieurService skieurService;

    @GetMapping
    public List<Skieur> getAllSkieur() {
        return  skieurService.getAllSkieur();

    }
    @GetMapping("{id}")
    public Skieur getIdSkieur(@PathVariable long id) {
        return skieurService.getIdSkieur(id);
    }

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurService.addSkieur(skieur);
    }

    @PutMapping
    public Skieur uddateSkieur(Skieur skieur) {
        return skieurService.uddateSkieur(skieur);
    }

    @PostMapping("{numCourse}")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur,@PathVariable Long numCourse){
        return skieurService.addSkierAndAssignToCourse(skieur,numCourse);
    }

}
