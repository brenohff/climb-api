package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Airlines;

public interface AirlinesRepository extends JpaRepository<Airlines, Integer>, JpaSpecificationExecutor<Airlines> {

}