package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Awardsgranted;

public interface AwardsgrantedRepository extends JpaRepository<Awardsgranted, Integer>, JpaSpecificationExecutor<Awardsgranted> {

}