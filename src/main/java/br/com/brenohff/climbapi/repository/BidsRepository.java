package br.com.brenohff.climbapi.repository;

import br.com.brenohff.climbapi.entity.Bids;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import javax.websocket.server.PathParam;
import java.util.List;

public interface BidsRepository extends JpaRepository<Bids, Integer>, JpaSpecificationExecutor<Bids> {

    @Query("SELECT b FROM Bids b WHERE b.pilotid = :pilotid")
    List<Bids> getBidsByPilotid(@PathParam("pilotid") Integer pilotid);

}