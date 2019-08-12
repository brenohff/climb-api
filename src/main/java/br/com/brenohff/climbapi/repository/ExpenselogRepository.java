package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Expenselog;

public interface ExpenselogRepository extends JpaRepository<Expenselog, Void>, JpaSpecificationExecutor<Expenselog> {

}