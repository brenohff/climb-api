package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Fieldvalues;

public interface FieldvaluesRepository extends JpaRepository<Fieldvalues, Integer>, JpaSpecificationExecutor<Fieldvalues> {

}