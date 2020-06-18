package com.capgemini.lps.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.lps.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>  {

	@Query(value = "select u from User u where role='ROLE_APPROVAL'")
	Page<User> findAll(Pageable pageable);
	
	@Query(value = "select DISTINCT u from User u INNER JOIN u.applicant a where u.role='ROLE_CUSTOMER' and a.applicationStatus='Requested'")
	List<User> findAllRequested();
    
	@Query(value = "select  u from User u  where u.email=?1")
	User getByEmail(String email);
	
	@Query(value="from User where email=?1")
	Optional<User> login(String email);
	
	@Query("from User where email=?1")
	User findbyEmail(String email);
	
	@Query("from User where mobileNo=?1")
	User findbyMobile(String mobNo);
	
	@Query("from User where adharNo=?1")
	User findbyAadhar(String aadhar);
	
	@Query(value = "select u from User u where role='ROLE_CUSTOMER'")
    List<User> findAllCustomer();
	
	@Query(value = "select u from User u where role='ROLE_CUSTOMER'")
	Page<User> findAllCustomer(Pageable pageable);

	@Query("select DISTINCT u from User u INNER JOIN u.applicant a where u.role='ROLE_CUSTOMER' and a.applicationStatus='Requested'")
    Page<User> getAllRequested(Pageable pageable);


}
