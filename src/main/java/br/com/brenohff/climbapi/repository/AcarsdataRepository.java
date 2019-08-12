package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Acarsdata;

public interface AcarsdataRepository extends JpaRepository<Acarsdata, Integer>, JpaSpecificationExecutor<Acarsdata> {

}