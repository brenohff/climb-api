package br.com.brenohff.climbapi.controller;

import br.com.brenohff.climbapi.entity.Pilots;
import br.com.brenohff.climbapi.service.PilotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/pilots")
public class PiltosController {

    @Autowired
    private PilotsService pilotsService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Pilots>> getAll() {
        List<Pilots> pilotsList = pilotsService.getAll();

        return ResponseEntity.ok().body(pilotsList);
    }

    @GetMapping("/{pilotid}")
    public ResponseEntity<Pilots> getPilotById(@PathVariable("pilotid") Integer pilotid) {
        Pilots pilot = pilotsService.getPilotById(pilotid);

        return ResponseEntity.ok().body(pilot);
    }
}
