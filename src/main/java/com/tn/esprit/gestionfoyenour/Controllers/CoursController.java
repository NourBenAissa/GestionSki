package com.tn.esprit.gestionfoyenour.Controllers;

import com.tn.esprit.gestionfoyenour.entities.Cours;
import com.tn.esprit.gestionfoyenour.services.CourService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cours")
@RequiredArgsConstructor
public class CoursController {
    private final CourService courService;

    @GetMapping
    public List<Cours> getAllCours(){
        return courService.getAllCours();
    }

    @GetMapping("{id}")
    public Cours getIdCour(@PathVariable long id) {
        return courService.getIdCour(id);
    }

    @PostMapping
    public Cours addCour(@RequestBody Cours cours){
        return courService.addCour(cours);
    }

    @PutMapping
    public Cours uddateCour(Cours cours){
        return courService.uddateCour(cours);
    }
}

