package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Fuelprices;

public interface FuelpricesRepository extends JpaRepository<Fuelprices, Integer>, JpaSpecificationExecutor<Fuelprices> {

}