Feature: signUp Functionality

  Scenario: User wants to signup 
    Given Open the browser
    Given The user is on the signup page
    When The user enters username and password
    Then User clicks on signup button
    And User wants to login now
    And Click on the logout button
    Then Close browser
 
