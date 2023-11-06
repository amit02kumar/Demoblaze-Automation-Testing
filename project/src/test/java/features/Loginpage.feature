 Feature: Login Functionality for DemoBlaze E-commerce Website

 As a user of the DemoBlaze website
 I want to be able to log in with my account
 So that I can access my account-related features and manage my orders

 
  Scenario: Successful login with valid credentials
 	Given Launch the browser
 	Given I am on the DemoBlaze login page
    Given I have entered a valid username and password 
   When I click on the login button
  Then I should be logged in successfully
  And I clicked on the logout button
  Then close browser

  