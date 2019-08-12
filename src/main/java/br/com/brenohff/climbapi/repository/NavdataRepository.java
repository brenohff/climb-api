package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Navdata;

public interface NavdataRepository extends JpaRepository<Navdata, Integer>, JpaSpecificationExecutor<Navdata> {

}