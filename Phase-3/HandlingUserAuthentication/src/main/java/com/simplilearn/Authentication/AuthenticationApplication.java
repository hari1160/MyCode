package com.simplilearn.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.simplilearn.Authentication.controllers.LoginController;
import com.simplilearn.Authentication.controllers.UserDNEController;
import com.simplilearn.Authentication.entities.User;
import com.simplilearn.Authentication.exceptions.UserNotFoundException;
import com.simplilearn.Authentication.services.UserService;

@SpringBootApplication
@Import({
    UserNotFoundException.class,
    UserService.class,
    LoginController.class,
    User.class,
    UserDNEController.class
})
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

}
