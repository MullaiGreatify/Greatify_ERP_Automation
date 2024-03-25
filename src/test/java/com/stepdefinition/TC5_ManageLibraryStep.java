package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.opencsv.exceptions.CsvException;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ManageLibraryStep {

	PageObjectManager pom = new PageObjectManager();

	@When("the user creates Category and Subcategory for the book")
	public void theUserCreatesCategoryAndSubcategoryForTheBook()
			throws FileNotFoundException, IOException, CsvException {

		pom.getManageLibraryPage().CreatesCategoryAndSubcategoryForBooks();

	}

	@Then("the user should see the created category and subcategory")
	public void theUserShouldSeeTheCreatedCategoryAndSubcategory() {

		pom.getManageLibraryPage().VerifyCategorysAreCreated();
	}

	@When("the user creates Racks and Shelf Locations for the books")
	public void theUserCreatesRacksAndShelfLocationsForTheBooks()
			throws FileNotFoundException, IOException, CsvException {

		pom.getManageLibraryPage().CreatesRacksAndShelf();

	}

	@Then("the user should see the created racks and shelf locations for the books")
	public void theUserShouldSeeTheCreatedRacksAndShelfLocationsForTheBooks() {

		pom.getManageLibraryPage().VerifyRackAndShelfAreCreated();
	}

	@When("the user maps Book Locations based on category and subcategory")
	public void theUserMapsBookLocationsBasedOnCategoryAndSubcategory()
			throws FileNotFoundException, IOException, CsvException, AWTException {

		pom.getManageLibraryPage().MapsBookLocations();
	}

	@Then("the user should see the mapped book locations")
	public void theUserShouldSeeTheMappedBookLocations() throws InterruptedException {

		pom.getManageLibraryPage().VerifyMappedBookLocation();
	}

	@When("the user creates the book limit, pre-booking limit, and book overdue limit")
	public void theUserCreatesTheBookLimitPreBookingLimitAndBookOverdueLimit()
			throws FileNotFoundException, IOException, CsvException {

//		pom.getManageLibraryPage().CreatesTheBookLimit();

	}

	@Then("the user should see the created book limit, pre-booking limit, and book overdue limit")
	public void theUserShouldSeeTheCreatedBookLimitPreBookingLimitAndBookOverdueLimit() throws InterruptedException {

//		pom.getManageLibraryPage().VerifyBookLimitIsCreated();
	}

	@When("the user updates the Category and Subcategory for the books")
	public void theUserUpdatesTheCategoryAndSubcategoryForTheBooks()
			throws InterruptedException, FileNotFoundException, IOException, CsvException {

		pom.getManageLibraryPage().UpdateCategoryAndSubCategory();

	}

	@Then("the user should see the updated Category and Subcategory")
	public void theUserShouldSeeTheUpdatedCategoryAndSubcategory() throws InterruptedException {

		pom.getManageLibraryPage().VerifyCategoryUpdated();
	}

	@When("the user updates the Racks and Shelf Locations")
	public void theUserUpdatesTheRacksAndShelfLocations()
			throws FileNotFoundException, IOException, CsvException, InterruptedException {

		pom.getManageLibraryPage().UpdatesRacksAndShelfLocations();
	}

	@Then("the user should see the updated Racks and Shelf Locations")
	public void theUserShouldSeeTheUpdatedRacksAndShelfLocations() throws InterruptedException {

		pom.getManageLibraryPage().VerifyRackAndShelfAreUpdated();
	}

	@When("the user updates the mapped book locations")
	public void theUserUpdatesTheMappedBookLocations()
			throws FileNotFoundException, IOException, CsvException, InterruptedException {

		pom.getManageLibraryPage().UpdatesBookLocations();
	}

	@Then("the user should see the updated mapping of book locations")
	public void theUserShouldSeeTheUpdatedMappingOfBookLocations() throws InterruptedException {

		pom.getManageLibraryPage().VerifyBookLocationUpdated();
	}

	@When("the user updates the book limit, pre-booking limit, and book overdue limit")
	public void theUserUpdatesTheBookLimitPreBookingLimitAndBookOverdueLimit()
			throws FileNotFoundException, IOException, CsvException {

		pom.getManageLibraryPage().UpdateBookLimit();
	}

	@Then("the user should see the updated book limit, pre-booking limit, and book overdue limit")
	public void theUserShouldSeeTheUpdatedBookLimitPreBookingLimitAndBookOverdueLimit() throws InterruptedException {

		pom.getManageLibraryPage().VerifyBookLimitUpdated();
	}

	@When("the user deletes the book location configuration")
	public void theUserDeletesTheBookLocationConfiguration() throws InterruptedException {

		pom.getManageLibraryPage().DeletesTheBookLocationConfiguration();

	}

	@Then("the user should verify that the book location configuration are deleted")
	public void theUserShouldVerifyThatTheBookLocationConfigurationAreDeleted() throws InterruptedException {

		pom.getManageLibraryPage().VerifyBookLocationIsDeleted();

	}

	@When("the user deletes the racks and shelf locations")
	public void theUserDeletesTheRacksAndShelfLocations() throws InterruptedException {

		pom.getManageLibraryPage().DeletesTheRacksAndShelfLocations();
	}

	@Then("the user should verify that the racks and shelf locations are deleted")
	public void theUserShouldVerifyThatTheRacksAndShelfLocationsAreDeleted() throws InterruptedException {

		pom.getManageLibraryPage().VerifyRackAndShelfAreDeleted();
	}

	@When("the user deletes the category and subcategory configuration")
	public void theUserDeletesTheCategoryAndSubcategoryConfiguration() throws InterruptedException {

		pom.getManageLibraryPage().DeletesTheCategoryAndSubcategoryConfiguration();
	}

	@Then("the user should verify that the category and subcategory configuration are deleted")
	public void theUserShouldVerifyThatTheCategoryAndSubcategoryConfigurationAreDeleted() throws InterruptedException {

		pom.getManageLibraryPage().VerifyCategorysAreDeleted();
	}

}
