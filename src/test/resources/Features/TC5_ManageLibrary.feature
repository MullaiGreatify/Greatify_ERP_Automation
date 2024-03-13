@Library
Feature: Manage Books Category, Rack, Shelf, and Book Location in the School Admin Dashboard

  Background: 
    Given the user is logged into the School Admin Dashboard

  Scenario: Manage Books Category, Rack, Shelf, and Book Location
    When the user creates Category and Subcategory for the book
    Then the user should see the created category and subcategory
    When the user creates Racks and Shelf Locations for the books
    Then the user should see the created racks and shelf locations for the books
    When the user maps Book Locations based on category and subcategory
    Then the user should see the mapped book locations
    When the user creates the book limit, pre-booking limit, and book overdue limit
    Then the user should see the created book limit, pre-booking limit, and book overdue limit
    When the user updates the Category and Subcategory for the books
    Then the user should see the updated Category and Subcategory
    When the user updates the Racks and Shelf Locations
    Then the user should see the updated Racks and Shelf Locations
    When the user updates the mapped book locations
    Then the user should see the updated mapping of book locations
    When the user updates the book limit, pre-booking limit, and book overdue limit
    Then the user should see the updated book limit, pre-booking limit, and book overdue limit
    When the user deletes the book location configuration
    Then the user should verify that the book location configuration are deleted
    When the user deletes the racks and shelf locations
    Then the user should verify that the racks and shelf locations are deleted
    When the user deletes the category and subcategory configuration
    Then the user should verify that the category and subcategory configuration are deleted
