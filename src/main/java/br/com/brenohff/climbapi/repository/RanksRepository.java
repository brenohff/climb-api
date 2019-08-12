package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Ranks;

public interface RanksRepository extends JpaRepository<Ranks, Integer>, JpaSpecificationExecutor<Ranks> {

}