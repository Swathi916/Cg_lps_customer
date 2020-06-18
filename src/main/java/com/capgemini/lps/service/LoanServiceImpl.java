package com.capgemini.lps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.capgemini.lps.dao.LoanRepository;
import com.capgemini.lps.entity.Loan;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepository;
	
	
	@Override
	public List<Loan> findAll() {
		return loanRepository.findAll();
	}

	@Override
	public Loan findById(int theId) {
		Optional<Loan> result = loanRepository.findById(theId);
		
		Loan theLoan = null;
		
		if (result.isPresent()) {
			theLoan = result.get();
		}
		else {
			throw new RuntimeException("Did not find  id - " + theId);
		}
		
		return theLoan;
	}

	@Override
	public Loan save(Loan theLoan) {
		return loanRepository.save(theLoan);
	}

	@Override
	public void deleteById(int theId) {
		loanRepository.deleteById(theId);
	}

	@Override
	public Page<Loan> getLoans(int pageNo, int itemsPerPage) {
		
			Pageable pageable = PageRequest.of(pageNo , itemsPerPage);
			return loanRepository.findAll(pageable);

	}

	@Override
	public Page<Loan> getSortLoans(int pageNo, int itemsPerPage, String fieldName) {
		Pageable pageable = PageRequest.of(pageNo, itemsPerPage, Sort.by(fieldName));
			return loanRepository.findAll(pageable);
		}

	}
	







