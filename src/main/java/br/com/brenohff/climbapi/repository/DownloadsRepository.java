package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Downloads;

public interface DownloadsRepository extends JpaRepository<Downloads, Integer>, JpaSpecificationExecutor<Downloads> {

}