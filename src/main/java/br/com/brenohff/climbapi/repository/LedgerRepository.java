package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Ledger;

public interface LedgerRepository extends JpaRepository<Ledger, Integer>, JpaSpecificationExecutor<Ledger> {

}