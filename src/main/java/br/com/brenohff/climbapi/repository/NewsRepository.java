package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.News;

public interface NewsRepository extends JpaRepository<News, Integer>, JpaSpecificationExecutor<News> {

}