package br.com.brenohff.climbapi.controller;

import br.com.brenohff.climbapi.entity.Schedules;
import br.com.brenohff.climbapi.service.SchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/v1/schedules")
public class SchedulesController {

    @Autowired
    private SchedulesService schedulesService;

    @GetMapping("/getSchedulesByDepicao")
    public ResponseEntity<List<Schedules>> getSchedulesByDepicao(@PathParam("depicao") String depicao) {
        List<Schedules> schedulesList = schedulesService.getSchedulesByDepicao(depicao);

        return ResponseEntity.ok().body(schedulesList);
    }
}
