package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Groupmembers;

public interface GroupmembersRepository extends JpaRepository<Groupmembers, Integer>, JpaSpecificationExecutor<Groupmembers> {

}