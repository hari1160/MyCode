# Handling User Authentication .
## DESCRIPTION

Authentication is a simple program that allows registered users to login and has been tested with Junit5. If the user can login successfully, they will be taken to a page that states they have successfully logged in. If the user puts an invalid input or gets the password or username wrong, then they will be directed to a page that denies access. 

##Directions for Building Project:
1.	Unzip project or import project from Github link into Eclipse Enterprise IDE 
2.	Right click folder and select run as > maven install to install necessary jar libraries 
3.	Edit application.property file to connect to local MySQL database
4.	Open the AuthenticationApplication.java file and run the file

##Directions for Running Tests:
1.	Open test files in src/test/java/com.example.Authentication
2.	Run the test files as Junit test



## Project objective:

Set up a spring boot project to do testing of a user authentication class which is used in the main web application. The objective is to create a JUnit class that will test all aspects of the authentication class.


## Background of the problem statement:

As a part of developing an ecommerce web application, a test-suite is being created to do unit testing of all backend components in the web application. This project will test the user authentication class. This project will be a Spring Boot Java application, since Junit does not directly test servlets or web pages. We are only testing the classes that have the business logic.


You must use the following:

 *  Eclipse as the IDE
 *  Apache Tomcat as the web server
 *  Junit 5



Following requirements should be met:

 *  Create a Spring Boot Project
 *  Create a set of business classes that  that has all the methods related to user authentication
 *  Create a view/controller in Spring MVC to perform a basic UI function related to User Authentication. 
    - You can use any Spring View or Controller for this; JSP/Thymeleaft/ etc.  
    - The point of creating the view controller is just to get it working; it won't be tested
    - You may also use MySQL to implement the app but it is not required.
    - Requirements for the application will be similar to [Phase 2 End Project](https://github.com/timfox456/java-fsd-phase2/tree/main/phase-end-project)
 *  Create a JUnit test class to create unit tests for business logic classes.
    - There is no need to directly test the Spring MVC view or controllers.
 *  You should have at least 1 unit test for each of the following:
    - Every method in your service classes
    - Every method in the repository classes that is invoked anywhere in the application (probably mostly in services)
    - Do some tests that directly involve using MySQL (if you use it).
 *  Run the test class directly as a JUnit and check if all the tests pass
 *  Document the step-by-step process involved in completing this task


#### Due Date

 23-March-2021

 
