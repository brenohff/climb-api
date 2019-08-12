package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.AutopirepSettings;

public interface AutopirepSettingsRepository extends JpaRepository<AutopirepSettings, Integer>, JpaSpecificationExecutor<AutopirepSettings> {

}