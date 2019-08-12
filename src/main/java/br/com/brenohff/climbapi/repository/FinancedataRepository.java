package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Financedata;

public interface FinancedataRepository extends JpaRepository<Financedata, Integer>, JpaSpecificationExecutor<Financedata> {

}