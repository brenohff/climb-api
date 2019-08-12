package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.PilotshopTypes;

public interface PilotshopTypesRepository extends JpaRepository<PilotshopTypes, Integer>, JpaSpecificationExecutor<PilotshopTypes> {

}