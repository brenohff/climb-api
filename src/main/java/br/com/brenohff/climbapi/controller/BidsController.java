package br.com.brenohff.climbapi.controller;

import br.com.brenohff.climbapi.entity.Bids;
import br.com.brenohff.climbapi.service.BidsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/v1/bids")
public class BidsController {

    @Autowired
    private BidsService bidsService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Bids>> getAllBids() {
        return ResponseEntity.ok().body(bidsService.getAll());
    }

    @GetMapping("/getBidsByPilotid")
    public ResponseEntity<List<Bids>> getBidsByPilotid(@PathParam("pilotid") int pilotid) {
        List<Bids> bidsList = bidsService.getBidsByPilotid(pilotid);
        return ResponseEntity.ok().body(bidsList);
    }

    @GetMapping("/getBidsByBidid")
    public ResponseEntity<Bids> getBidsByBidid(@PathParam("bidid") int bidid) {
        Bids bids = bidsService.getBidsByBidid(bidid);
        return ResponseEntity.ok().body(bids);
    }

    /*@DeleteMapping("/deleteBid")
    public ResponseEntity<Void> deleteBid(@PathParam("bidid") int bidid) {
        bidsService.deleteBid(bidid);
        return ResponseEntity.ok().build();
    }*/
}
