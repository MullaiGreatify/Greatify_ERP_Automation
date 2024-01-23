@FeesManagement
Feature: Create a School Fees for a specific class 

  Background: 
    Given the user is logged into the school admin dashboard
    And the user is logged into the teacher dashboard
    And the user is logged into the principal dashboard

  Scenario: Create and Verify Teacher Information in Dashboards with CSV File
    When the user navigates to the create Teacher Profile page in the School Admin Dashboard
    And the user creates a new Teacher Profile in the School Admin Dashboard using CSV File