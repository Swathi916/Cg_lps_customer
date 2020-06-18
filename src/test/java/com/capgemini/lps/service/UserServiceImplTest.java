//package com.capgemini.lps.service;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.capgemini.lps.entity.User;
//import com.capgemini.lps.service.UserService;
//
//
//@SpringBootTest
//class UserServiceImplTest {
//
//	@Autowired
//	private UserService userService;
//
//	User user;
//	User addUser = null;
//
//	@BeforeEach
//	void addUser() {
//		user=new User();
//		user.setFullName("Ashish k");
//		user.setEmail("ashishk@gmail.com");
//		user.setGender("Male");
//		user.setMobileNo("9088765432");
//		user.setRole("ROLE_CUSTOMER");
//		user.setDob("08/06/1991");
//		user.setPassword("Qwerty@123");
//		user.setAdharNo("963325874101");
//		addUser=userService.save(user);
//
//	}
//
//	@Test
//	void testAddUser() {
//		assertNotNull(addUser);
//	}
//
//	@Test
//	void testSearchUser() {
//		User user = userService.findById(this.addUser.getUserId());
//		assertNotNull(user);
//	}
//
//	@Test
//	void testGetAllUsers() {
//		List<User> userList = userService.findAll();
//		assertNotNull(userList);
//	}
//
//	@AfterEach
//	void testDeleteUser() {
//		user = userService.findById(this.addUser.getUserId());
//		userService.deleteById(user.getUserId());
//	}
//
//	
//  @Test void testAfterDelete() { assertNotNull(user); }
//	 
//
//}
