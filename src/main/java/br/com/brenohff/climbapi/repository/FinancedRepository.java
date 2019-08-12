package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Financed;

public interface FinancedRepository extends JpaRepository<Financed, Integer>, JpaSpecificationExecutor<Financed> {

}