@ManageTransport
Feature: Manage Vehicles, Routes, and Student Mapping for a Newly Onboarded School

  Background: 
    Given the user is logged into the School Admin Dashboard

  Scenario: Manage Vehicles, Routes, and Student Mapping
    When the user creates new Vehicles manually and using a CSV File
    Then the user should see the created Vehicles
    When the user creates a new Route
    Then the user should see the created Route
    When the user Adds new Students to the created route
    Then the user should see Students are added to the route
    When the user updates the Vehicles details
    Then the user should see the updated vehicle details
    When the user updates the Vehicle route
    Then the user should see the updated Vehicle route
    When the user Re-Assigns the students in the route
    Then the user should see the Reassigned Students
    When the user deletes the created Vehicles
    Then the user should verify that the Vehicles are deleted
    When the user deletes the created vehicles routes
    Then the user should verify that the vehicles routes are deleted
