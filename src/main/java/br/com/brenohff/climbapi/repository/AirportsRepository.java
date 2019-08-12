package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Airports;

public interface AirportsRepository extends JpaRepository<Airports, Integer>, JpaSpecificationExecutor<Airports> {

}