package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.FltbookSettings;

public interface FltbookSettingsRepository extends JpaRepository<FltbookSettings, Integer>, JpaSpecificationExecutor<FltbookSettings> {

}