package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.SmartcarsCharteredflights;

public interface SmartcarsCharteredflightsRepository extends JpaRepository<SmartcarsCharteredflights, Integer>, JpaSpecificationExecutor<SmartcarsCharteredflights> {

}