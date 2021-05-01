#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Registration functionality
 New user should be able to register to the application
 
  Scenario Outline: Positive registration functionality test of new user with valid credentials
    Given user is already in registration page 
    When user provide <username>, <password>, <confirmPassword>
    And clicks submit button
    Then user should be registered should see confirmation of username
     

    Examples: 
      | username | password | confirmPassword  |
      |Tom|tom123|tom123|
      |Harry|harry123|harry123|
