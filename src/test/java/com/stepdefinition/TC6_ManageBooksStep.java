package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.opencsv.exceptions.CsvException;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_ManageBooksStep {

	PageObjectManager pom = new PageObjectManager();

	@When("the user adds books to the Library")
	public void theUserAddsBooksToTheLibrary() throws FileNotFoundException, IOException, CsvException {

		pom.getManageBooksPage().AddBooksToTheLibrary();

	}

	@Then("the user should see the created books in the Library")
	public void theUserShouldSeeTheCreatedBooksInTheLibrary() throws InterruptedException {

		pom.getManageBooksPage().VerifyBookIsAdded();
	}

	@When("the user updates the details of a book in the Library")
	public void theUserUpdatesTheDetailsOfABookInTheLibrary()
			throws FileNotFoundException, IOException, CsvException, InterruptedException {

		pom.getManageBooksPage().UpdateTheBookDetails();

	}

	@Then("the user should see the updated book details in the Library")
	public void theUserShouldSeeTheUpdatedBookDetailsInTheLibrary() throws InterruptedException {

		pom.getManageBooksPage().VerifyBookDetailsIsUpdated();

	}

	@When("the user deletes a book from the Library")
	public void theUserDeletesABookFromTheLibrary() throws InterruptedException {
		pom.getManageBooksPage().DeleteTheBook();

	}

	@Then("the user should verify that the book is deleted from the Library")
	public void theUserShouldVerifyThatTheBookIsDeletedFromTheLibrary() throws InterruptedException {

		pom.getManageBooksPage().VerifyBookIsDeleted();
	}

	@When("the user assigns a book to a student")
	public void theUserAssignsABookToAStudent()
			throws FileNotFoundException, IOException, CsvException, InterruptedException {
		pom.getManageBooksPage().AssignsBookToAStudent();

	}

	@Then("the user should see that the book is assigned to the student")
	public void theUserShouldSeeThatTheBookIsAssignedToTheStudent() throws InterruptedException {

		pom.getManageBooksPage().VerifyBookIsAssignedToTheStudent();
	}

	@When("the user tracks the assigned book")
	public void theUserTracksTheAssignedBook()
			throws InterruptedException, FileNotFoundException, IOException, CsvException {
		pom.getManageBooksPage().TracksTheAssignmentBook();

	}

	@Then("the user should see the status of assigned book")
	public void theUserShouldSeeTheStatusOfAssignedBook() throws InterruptedException {

		pom.getManageBooksPage().VerifyAssignedBooksDetails();
	}

}
