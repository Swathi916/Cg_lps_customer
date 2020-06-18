//package com.capgemini.lps.service;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.capgemini.lps.entity.Loan;
//import com.capgemini.lps.service.LoanService;
//
//
//@SpringBootTest
//class LoanServiceImplTest {
//
//	@Autowired
//	private LoanService loanService;
//
//	Loan loan;
//	Loan addLoan = null;
//
//	@BeforeEach
//	void addLoan() {
//		loan=new Loan();
//		loan.setLoanType("House Construction");
//		loan.setLoanAmount("4500000");
//		loan.setRateOfInterest("8.5");
//		loan.setPeriod("6.5");
//		addLoan=loanService.save(loan);
//
//	}
//
//	@Test
//	void testAddLoan() {
//		assertNotNull(addLoan);
//	}
//
//	@Test
//	void testSearchLoan() {
//		Loan loan = loanService.findById(this.addLoan.getLoanNo());
//		assertNotNull(loan);
//	}
//
//	@Test
//	void testGetAllUsers() {
//		List<Loan> loanList = loanService.findAll();
//		assertNotNull(loanList);
//	}
//
//	@AfterEach
//	void testDeleteLoan() {
//		loan = loanService.findById(this.addLoan.getLoanNo());
//		loanService.deleteById(loan.getLoanNo());
//	}
//
//	
//  @Test void testAfterDelete() { assertNotNull(loan); }
//	 
//
//}
//
//
////class LoanServiceImplTest {
////
////	@Test
////	void test() {
////		fail("Not yet implemented");
////	}
//
//
