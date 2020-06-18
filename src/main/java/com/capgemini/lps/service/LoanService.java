package com.capgemini.lps.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.capgemini.lps.entity.Loan;

public interface LoanService {

	public List<Loan> findAll();
	
	public Loan findById(int loanNo);
	
	public Loan save(Loan theLoan);
	
	public void deleteById(int loanNo);
	
	public Page<Loan> getLoans(int pageNo, int itemsPerPage );
	
	public Page<Loan> getSortLoans(int pageNo, int itemsPerPage, String fieldName );
	
	
	

	
}
