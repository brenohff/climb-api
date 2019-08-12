package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.PointsLog;

public interface PointsLogRepository extends JpaRepository<PointsLog, Integer>, JpaSpecificationExecutor<PointsLog> {

}