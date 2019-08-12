package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Adminlog;

public interface AdminlogRepository extends JpaRepository<Adminlog, Integer>, JpaSpecificationExecutor<Adminlog> {

}