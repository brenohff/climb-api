package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Pirepcomments;

public interface PirepcommentsRepository extends JpaRepository<Pirepcomments, Integer>, JpaSpecificationExecutor<Pirepcomments> {

}