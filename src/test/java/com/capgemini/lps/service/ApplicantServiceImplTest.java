//package com.capgemini.lps.service;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.capgemini.lps.entity.Applicant;
//import com.capgemini.lps.service.ApplicantService;
//
//@SpringBootTest
//class ApplicantServiceImplTest {
//
//
//	@Autowired
//	private ApplicantService appService;
//
//	Applicant applicant;
//	Applicant addApplicant = null;
//
//	@BeforeEach
//	void addApplicant() {
//		 applicant=new Applicant();
//		 applicant.setLoanAmount("4500000");
//		 applicant.setApplicationStatus("Requested");
//		 applicant.setLoanType("House Construction");	
//		addApplicant=appService.saveApplicant(applicant);
//
//	}
//
//	@Test
//	void testAddApplicant() {
//		assertNotNull(addApplicant);
//	}
//
//	@Test
//	void testSearchApplicant() {
//		Applicant applicant = appService.getById(this.addApplicant.getAppId());
//		assertNotNull(applicant);
////		appService.deleteById(applicant.getAppId());
//		
//	}
//       
//	@Test
//	void testGetAllApplicants() {
//		List<Applicant> applicantList = appService.findAll();
//		assertNotNull( applicantList);
//		
//	}
//	
//	@AfterEach
//	void testDeleteApplicant() {
//		applicant = appService.getById(this.addApplicant.getAppId());
//		appService.deleteById(applicant.getAppId());
//	}
//
//	
//  @Test void testAfterDelete() { 
//	  assertNotNull(applicant); 
//	  }
//	 
//
//}
//
//
//
//
