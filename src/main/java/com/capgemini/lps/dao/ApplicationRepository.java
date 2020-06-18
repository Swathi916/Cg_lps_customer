package com.capgemini.lps.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.lps.entity.Applicant;


public interface ApplicationRepository extends JpaRepository<Applicant,Integer> {
	@Query(value = "select a from Applicant a where applicationStatus = 'requested'")
	List<Applicant> findAllRequested();
	
	@Query(value = "select a from Applicant a where applicationStatus = 'Approved'")
	List<Applicant> findAllApproved();
	
	@Query(value = "select a from Applicant a where applicationStatus = 'Rejected'")
	List<Applicant> findAllRejected();
}
