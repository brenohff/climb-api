package br.com.brenohff.climbapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.Entity.PirepsHist;

public interface PirepsHistRepository extends JpaRepository<PirepsHist, Void>, JpaSpecificationExecutor<PirepsHist> {

}