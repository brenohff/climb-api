package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Pireps;

public interface PirepsRepository extends JpaRepository<Pireps, Integer>, JpaSpecificationExecutor<Pireps> {

}