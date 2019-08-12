package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.FltbookLocation;

public interface FltbookLocationRepository extends JpaRepository<FltbookLocation, Integer>, JpaSpecificationExecutor<FltbookLocation> {

}