package br.com.brenohff.climbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import br.com.brenohff.climbapi.entity.Expenses;

public interface ExpensesRepository extends JpaRepository<Expenses, Integer>, JpaSpecificationExecutor<Expenses> {

}