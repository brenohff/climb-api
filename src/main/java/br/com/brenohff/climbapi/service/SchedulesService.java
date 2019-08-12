package br.com.brenohff.climbapi.service;

import br.com.brenohff.climbapi.entity.Schedules;
import br.com.brenohff.climbapi.exception.NotFoundException;
import br.com.brenohff.climbapi.repository.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchedulesService {

    @Autowired
    private SchedulesRepository schedulesRepository;

    public List<Schedules> getSchedulesByDepicao(String depicao) {
        List<Schedules> schedules = schedulesRepository.getSchedulesByDepicao(depicao);

        return Optional.of(schedules).orElseThrow(() -> new NotFoundException("Could not find any schedules from " + depicao));
    }
}
