package com.tn.esprit.gestionfoyenour.Controllers;

import com.tn.esprit.gestionfoyenour.entities.Piste;
import com.tn.esprit.gestionfoyenour.services.PisteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("piste")

public class PisteController {

    private final PisteService pisteService;

    @GetMapping
    public List<Piste> getAllPistes() {
        return  pisteService.getAllPistes();

    }

    @GetMapping("{id}")
    public Piste getIdPiste(@PathVariable long id) {
        return pisteService.getIdPiste(id);
    }
    @PostMapping
    public Piste addPiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }

    @PutMapping
    public Piste uddateSkieur(Piste piste) {
        return pisteService.uddatePiste(piste);
    }

}
