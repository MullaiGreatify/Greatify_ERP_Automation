@Books
Feature: Manage Books, Assign books and Track the books in the Library

  Background: 
    Given the user is logged into the School Admin Dashboard

  Scenario: Manage, Assign and Track Books in the Library
    When the user adds books to the Library
    Then the user should see the created books in the Library
  
    When the user assigns a book to a student
    Then the user should see that the book is assigned to the student
  
    When the user tracks the assigned book
    Then the user should see the status of assigned book
    
    When the user updates the details of a book in the Library
    Then the user should see the updated book details in the Library
    
    When the user deletes a book from the Library
    Then the user should verify that the book is deleted from the Library
  
