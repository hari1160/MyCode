package com.simplilearn.Authentication.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.Authentication.entities.User;
import com.simplilearn.Authentication.exceptions.UserNotFoundException;
import com.simplilearn.Authentication.services.UserService;



@ControllerAdvice
public class UserDNEController {
	
	Logger log = LoggerFactory.getLogger(LoginController.class);
	@ExceptionHandler(value = UserNotFoundException.class) 
    public String errorLogin(UserNotFoundException dne){
    	log.info("error found");
    	return "deniedAccess";
    	
    }
}
