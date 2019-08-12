package br.com.brenohff.climbapi.service;

import br.com.brenohff.climbapi.entity.Pilots;
import br.com.brenohff.climbapi.exception.NotFoundException;
import br.com.brenohff.climbapi.repository.PilotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotsService {

    @Autowired
    private PilotsRepository pilotsRepository;

    public List<Pilots> getAll() {
        return pilotsRepository.findAll();
    }

    public Pilots getPilotById(final int pilotid) {
        return pilotsRepository.findById(pilotid).orElseThrow(() -> new NotFoundException("Pilot not found -> " + pilotid));
    }
}
