package com.pages;

import java.io.File;
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

public class ManageBooksPage extends BaseClass {

	public ManageBooksPage() {
		PageFactory.initElements(driver, this);
		implicitwait(30);
	}

	int rowNum = 1;

	// 1. Add Books To The Library

	@FindBy(id = "schoolManagementSection")
	private WebElement schoolConfigMenu;
	@FindBy(id = "sideVisitors")
	private WebElement visitorLogMenu;
	@FindBy(id = "LibrarySection")
	private WebElement libraryMenu;
	@FindBy(id = "manageBooks")
	private WebElement manageBooksSideMenu;

	public WebElement getManageBooksSideMenu() {
		return manageBooksSideMenu;
	}

	public void setManageBooksSideMenu(WebElement manageBooksSideMenu) {
		this.manageBooksSideMenu = manageBooksSideMenu;
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

	@FindBy(xpath = "//button[contains(.,'Add Books')]")
	private WebElement AddBookBtn;
	@FindBy(xpath = "//input[@id='uploadBookCover' and @type='file']")
	private WebElement uploadBookImg;
	@FindBy(id = "bookName")
	private WebElement txtBookName;
	@FindBy(id = "authorName")
	private WebElement txtAuthorName;
	@FindBy(id = "ifbnNumber")
	private WebElement txtIFBNNum;
	@FindBy(id = "language")
	private WebElement txtLang;
	@FindBy(css = ".category_list")
	private WebElement ddnCategoryList;
	@FindBy(id = "subCategory")
	private WebElement ddnSubCategory;
	@FindBy(id = "rack")
	private WebElement ddnRack;
	@FindBy(id = "shelf")
	private WebElement ddnShelf;
	@FindBy(id = "availableCopy")
	private WebElement txtAvailableCopy;
	@FindBy(id = "productDescription")
	private WebElement txtSummary;
	@FindBy(css = "#addBooks .create_btn")
	private WebElement bookSubmitBtn;

	public WebElement getBookSubmitBtn() {
		return bookSubmitBtn;
	}

	public void setBookSubmitBtn(WebElement bookSubmitBtn) {
		this.bookSubmitBtn = bookSubmitBtn;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public WebElement getAddBookBtn() {
		return AddBookBtn;
	}

	public void setAddBookBtn(WebElement addBookBtn) {
		AddBookBtn = addBookBtn;
	}

	public WebElement getUploadBookImg() {
		return uploadBookImg;
	}

	public void setUploadBookImg(WebElement uploadBookImg) {
		this.uploadBookImg = uploadBookImg;
	}

	public WebElement getTxtBookName() {
		return txtBookName;
	}

	public void setTxtBookName(WebElement txtBookName) {
		this.txtBookName = txtBookName;
	}

	public WebElement getTxtAuthorName() {
		return txtAuthorName;
	}

	public void setTxtAuthorName(WebElement txtAuthorName) {
		this.txtAuthorName = txtAuthorName;
	}

	public WebElement getTxtIFBNNum() {
		return txtIFBNNum;
	}

	public void setTxtIFBNNum(WebElement txtIFBNNum) {
		this.txtIFBNNum = txtIFBNNum;
	}

	public WebElement getTxtLang() {
		return txtLang;
	}

	public void setTxtLang(WebElement txtLang) {
		this.txtLang = txtLang;
	}

	public WebElement getDdnCategoryList() {
		return ddnCategoryList;
	}

	public void setDdnCategoryList(WebElement ddnCategoryList) {
		this.ddnCategoryList = ddnCategoryList;
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

	public WebElement getDdnShelf() {
		return ddnShelf;
	}

	public void setDdnShelf(WebElement ddnShelf) {
		this.ddnShelf = ddnShelf;
	}

	public WebElement getTxtAvailableCopy() {
		return txtAvailableCopy;
	}

	public void setTxtAvailableCopy(WebElement txtAvailableCopy) {
		this.txtAvailableCopy = txtAvailableCopy;
	}

	public WebElement getTxtSummary() {
		return txtSummary;
	}

	public void setTxtSummary(WebElement txtSummary) {
		this.txtSummary = txtSummary;
	}

	/*
	 * 2. Verify Book Is Added
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
	 * 3. Assigns Book To A Student
	 */

	@FindBy(xpath = "//button[contains(.,'Manage Books')]")
	private WebElement btnManageBooks;
	@FindBy(xpath = "//input[@type='text' and @id='categoryInputId']")
	private WebElement txtStudentId;

	public WebElement getTxtStudentId() {
		return txtStudentId;
	}

	public void setTxtStudentId(WebElement txtStudentId) {
		this.txtStudentId = txtStudentId;
	}

	@FindBy(css = ".fetchStudentDetails")
	private WebElement fetchStudentBtn;
	@FindBy(css = ".addBookModal")
	private WebElement addBookHypLink;
	@FindBy(id = "bookId")
	private WebElement ddnBookId;
	@FindBy(css = "#addSelectBooks .create_btn")
	private WebElement addBookBtn1;
	@FindBy(css = ".submitSection .create_btn")
	private WebElement addBookCreateBtn;

	public WebElement getAddBookCreateBtn() {
		return addBookCreateBtn;
	}

	public void setAddBookCreateBtn(WebElement addBookCreateBtn) {
		this.addBookCreateBtn = addBookCreateBtn;
	}

	public WebElement getAddBookBtn1() {
		return addBookBtn1;
	}

	public void setAddBookBtn1(WebElement addBookBtn1) {
		this.addBookBtn1 = addBookBtn1;
	}

	public WebElement getBtnManageBooks() {
		return btnManageBooks;
	}

	public void setBtnManageBooks(WebElement btnManageBooks) {
		this.btnManageBooks = btnManageBooks;
	}

	public WebElement getFetchStudentBtn() {
		return fetchStudentBtn;
	}

	public void setFetchStudentBtn(WebElement fetchStudentBtn) {
		this.fetchStudentBtn = fetchStudentBtn;
	}

	public WebElement getAddBookHypLink() {
		return addBookHypLink;
	}

	public void setAddBookHypLink(WebElement addBookHypLink) {
		this.addBookHypLink = addBookHypLink;
	}

	public WebElement getDdnBookId() {
		return ddnBookId;
	}

	public void setDdnBookId(WebElement ddnBookId) {
		this.ddnBookId = ddnBookId;
	}

	/*
	 * 4. Verify Book Is Assigned To The Student
	 */

	/*
	 * 5. Tracks The Assignment Book
	 */

	@FindBy(id = "pills-profile-tab")
	private WebElement bookHistoryTab;

	public WebElement getBookHistoryTab() {
		return bookHistoryTab;
	}

	public void setBookHistoryTab(WebElement bookHistoryTab) {
		this.bookHistoryTab = bookHistoryTab;
	}

	@FindBy(id = "booking_history-table")
	private WebElement table;

	public WebElement getTable() {
		return table;
	}

	public void setTable(WebElement table) {
		this.table = table;
	}

	@FindBy(css = ".selected.booking_history-single_book_status")
	private WebElement ddnIssue;

	public WebElement getDdnIssue() {
		return ddnIssue;
	}

	public void setDdnIssue(WebElement ddnIssue) {
		this.ddnIssue = ddnIssue;
	}

	/*
	 * 6. Verify Assigned Books Details
	 */

	/*
	 * 7. Update The Book Details
	 */

	@FindBy(id = "allBooksTableList")
	private WebElement table1;
	@FindBy(id = "pills-home-tab")
	private WebElement booksHomeTab;

	public WebElement getBooksHomeTab() {
		return booksHomeTab;
	}

	public void setBooksHomeTab(WebElement booksHomeTab) {
		this.booksHomeTab = booksHomeTab;
	}

	public WebElement getTable1() {
		return table1;
	}

	public void setTable1(WebElement table1) {
		this.table1 = table1;
	}

	@FindBy(id = "edit_book_name")
	private WebElement txtEditBookName;
	@FindBy(id = "edit_author_name")
	private WebElement txtEditAuthorName;
	@FindBy(id = "edit_available")
	private WebElement txtEditAvailabity;
	@FindBy(xpath = "//button[contains(.,'Update')]")
	private WebElement btnUpdate;

	public WebElement getTxtEditBookName() {
		return txtEditBookName;
	}

	public void setTxtEditBookName(WebElement txtEditBookName) {
		this.txtEditBookName = txtEditBookName;
	}

	public WebElement getTxtEditAuthorName() {
		return txtEditAuthorName;
	}

	public void setTxtEditAuthorName(WebElement txtEditAuthorName) {
		this.txtEditAuthorName = txtEditAuthorName;
	}

	public WebElement getTxtEditAvailabity() {
		return txtEditAvailabity;
	}

	public void setTxtEditAvailabity(WebElement txtEditAvailabity) {
		this.txtEditAvailabity = txtEditAvailabity;
	}

	public WebElement getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(WebElement btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	/*
	 * 8. Verify Book Details Is Updated
	 */

	/*
	 * 9. Delete The Book
	 */
	@FindBy(xpath = "//button[contains(.,'Yes, I am sure!')]")
	private WebElement confirmBtn;

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public void setConfirmBtn(WebElement confirmBtn) {
		this.confirmBtn = confirmBtn;
	}

	/*
	 * 10. Verify Book Is Deleted
	 */

	/**
	 * Method Start's Here
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws CsvException
	 */

	public void AddBooksToTheLibrary() throws FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSchoolConfigMenu());
		clickWithMultipleRetry(getSchoolConfigMenu(), 10, 1000);

		mouseOverActionMoveToElement(getVisitorLogMenu());

		explicitWaitClickable(30, getLibraryMenu());
		clickWithMultipleRetry(getLibraryMenu(), 10, 1000);
		explicitWaitClickable(30, getManageBooksSideMenu());
		clickWithMultipleRetry(getManageBooksSideMenu(), 10, 1000);

		explicitWaitClickable(30, getAddBookBtn());
		clickWithMultipleRetry(getAddBookBtn(), 10, 1000);

		/*
		 * Upload File
		 */

		File uploadFile1 = new File(getProjectPath() + getPropertyFileValue("bookImg"));
		WebElement labelElement = driver.findElement(By.className("uploadImageField"));
		WebElement fileInput1 = labelElement.findElement(By.xpath("//input[@type='file' and @id='uploadBookCover']"));
		fileInput1.sendKeys(uploadFile1.getAbsolutePath());

		/*
		 * Enter valid datas
		 */

		explicitWaitClickable(30, getTxtBookName());
		clickWithMultipleRetry(getTxtBookName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 10);
		System.out.println(cell);
		EnterInTextbox(getTxtBookName(), cell);

		explicitWaitClickable(30, getTxtAuthorName());
		clickWithMultipleRetry(getTxtAuthorName(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 11);
		System.out.println(cell1);
		EnterInTextbox(getTxtAuthorName(), cell1);

		explicitWaitClickable(30, getTxtIFBNNum());
		clickWithMultipleRetry(getTxtIFBNNum(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 12);
		System.out.println(cell2);
		EnterInTextbox(getTxtIFBNNum(), cell2);

		explicitWaitClickable(30, getTxtLang());
		clickWithMultipleRetry(getTxtLang(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 13);
		System.out.println(cell3);
		EnterInTextbox(getTxtLang(), cell3);

		explicitWaitClickable(30, getDdnCategoryList());
		clickWithMultipleRetry(getDdnCategoryList(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 14);
		System.out.println(cell4);
		selectDdnByText(getDdnCategoryList(), cell4);

		explicitWaitClickable(30, getDdnSubCategory());
		clickWithMultipleRetry(getDdnSubCategory(), 10, 1000);
		String cell5 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 15);
		System.out.println(cell5);
		selectDdnByText(getDdnSubCategory(), cell5);

		explicitWaitClickable(30, getDdnRack());
		clickWithMultipleRetry(getDdnRack(), 10, 1000);
		String cell6 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 16);
		System.out.println(cell6);
		selectDdnByText(getDdnRack(), cell6);

		explicitWaitClickable(30, getDdnShelf());
		clickWithMultipleRetry(getDdnShelf(), 10, 1000);
		String cell7 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 17);
		System.out.println(cell7);
		selectDdnByText(getDdnShelf(), cell7);

		explicitWaitClickable(30, getTxtAvailableCopy());
		clickWithMultipleRetry(getTxtAvailableCopy(), 10, 1000);
		String cell8 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 18);
		System.out.println(cell8);
		EnterInTextbox(getTxtAvailableCopy(), cell8);

		explicitWaitClickable(30, getTxtSummary());
		clickWithMultipleRetry(getTxtSummary(), 10, 1000);
		String cell9 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 19);
		System.out.println(cell9);
		EnterInTextbox(getTxtSummary(), cell9);

		explicitWaitClickable(30, getBookSubmitBtn());
		clickWithMultipleRetry(getBookSubmitBtn(), 10, 1000);

		// Book Created Successfully!
	}

	public void VerifyBookIsAdded() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book Created Successfully!", successPopupMsz);
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

	public void AssignsBookToAStudent() throws FileNotFoundException, IOException, CsvException, InterruptedException {

		explicitWaitClickable(30, getBtnManageBooks());
		clickWithMultipleRetry(getBtnManageBooks(), 10, 1000);

		explicitWaitClickable(30, getTxtStudentId());
		clickWithMultipleRetry(getTxtStudentId(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 20);
		System.out.println(cell1);
		EnterInTextbox(getTxtStudentId(), cell1);

		explicitWaitClickable(30, getFetchStudentBtn());
		clickWithMultipleRetry(getFetchStudentBtn(), 10, 1000);

		Thread.sleep(3000);

		explicitWaitClickable(30, getAddBookHypLink());
		clickWithMultipleRetry(getAddBookHypLink(), 10, 1000);

		explicitWaitClickable(30, getDdnBookId());
		clickWithMultipleRetry(getDdnBookId(), 10, 1000);
		selectDdnByIndex(getDdnBookId(), 1);

		explicitWaitClickable(30, getAddBookBtn1());
		clickWithMultipleRetry(getAddBookBtn1(), 10, 1000);

		explicitWaitClickable(30, getAddBookCreateBtn());
		clickWithMultipleRetry(getAddBookCreateBtn(), 10, 1000);

	}

	public void VerifyBookIsAssignedToTheStudent() throws InterruptedException {

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Student Book Updated Successfully", successPopupMsz);
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

	public void TracksTheAssignmentBook()
			throws InterruptedException, FileNotFoundException, IOException, CsvException {

		driver.navigate().refresh();

		Thread.sleep(2000);

		explicitWaitClickable(30, getBookHistoryTab());
		clickWithMultipleRetry(getBookHistoryTab(), 10, 1000);

		Actions actions = new Actions(driver);
		actions.clickAndHold().moveByOffset(200, 0).release().perform();

		Thread.sleep(3000);

		explicitWaitClickable(30, getDdnIssue());
		clickWithMultipleRetry(getDdnIssue(), 10, 1000);
		selectDdnByValue(getDdnIssue(), "2");

		int maxRetries1 = 5;
		for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Status updated successfully!", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt1);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		Thread.sleep(2000);

		explicitWaitClickable(30, getDdnIssue());
		clickWithMultipleRetry(getDdnIssue(), 10, 1000);
		selectDdnByValue(getDdnIssue(), "3");

	}

	public void VerifyAssignedBooksDetails() throws InterruptedException {
		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Status updated successfully!", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdateTheBookDetails() throws FileNotFoundException, IOException, CsvException, InterruptedException {

		explicitWaitClickable(30, getBooksHomeTab());
		clickWithMultipleRetry(getBooksHomeTab(), 10, 1000);

		Actions actions = new Actions(driver);
		actions.clickAndHold().moveByOffset(100, 0).release().perform();

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 13;

		WebElement body = getTable1().findElement(By.tagName("tbody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));

		int numberOfRows = rows.size();
		System.out.println("Table Rows :" + numberOfRows);

		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
			int maxRetries1 = 5;
			for (int attempt1 = 1; attempt1 <= maxRetries1; attempt1++) {
				try {
					WebElement actionColumn = getTable1()
							.findElement(By.xpath(".//tr[" + (rowIndex + 1) + "]/td[" + (columnIndex + 1) + "]"));

					WebElement editButton = actionColumn.findElement(By.cssSelector(".edit_text"));

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

		Thread.sleep(2000);

		explicitWaitClickable(30, getTxtEditBookName());
		clickWithMultipleRetry(getTxtEditBookName(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 21);
		System.out.println(cell1);
		getTxtEditBookName().clear();

		EnterInTextbox(getTxtEditBookName(), cell1);

		explicitWaitClickable(30, getTxtEditAuthorName());
		clickWithMultipleRetry(getTxtEditAuthorName(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 22);
		System.out.println(cell2);
		getTxtEditAuthorName().clear();
		EnterInTextbox(getTxtEditAuthorName(), cell2);

		explicitWaitClickable(30, getTxtEditAvailabity());
		clickWithMultipleRetry(getTxtEditAvailabity(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("libraryCSV"), rowNum, 23);
		System.out.println(cell3);
		getTxtEditAvailabity().clear();
		EnterInTextbox(getTxtEditAvailabity(), cell3);

		explicitWaitClickable(30, getBtnUpdate());
		clickWithMultipleRetry(getBtnUpdate(), 10, 1000);

	}

	public void VerifyBookDetailsIsUpdated() throws InterruptedException {
		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book Updated Successfully!", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeleteTheBook() throws InterruptedException {

		/*
		 * Handle Dynamic Web Table
		 */

		int columnIndex = 13;

		WebElement body = getTable1().findElement(By.tagName("tbody"));
		List<WebElement> rows = body.findElements(By.tagName("tr"));

		int numberOfRows = rows.size();
		System.out.println("Table Rows :" + numberOfRows);

		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
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

		explicitWaitClickable(30, getConfirmBtn());
		clickWithMultipleRetry(getConfirmBtn(), 10, 1000);

	}

	public void VerifyBookIsDeleted() throws InterruptedException {
		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getBtnSuccessOK());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Book Deleted Successfully!", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getBtnSuccessOK(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

}
