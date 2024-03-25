package com.pages;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.opencsv.exceptions.CsvException;

public class ManageLibraryPage extends BaseClass {

	public ManageLibraryPage() {
		PageFactory.initElements(driver, this);
	}

	int rowNum = 1;

	/*
	 * 1. Creates Category And Sub-category for books
	 */

	@FindBy(id = "schoolManagementSection")
	private WebElement schoolConfigMenu;
	@FindBy(id = "sideVisitors")
	private WebElement visitorLogMenu;
	@FindBy(id = "LibrarySection")
	private WebElement libraryMenu;
	@FindBy(id = "sideLibrary")
	private WebElement libraryConfigSideMenu;

	public WebElement getLibraryConfigSideMenu() {
		return libraryConfigSideMenu;
	}

	public void setLibraryConfigSideMenu(WebElement libraryConfigSideMenu) {
		this.libraryConfigSideMenu = libraryConfigSideMenu;
	}

	public WebElement getSchoolConfigMenu() {
		return schoolConfigMenu;
	}

	public void setSchoolConfigMenu(WebElement schoolConfigMenu) {
		this.schoolConfigMenu = schoolConfigMenu;
	}

	public WebElement getVisitorLogMenu() {
		return visitorLogMenu;
	}

	public void setVisitorLogMenu(WebElement visitorLogMenu) {
		this.visitorLogMenu = visitorLogMenu;
	}

	public WebElement getLibraryMenu() {
		return libraryMenu;
	}

	public void setLibraryMenu(WebElement libraryMenu) {
		this.libraryMenu = libraryMenu;
	}

	@FindBy(xpath = "//button[contains(.,'Add Category')]")
	private WebElement btnAddCategory;
	@FindBy(id = "createcategoryInputId")
	private WebElement txtCategory;
	@FindBy(css = ".create-cat_sub-cat")
	private WebElement txtSubCategory;
	@FindBy(xpath = "(//button[contains(.,'Submit')])[1]")
	private WebElement btnSubmit;

	public WebElement getBtnAddCategory() {
		return btnAddCategory;
	}

	public void setBtnAddCategory(WebElement btnAddCategory) {
		this.btnAddCategory = btnAddCategory;
	}

	public WebElement getTxtCategory() {
		return txtCategory;
	}

	public void setTxtCategory(WebElement txtCategory) {
		this.txtCategory = txtCategory;
	}

	public WebElement getTxtSubCategory() {
		return txtSubCategory;
	}

	public void setTxtSubCategory(WebElement txtSubCategory) {
		this.txtSubCategory = txtSubCategory;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	/*
	 * 2. Verify Categorys are created
	 */

	@FindBy(xpath = "//button[contains(.,'OK')]")
	private WebElement btnSuccessOK;
	@FindBy(css = ".swal-text")
	private WebElement successText;

	public WebElement getBtnSuccessOK() {
		return btnSuccessOK;
	}

	public void setBtnSuccessOK(WebElement btnSuccessOK) {
		this.btnSuccessOK = btnSuccessOK;
	}

	public WebElement getSuccessText() {
		return successText;
	}

	public void setSuccessText(WebElement successText) {
		this.successText = successText;
	}

	/*
	 * 3. Creates Racks And Shelf
	 */

	@FindBy(id = "pills-profile-tab")
	private WebElement rackConfigTab;
	@FindBy(xpath = "//button[contains(.,'Add Rack')]")
	private WebElement btnAddRack;
	@FindBy(id = "createRackInputId")
	private WebElement txtRackName;
	@FindBy(css = ".create-rack_shelf_name")
	private WebElement txtShelfName;
	@FindBy(xpath = "(//button[contains(.,'Submit')])[2]")
	private WebElement btnSubmit2;

	public WebElement getRackConfigTab() {
		return rackConfigTab;
	}

	public void setRackConfigTab(WebElement rackConfigTab) {
		this.rackConfigTab = rackConfigTab;
	}

	public WebElement getBtnAddRack() {
		return btnAddRack;
	}

	public void setBtnAddRack(WebElement btnAddRack) {
		this.btnAddRack = btnAddRack;
	}

	public WebElement getTxtRackName() {
		return txtRackName;
	}

	public void setTxtRackName(WebElement txtRackName) {
		this.txtRackName = txtRackName;
	}

	public WebElement getTxtShelfName() {
		return txtShelfName;
	}

	public void setTxtShelfName(WebElement txtShelfName) {
		this.txtShelfName = txtShelfName;
	}

	public WebElement getBtnSubmit2() {
		return btnSubmit2;
	}

	public void setBtnSubmit2(WebElement btnSubmit2) {
		this.btnSubmit2 = btnSubmit2;
	}

	/*
	 * 4. Verify Racks And Shelf are created
	 */

	/*
	 * 5. Maps Book Locations
	 */

	@FindBy(xpath = "//button[@id='pills-BookLocation-tab' and @type='button']")
	private WebElement bookLocTab;
	@FindBy(xpath = "//button[contains(.,'Add Category Rack')]")
	private WebElement btnAddCategoryRack;
	@FindBy(id = "createCatDropDwnId")
	private WebElement ddnCategory;
	@FindBy(id = "createSubCatDropDwnId")
	private WebElement ddnSubCategory;
	@FindBy(id = "createRackDropDwnId")
	private WebElement ddnRack;
	@FindBy(id = "createShelfDropDwnId")
	private WebElement ddnShelf;
	@FindBy(xpath = "(//button[contains(.,'Submit')])[3]")
	private WebElement btnSubmmit3;

	public WebElement getBtnSubmmit3() {
		return btnSubmmit3;
	}

	public void setBtnSubmmit3(WebElement btnSubmmit3) {
		this.btnSubmmit3 = btnSubmmit3;
	}

	public WebElement getDdnShelf() {
		return ddnShelf;
	}

	public void setDdnShelf(WebElement ddnShelf) {
		this.ddnShelf = ddnShelf;
	}

	public WebElement getBookLocTab() {
		return bookLocTab;
	}

	public void setBookLocTab(WebElement bookLocTab) {
		this.bookLocTab = bookLocTab;
	}

	public WebElement getBtnAddCategoryRack() {
		return btnAddCategoryRack;
	}

	public void setBtnAddCategoryRack(WebElement btnAddCategoryRack) {
		this.btnAddCategoryRack = btnAddCategoryRack;
	}

	public WebElement getDdnCategory() {
		return ddnCategory;
	}

	public void setDdnCategory(WebElement ddnCategory) {
		this.ddnCategory = ddnCategory;
	}

	public WebElement getDdnSubCategory() {
		return ddnSubCategory;
	}

	public void setDdnSubCategory(WebElement ddnSubCategory) {
		this.ddnSubCategory = ddnSubCategory;
	}

	public WebElement getDdnRack() {
		return ddnRack;
	}

	public void setDdnRack(WebElement ddnRack) {
		this.ddnRack = ddnRack;
	}

	/*
	 * 6. Verify Mapped Book locatiion
	 */

	/*
	 * 7. Creates The Book Limit PreBooking Limit And Book Overdue Limit
	 */

	@FindBy(id = "limit_config_edit-btn")
	private WebElement btnEdit;
	@FindBy(id = "limit_book")
	private WebElement btnLimit_book;
	@FindBy(id = "limit_pre-book")
	private WebElement btnPreBookLimit;
	@FindBy(id = "limit_overdue")
	private WebElement btnOverdueLimit;
	@FindBy(id = "limit_config_save-btn")
	private WebElement btnSaveLimit;
	@FindBy(id = "pills-LimitConfiguration-tab")
	private WebElement limitConfigTab;

	public WebElement getLimitConfigTab() {
		return limitConfigTab;
	}

	public void setLimitConfigTab(WebElement limitConfigTab) {
		this.limitConfigTab = limitConfigTab;
	}

	public WebElement getBtnSaveLimit() {
		return btnSaveLimit;
	}

	public void setBtnSaveLimit(WebElement btnSaveLimit) {
		this.btnSaveLimit = btnSaveLimit;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(WebElement btnEdit) {
		this.btnEdit = btnEdit;
	}

	public WebElement getBtnLimit_book() {
		return btnLimit_book;
	}

	public void setBtnLimit_book(WebElement btnLimit_book) {
		this.btnLimit_book = btnLimit_book;
	}

	public WebElement getBtnPreBookLimit() {
		return btnPreBookLimit;
	}

	public void setBtnPreBookLimit(WebElement btnPreBookLimit) {
		this.btnPreBookLimit = btnPreBookLimit;
	}

	public WebElement getBtnOverdueLimit() {
		return btnOverdueLimit;
	}

	public void setBtnOverdueLimit(WebElement btnOverdueLimit) {
		this.btnOverdueLimit = btnOverdueLimit;
	}

	/*
	 * 8. Verify limits are created
	 */

	/*
	 * 9. Update Category And Sub-category for books
	 */

	@FindBy(id = "pills-home-tab")
	private WebElement bookCategoryTab;

	public WebElement getBookCategoryTab() {
		return bookCategoryTab;
	}

	public void setBookCategoryTab(WebElement bookCategoryTab) {
		this.bookCategoryTab = bookCategoryTab;
	}

	@FindBy(id = "books_category_config_table")
	private WebElement table;

	public WebElement getTable() {
		return table;
	}

	public void setTable(WebElement table) {
		this.table = table;
	}

	@FindBy(id = "editcategoryInputId")
	private WebElement txtEditCategory;
	@FindBy(css = ".edit-cat_sub-cat")
	private WebElement txtEditSubCategory;
	@FindBy(css = "#editCategory .create_btn")
	private WebElement btnSaveCategory;

	public WebElement getTxtEditCategory() {
		return txtEditCategory;
	}

	public void setTxtEditCategory(WebElement txtEditCategory) {
		this.txtEditCategory = txtEditCategory;
	}

	public WebElement getTxtEditSubCategory() {
		return txtEditSubCategory;
	}

	public void setTxtEditSubCategory(WebElement txtEditSubCategory) {
		this.txtEditSubCategory = txtEditSubCategory;
	}

	public WebElement getBtnSaveCategory() {
		return btnSaveCategory;
	}

	public void setBtnSaveCategory(WebElement btnSaveCategory) {
		this.btnSaveCategory = btnSaveCategory;
	}

	/*
	 * 10. Verify updated Category is created
	 */

	/*
	 * 11. Update Racks And Shelf
	 */

	@FindBy(id = "racks-config_table")
	private WebElement table1;
	@FindBy(id = "editRackInputId")
	private WebElement txtEditRackName;
	@FindBy(css = ".edit-rack_shelf_name")
	private WebElement txtEditShelfName;
	@FindBy(css = "#editRack .create_btn")
	private WebElement btnUpdate;

	public WebElement getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(WebElement btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	public WebElement getTxtEditRackName() {
		return txtEditRackName;
	}

	public void setTxtEditRackName(WebElement txtEditRackName) {
		this.txtEditRackName = txtEditRackName;
	}

	public WebElement getTxtEditShelfName() {
		return txtEditShelfName;
	}

	public void setTxtEditShelfName(WebElement txtEditShelfName) {
		this.txtEditShelfName = txtEditShelfName;
	}

	public WebElement getTable1() {
		return table1;
	}

	public void setTable1(WebElement table1) {
		this.table1 = table1;
	}

	/*
	 * 12. Verify updated Racks And Shelf are created
	 */

	/*
	 * 13. Update Book Locations
	 */

	@FindBy(id = "book-location_table")
	private WebElement table2;
	@FindBy(id = "editCatDropDwnId")
	private WebElement ddnEditCategory;
	@FindBy(id = "editSubCatDropDwnId")
	private WebElement ddnEditSubCategory;
	@FindBy(id = "editRackDropDwnId")
	private WebElement ddnEditRack;
	@FindBy(id = "editShelfDropDwnId")
	private WebElement ddnEditShelf;
	@FindBy(css = ".editLocationRack")
	private WebElement btnUpdateBookLoc;

	public WebElement getTable2() {
		return table2;
	}

	public void setTable2(WebElement table2) {
		this.table2 = table2;
	}

	public WebElement getDdnEditCategory() {
		return ddnEditCategory;
	}

	public void setDdnEditCategory(WebElement ddnEditCategory) {
		this.ddnEditCategory = ddnEditCategory;
	}

	public WebElement getDdnEditSubCategory() {
		return ddnEditSubCategory;
	}

	public void setDdnEditSubCategory(WebElement ddnEditSubCategory) {
		this.ddnEditSubCategory = ddnEditSubCategory;
	}

	public WebElement getDdnEditRack() {
		return ddnEditRack;
	}

	public void setDdnEditRack(WebElement ddnEditRack) {
		this.ddnEditRack = ddnEditRack;
	}

	public WebElement getDdnEditShelf() {
		return ddnEditShelf;
	}

	public void setDdnEditShelf(WebElement ddnEditShelf) {
		this.ddnEditShelf = ddnEditShelf;
	}

	public WebElement getBtnUpdateBookLoc() {
		return btnUpdateBookLoc;
	}

	public void setBtnUpdateBookLoc(WebElement btnUpdateBookLoc) {
		this.btnUpdateBookLoc = btnUpdateBookLoc;
	}

	/*
	 * 14. Verify updated Book locatiion
	 */

	/*
	 * 15. Update The Book Limit PreBooking Limit And Book Overdue Limit
	 */

	/*
	 * 16. Verify updated limits are created
	 */

	/*
	 * 17. Delete the Book Location
	 */

	@FindBy(xpath = "//button[contains(.,'Yes, I am sure!')]")
	private WebElement confirmBtn;

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public void setConfirmBtn(WebElement confirmBtn) {
		this.confirmBtn = confirmBtn;
	}

	/**
	 * @see Method Starts Here
	 * @author mullai
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws CsvException
	 */

	public void CreatesCategoryAndSubcategoryForBooks() throws FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSchoolConfigMenu());
		clickWithMultipleRetry(getSchoolConfigMenu(), 10, 1000);

		mouseOverActionMoveToElement(getVisitorLogMenu());

		explicitWaitClickable(30, getLibraryMenu());
		clickWithMultipleRetry(getLibraryMenu(), 10, 1000);
		explicitWaitClickable(30, getLibraryConfigSideMenu());
		clickWithMultipleRetry(getLibraryConfigSideMenu(), 10, 1000);

		explicitWaitClickable(30, getBtnAddCategory());
		clickWithMultipleRetry(getBtnAddCategory(), 10, 1000);

		explicitWaitClickable(30, getTxtCategory());
		clickWithMultipleRetry(getTxtCategory(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 0);
		System.out.println(cell);
		EnterInTextbox(getTxtCategory(), cell);

		explicitWaitClickable(30, getTxtSubCategory());
		clickWithMultipleRetry(getTxtSubCategory(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 1);
		System.out.println(cell1);
		EnterInTextbox(getTxtSubCategory(), cell1);

		explicitWaitClickable(30, getBtnSubmit());
		clickWithMultipleRetry(getBtnSubmit(), 10, 1000);

	}

	public void VerifyCategorysAreCreated() {

		explicitWaitClickable(50, getBtnSuccessOK());

		String successPopupMsz = getText(getSuccessText());
		System.out.println(successPopupMsz);
		Assert.assertEquals("Book category created successfully.", successPopupMsz);
		HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

		clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

	}

	public void CreatesRacksAndShelf() throws FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getRackConfigTab());
		clickWithMultipleRetry(getRackConfigTab(), 10, 1000);

		explicitWaitClickable(30, getBtnAddRack());
		clickWithMultipleRetry(getBtnAddRack(), 10, 1000);

		explicitWaitClickable(30, getTxtRackName());
		clickWithMultipleRetry(getTxtRackName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 2);
		System.out.println(cell);
		EnterInTextbox(getTxtRackName(), cell);

		explicitWaitClickable(30, getTxtShelfName());
		clickWithMultipleRetry(getTxtShelfName(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 3);
		System.out.println(cell1);
		EnterInTextbox(getTxtShelfName(), cell1);

		explicitWaitClickable(30, getBtnSubmit2());
		clickWithMultipleRetry(getBtnSubmit2(), 10, 1000);

	}

	public void VerifyRackAndShelfAreCreated() {

		explicitWaitClickable(50, getBtnSuccessOK());

		String successPopupMsz = getText(getSuccessText());
		System.out.println(successPopupMsz);
		Assert.assertEquals("Rack created successfully.", successPopupMsz);
		HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

		clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

	}

	public void MapsBookLocations() throws FileNotFoundException, IOException, CsvException, AWTException {

		explicitWaitClickable(30, getBookLocTab());
		clickWithMultipleRetry(getBookLocTab(), 10, 1000);

		explicitWaitClickable(30, getBtnAddCategoryRack());
		clickWithMultipleRetry(getBtnAddCategoryRack(), 10, 1000);

		explicitWaitClickable(30, getDdnCategory());
		clickWithMultipleRetry(getDdnCategory(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 0);
		System.out.println(cell);
		selectDdnByText(getDdnCategory(), cell);

		explicitWaitClickable(30, getDdnSubCategory());
		clickWithMultipleRetry(getDdnSubCategory(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 1);
		System.out.println(cell1);
		selectDdnByText(getDdnSubCategory(), cell1);

		explicitWaitClickable(30, getDdnRack());
		clickWithMultipleRetry(getDdnRack(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 2);
		System.out.println(cell2);
		selectDdnByText(getDdnRack(), cell2);

		explicitWaitClickable(30, getDdnShelf());
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 3);
		System.out.println(cell3);
		selectDdnByText(getDdnShelf(), cell3);

		explicitWaitClickable(30, getBtnSubmmit3());
		clickWithMultipleRetry(getBtnSubmmit3(), 10, 1000);

	}

	public void VerifyMappedBookLocation() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book Location created successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void CreatesTheBookLimit() throws FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getLimitConfigTab());
		clickWithMultipleRetry(getLimitConfigTab(), 10, 1000);

//		WebElement editBtn = getBtnEdit();
//
//		if (editBtn.isEnabled()) {
//
//			explicitWaitClickable(30, getBtnEdit());
//			clickWithMultipleRetry(getBtnEdit(), 10, 1000);
//
//			explicitWaitClickable(30, getBtnLimit_book());
//			clickWithMultipleRetry(getBtnLimit_book(), 10, 1000);
//			getBtnLimit_book().clear();
//			String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 4);
//			System.out.println(cell1);
//			EnterInTextbox(getBtnLimit_book(), cell1);
//
//			explicitWaitClickable(30, getBtnPreBookLimit());
//			clickWithMultipleRetry(getBtnPreBookLimit(), 10, 1000);
//			getBtnPreBookLimit().clear();
//			EnterInTextbox(getBtnPreBookLimit(), cell1);
//
//			explicitWaitClickable(30, getBtnOverdueLimit());
//			clickWithMultipleRetry(getBtnOverdueLimit(), 10, 1000);
//			getBtnOverdueLimit().clear();
//			EnterInTextbox(getBtnOverdueLimit(), cell1);
//
//			explicitWaitClickable(30, getBtnSaveLimit());
//			clickWithMultipleRetry(getBtnSaveLimit(), 10, 1000);
//
//		}
//		else {
		explicitWaitClickable(30, getBtnLimit_book());
		clickWithMultipleRetry(getBtnLimit_book(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 4);
		System.out.println(cell1);
		EnterInTextbox(getBtnLimit_book(), cell1);

		explicitWaitClickable(30, getBtnPreBookLimit());
		clickWithMultipleRetry(getBtnPreBookLimit(), 10, 1000);
		EnterInTextbox(getBtnPreBookLimit(), cell1);

		explicitWaitClickable(30, getBtnOverdueLimit());
		clickWithMultipleRetry(getBtnOverdueLimit(), 10, 1000);
		EnterInTextbox(getBtnOverdueLimit(), cell1);

		explicitWaitClickable(30, getBtnSaveLimit());
		clickWithMultipleRetry(getBtnSaveLimit(), 10, 1000);
//		}

	}

	public void VerifyBookLimitIsCreated() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Limit Configuration Added Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdateCategoryAndSubCategory()
			throws InterruptedException, FileNotFoundException, IOException, CsvException {

		int maxRetries = 10;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				Actions actions = new Actions(driver);
				actions.moveToElement(getBookCategoryTab()).clickAndHold().moveToElement(getBookCategoryTab()).release()
						.perform();

				explicitWaitClickable(50, getBookCategoryTab());
				getBookCategoryTab().click();

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(2000);
			}
		}

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 4;

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				WebElement body = getTable().findElement(By.tagName("tbody"));
				List<WebElement> rows = body.findElements(By.tagName("tr"));

				int numberOfRows = rows.size();
				System.out.println("Table Rows :" + numberOfRows);

				for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {

					WebElement actionColumn = getTable()
							.findElement(By.xpath(".//tr[" + (rowIndex + 1) + "]/td[" + (columnIndex + 1) + "]"));

					WebElement editButton = actionColumn.findElement(By.cssSelector(".edit_text"));

					explicitWaitClickable(50, editButton);
					clickWithRetry(editButton);

				}

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		explicitWaitClickable(30, getTxtEditCategory());
		clickWithMultipleRetry(getTxtEditCategory(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 5);
		System.out.println(cell);
		getTxtEditCategory().clear();
		EnterInTextbox(getTxtEditCategory(), cell);

		explicitWaitClickable(30, getTxtEditSubCategory());
		clickWithMultipleRetry(getTxtEditSubCategory(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 6);
		System.out.println(cell1);
		getTxtEditSubCategory().clear();
		EnterInTextbox(getTxtEditSubCategory(), cell1);

		explicitWaitClickable(30, getBtnSaveCategory());
		clickWithMultipleRetry(getBtnSaveCategory(), 10, 1000);

	}

	public void VerifyCategoryUpdated() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book category updated successfully.", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdatesRacksAndShelfLocations()
			throws FileNotFoundException, IOException, CsvException, InterruptedException {

		explicitWaitClickable(30, getRackConfigTab());
		clickWithMultipleRetry(getRackConfigTab(), 10, 1000);

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 4;

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {

				WebElement body = getTable1().findElement(By.tagName("tbody"));
				List<WebElement> rows = body.findElements(By.tagName("tr"));

				int numberOfRows = rows.size();
				System.out.println("Table Rows :" + numberOfRows);

				for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {

					WebElement actionColumn = getTable1()
							.findElement(By.xpath(".//tr[" + (rowIndex + 1) + "]/td[" + (columnIndex + 1) + "]"));

					WebElement editButton = actionColumn.findElement(By.cssSelector(".edit_text"));

					explicitWaitClickable(50, editButton);
					clickWithRetry(editButton);
				}
				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}
		explicitWaitClickable(30, getTxtEditRackName());
		clickWithMultipleRetry(getTxtEditRackName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 7);
		System.out.println(cell);
		getTxtEditRackName().clear();
		EnterInTextbox(getTxtEditRackName(), cell);

		explicitWaitClickable(30, getTxtEditShelfName());
		clickWithMultipleRetry(getTxtEditShelfName(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 8);
		System.out.println(cell1);
		getTxtEditShelfName().clear();
		EnterInTextbox(getTxtEditShelfName(), cell1);

		explicitWaitClickable(30, getBtnUpdate());
		clickWithMultipleRetry(getBtnUpdate(), 10, 1000);

	}

	public void VerifyRackAndShelfAreUpdated() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Rack updated successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdatesBookLocations() throws FileNotFoundException, IOException, CsvException, InterruptedException {

		explicitWaitClickable(30, getBookLocTab());
		clickWithMultipleRetry(getBookLocTab(), 10, 1000);

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 7;
		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				WebElement body = getTable2().findElement(By.tagName("tbody"));
				List<WebElement> rows = body.findElements(By.tagName("tr"));

				int numberOfRows = rows.size();
				System.out.println("Table Rows :" + numberOfRows);

				for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {

					WebElement actionColumn = getTable2()
							.findElement(By.xpath(".//tr[" + (rowIndex + 1) + "]/td[" + (columnIndex + 1) + "]"));

					WebElement editButton = actionColumn.findElement(By.cssSelector(".edit_text"));

					explicitWaitClickable(50, editButton);
					clickWithRetry(editButton);
				}

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		explicitWaitClickable(30, getDdnEditCategory());
		clickWithMultipleRetry(getDdnEditCategory(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 5);
		System.out.println(cell);
		selectDdnByText(getDdnEditCategory(), cell);

		explicitWaitClickable(30, getDdnEditSubCategory());
		clickWithMultipleRetry(getDdnEditSubCategory(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 6);
		System.out.println(cell1);
		selectDdnByText(getDdnEditSubCategory(), cell1);

		explicitWaitClickable(30, getDdnEditRack());
		clickWithMultipleRetry(getDdnEditRack(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 7);
		System.out.println(cell2);
		selectDdnByText(getDdnEditRack(), cell2);

		explicitWaitClickable(30, getDdnEditShelf());
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 8);
		System.out.println(cell3);
		selectDdnByText(getDdnEditShelf(), cell3);

		explicitWaitClickable(30, getBtnUpdateBookLoc());
		clickWithMultipleRetry(getBtnUpdateBookLoc(), 10, 1000);

	}

	public void VerifyBookLocationUpdated() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book Location updated successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdateBookLimit() throws FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getLimitConfigTab());
		clickWithMultipleRetry(getLimitConfigTab(), 10, 1000);

		explicitWaitClickable(30, getBtnEdit());
		clickWithMultipleRetry(getBtnEdit(), 10, 1000);

		explicitWaitClickable(30, getBtnLimit_book());
		clickWithMultipleRetry(getBtnLimit_book(), 10, 1000);
		getBtnLimit_book().clear();
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 9);
		System.out.println(cell1);
		EnterInTextbox(getBtnLimit_book(), cell1);

		explicitWaitClickable(30, getBtnPreBookLimit());
		clickWithMultipleRetry(getBtnPreBookLimit(), 10, 1000);
		getBtnPreBookLimit().clear();
		EnterInTextbox(getBtnPreBookLimit(), cell1);

		explicitWaitClickable(30, getBtnOverdueLimit());
		clickWithMultipleRetry(getBtnOverdueLimit(), 10, 1000);
		getBtnOverdueLimit().clear();
		EnterInTextbox(getBtnOverdueLimit(), cell1);

		explicitWaitClickable(30, getBtnSaveLimit());
		clickWithMultipleRetry(getBtnSaveLimit(), 10, 1000);

	}

	public void VerifyBookLimitUpdated() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Limit Configuration Added Successfully", successPopupMsz);
//				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithRetry(getBtnSuccessOK());
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeletesTheCategoryAndSubcategoryConfiguration() throws InterruptedException {

		int maxRetries = 10;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				Actions actions = new Actions(driver);
				actions.moveToElement(getBookCategoryTab()).clickAndHold().moveToElement(getBookCategoryTab()).release()
						.perform();

				explicitWaitClickable(50, getBookCategoryTab());
				getBookCategoryTab().click();

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(2000);
			}
		}

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 4;

		WebElement body = getTable().findElement(By.tagName("tbody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));

		int numberOfRows = rows.size();
		System.out.println("Table Rows :" + numberOfRows);

		for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {
			int maxRetries1 = 5;
			for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
				try {
					WebElement actionColumn = getTable()
							.findElement(By.xpath(".//tr[" + (rowIndex + 1) + "]/td[" + (columnIndex + 1) + "]"));

					WebElement editButton = actionColumn.findElement(By.cssSelector(".delete_text"));

					explicitWaitClickable(50, editButton);
					clickWithRetry(editButton);
					break;
				} catch (Exception e) {
					System.out.println("Exception occurred: " + e.getMessage() + attempt1);
					e.printStackTrace();
					Thread.sleep(500);
				}
			}

		}
		explicitWaitClickable(50, getConfirmBtn());
		clickWithMultipleRetry(getConfirmBtn(), 50, 2000);

	}

	public void VerifyCategorysAreDeleted() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book category deleted successfully.", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeletesTheRacksAndShelfLocations() throws InterruptedException {

		int maxRetries = 10;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				Actions actions = new Actions(driver);
				actions.moveToElement(getRackConfigTab()).clickAndHold().moveToElement(getRackConfigTab()).release()
						.perform();

				explicitWaitClickable(50, getRackConfigTab());
				getRackConfigTab().click();

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(2000);
			}
		}

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 4;

		WebElement body = getTable1().findElement(By.tagName("tbody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));

		int numberOfRows = rows.size();
		System.out.println("Table Rows :" + numberOfRows);

		for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {
			int maxRetries1 = 5;
			for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
				try {
					WebElement actionColumn = getTable1()
							.findElement(By.xpath(".//tr[" + (rowIndex + 1) + "]/td[" + (columnIndex + 1) + "]"));

					WebElement editButton = actionColumn.findElement(By.cssSelector(".delete_text"));

					explicitWaitClickable(50, editButton);
					clickWithRetry(editButton);
					break;
				} catch (Exception e) {
					System.out.println("Exception occurred: " + e.getMessage() + attempt1);
					e.printStackTrace();
					Thread.sleep(500);
				}
			}
		}
		explicitWaitClickable(50, getConfirmBtn());
		clickWithMultipleRetry(getConfirmBtn(), 50, 2000);

	}

	public void VerifyRackAndShelfAreDeleted() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Rack deleted successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeletesTheBookLocationConfiguration() throws InterruptedException {

		Thread.sleep(10000);

		int maxRetries = 10;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				Actions actions = new Actions(driver);
				actions.moveToElement(getBookLocTab()).clickAndHold().moveToElement(getBookLocTab()).release()
						.perform();

				explicitWaitClickable(50, getBookLocTab());
				getBookLocTab().click();

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(2000);
			}
		}

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 7;

		WebElement body = getTable2().findElement(By.tagName("tbody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));

		int numberOfRows = rows.size();
		System.out.println("Table Rows :" + numberOfRows);

		for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {

			int maxRetries1 = 5;
			for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
				try {

					WebElement actionColumn = getTable2()
							.findElement(By.xpath(".//tr[" + (rowIndex + 1) + "]/td[" + (columnIndex + 1) + "]"));

					WebElement editButton = actionColumn.findElement(By.cssSelector(".delete_text"));

					explicitWaitClickable(50, editButton);
					clickWithRetry(editButton);

					break;
				} catch (Exception e) {
					System.out.println("Exception occurred: " + e.getMessage() + attempt1);
					e.printStackTrace();
					Thread.sleep(500);
				}
			}

		}

		explicitWaitClickable(50, getConfirmBtn());
		clickWithMultipleRetry(getConfirmBtn(), 50, 2000);

	}

	public void VerifyBookLocationIsDeleted() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book location deleted successfully.", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

}