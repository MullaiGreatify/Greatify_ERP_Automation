@TeacherInformation
Feature: Create a Teacher Profile using CSV File. Verify Teacher Details, Parent Details, Educational Details in Dashboards with CSV File

  Background: 
    Given the user is logged into the school admin dashboard
    And the user is logged into the teacher dashboard
    And the user is logged into the principal dashboard

  Scenario: Create and Verify Teacher Information in Dashboards with CSV File
    When the user navigates to the create Teacher Profile page in the School Admin Dashboard
    And the user creates a new Teacher Profile in the School Admin Dashboard using CSV File
    When the user navigates to the Teacher Management of School Admin Dashboard
    Then the user verifies Teacher ID with Teacher Id in the CSV File
    And the user identifies and records the Teacher Details in School Admin Dashboard
    And the user identifies and records the Parent Details in School Admin Dashboard
    And the user identifies and records the Educational Details in School Admin Dashboard
    Then the user should verify the Teacher Details in School Admin Dashboard with CSV File
    And the user should verify the Parent Details in School Admin Dashboard with CSV File
    And the user should verify the Educational Details in School Admin Dashboard with CSV File
    When the user navigates to the Teacher Profile page in the Teacher Dashboard
    Then the user verifies Teacher ID in the Teacher Dashboard with Teacher Id in the CSV File
    And the user identifies and records the Teacher details in Teacher Dashboard
    And the user identifies and records the Parent Details in Teacher Dashboard
    And the user identifies and records the Educational Details in Teacher Dashboard
    Then the user should verify the Teacher Details in Teacher Dashboard with CSV File
    And the user should verify the Parent Details in Teacher Dashboard with CSV File
    And the user should verify the Educational Details in Teacher Dashboard with CSV File
    When the user navigates to the Teachers Page of Principal Dashboard
    Then the user verifies Teacher ID in the Principal Dashboard with Teacher Id in the CSV File
    And the user identifies and records the Teacher details in Principal Dashboard
    And the user identifies and records the Parent Details in Principal Dashboard
    And the user identifies and records the Educational Details in Principal Dashboard
    Then the user should verify the Teacher Details in Principal Dashboard with CSV File
    And the user should verify the Parent Details in Principal Dashboard with CSV File
    And the user should verify the Educational Details in Principal Dashboard with CSV File
