package com.capgemini.lps.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.capgemini.lps.entity.User;

public interface UserService {
	public List<User> findAll();

	public User findById(int theId);

	public User save(User theClient);

	public void deleteById(int theId);

	public User getByEmail(String email);

	public Page<User> getClients(int pageNo, int itemsPerPage);

	public Page<User> getSortClients(int pageNo, int itemsPerPage, String fieldName);

	public User login(String username);

	public User findByEmail(String email);
	
	public void forgotPassword(User theUser);

	public User findByAadhar(String aadhar);

	public User findByPhone(String mobNo);

	public List<User> findAllCustomer();

	public Page<User> findAllCustomer(int pageNo, int itemsPerPage); // new

	public Page<User> findAllSortedCustomer(int pageNo, int itemsPerPage, String fieldName);// new

	public Page<User> getAllRequested(int pageNo, int itemsPerPage); // new method create

	public Page<User> getAllSortedRequested(int pageNo, int itemsPerPage, String fieldName);

	User save1(User theClient);

}
