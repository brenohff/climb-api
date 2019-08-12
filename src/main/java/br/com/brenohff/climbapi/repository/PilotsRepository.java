package br.com.brenohff.climbapi.repository;

import br.com.brenohff.climbapi.entity.Pilots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotsRepository extends JpaRepository<Pilots, Integer> {

}