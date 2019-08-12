package br.com.brenohff.climbapi.service;

import br.com.brenohff.climbapi.entity.Bids;
import br.com.brenohff.climbapi.exception.NotFoundException;
import br.com.brenohff.climbapi.repository.BidsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidsService {

    @Autowired
    private BidsRepository bidsRepository;

    public List<Bids> getAll() {
        return bidsRepository.findAll();
    }

    public List<Bids> getBidsByPilotid(int pilotid) {
        return bidsRepository.getBidsByPilotid(pilotid);
    }

    public Bids getBidsByBidid(int bidid) {
        return bidsRepository.findById(bidid).orElseThrow(() -> new NotFoundException("No bid found for bidid: " + bidid));
    }

}
