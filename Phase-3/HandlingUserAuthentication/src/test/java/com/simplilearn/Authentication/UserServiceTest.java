package com.simplilearn.Authentication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.simplilearn.Authentication.entities.User;
import com.simplilearn.Authentication.services.UserService;

@DataJpaTest
public class UserServiceTest {
	
	@Autowired
	private TestEntityManager xL;

	@Autowired
	private UserService mL;
	
	@BeforeEach
	public void bulid() {
		
        xL.persist(new User("Harish", " harish.123@gmail.com", "Hari@321"));
        
        xL.persist(new User("new", "new@new.com", "new123"));
       
        xL.flush();
	}
	
	@Test
	public void testGetAllUsers() {
		
        Iterable<User> users = mL.GetAllUsers();
        int count = 0;
        for (User user : users) {
            count++; 
        }
        
        assertEquals(count, 2);
	}
	
	public void testGetUserByName() {
		String name = "Harish";
		User u = mL.GetUserByName(name);
		assertEquals(u.getName(), name);
	}
	
	@Test
	public void testVerifyPassword() {
		String username = "Harish";
		String password = "Hari@123";
		boolean b = mL.verifyPassword(username, password);
		assertEquals(b, true);
	}
	
}
