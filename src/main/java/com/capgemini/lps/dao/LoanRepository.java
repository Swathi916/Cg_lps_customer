package com.capgemini.lps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.lps.entity.Loan;


public interface LoanRepository extends JpaRepository<Loan, Integer> {

	
}
