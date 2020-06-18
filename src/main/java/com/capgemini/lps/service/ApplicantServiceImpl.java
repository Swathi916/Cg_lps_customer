package com.capgemini.lps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.lps.dao.ApplicationRepository;
import com.capgemini.lps.dao.UserRepository;
import com.capgemini.lps.entity.Applicant;

@Service
public class ApplicantServiceImpl implements ApplicantService{
	
	@Autowired
	ApplicationRepository applicationRepository;
	@Autowired
	UserRepository userRepository;
	@Override
	public Applicant saveApplicant(Applicant applicant) {
		return applicationRepository.save(applicant);
	}

	@Override
	public Applicant getById(int userId) {
		Optional<Applicant> result = applicationRepository.findById(userId);
		
		Applicant applicant = null;
		if (result.isPresent()) {
			applicant = result.get();
		} else {
			throw new RuntimeException("Id not found " + userId);
		}
		return applicant;
	}

	@Override
	public List<Applicant> findAll() {
		return applicationRepository.findAllRequested();
	}

	@Override
	public Applicant setApproved(int id) {
		Optional<Applicant> result = applicationRepository.findById(id);
		Applicant applicant = null;
		applicant = result.get();
		applicant.setApplicationStatus("Approved");
		applicationRepository.save(applicant);
		return applicant;
	}

	@Override
	public Applicant setRejected(int id) {
		Optional<Applicant> result = applicationRepository.findById(id);
		Applicant applicant = null;
		applicant = result.get();
		applicant.setApplicationStatus("Rejected");
		applicationRepository.save(applicant);
		return applicant;
	}

	@Override
	public void deleteById(int theId) {
		applicationRepository.deleteById(theId);
	}
}
