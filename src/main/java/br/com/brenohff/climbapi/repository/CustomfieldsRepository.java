package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Customfields;

public interface CustomfieldsRepository extends JpaRepository<Customfields, Integer>, JpaSpecificationExecutor<Customfields> {

}