package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Activityfeed;

public interface ActivityfeedRepository extends JpaRepository<Activityfeed, Integer>, JpaSpecificationExecutor<Activityfeed> {

}