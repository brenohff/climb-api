package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Toppilots;

public interface ToppilotsRepository extends JpaRepository<Toppilots, Integer>, JpaSpecificationExecutor<Toppilots> {

}