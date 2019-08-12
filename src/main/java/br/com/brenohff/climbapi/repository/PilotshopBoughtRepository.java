package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.PilotshopBought;

public interface PilotshopBoughtRepository extends JpaRepository<PilotshopBought, Integer>, JpaSpecificationExecutor<PilotshopBought> {

}