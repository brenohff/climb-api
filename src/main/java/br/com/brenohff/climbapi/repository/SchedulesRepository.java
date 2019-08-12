package br.com.brenohff.climbapi.repository;

import br.com.brenohff.climbapi.entity.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import javax.websocket.server.PathParam;
import java.util.List;

public interface SchedulesRepository extends JpaRepository<Schedules, Integer>, JpaSpecificationExecutor<Schedules> {

    @Query("SELECT s FROM Schedules s WHERE s.depicao = :depicao")
    List<Schedules> getSchedulesByDepicao(@PathParam("depicao") String depicao);

}