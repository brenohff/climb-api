package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Pilotshop;

public interface PilotshopRepository extends JpaRepository<Pilotshop, Integer>, JpaSpecificationExecutor<Pilotshop> {

}