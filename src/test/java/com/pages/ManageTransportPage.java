package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.google.api.client.util.Key;
import com.opencsv.exceptions.CsvException;

public class ManageTransportPage extends BaseClass {

	public ManageTransportPage() {
		PageFactory.initElements(driver, this);
	}

	int rowNum = 1;

	/*
	 * 1. Creates New Vehicles Manually And Using CSV File
	 */

	@FindBy(css = "#fleetManagementSection")
	private WebElement TransportManagementMenuBar;
	@FindBy(xpath = "//span[contains(.,'Manage Transport')]")
	private WebElement ManageTransportMenuBar;
	@FindBy(id = "sideVisitors")
	private WebElement VisitorMenuBar;

	public WebElement getVisitorMenuBar() {
		return VisitorMenuBar;
	}

	public void setVisitorMenuBar(WebElement visitorMenuBar) {
		VisitorMenuBar = visitorMenuBar;
	}

	public WebElement getTransportManagementMenuBar() {
		return TransportManagementMenuBar;
	}

	public void setTransportManagementMenuBar(WebElement transportManagementMenuBar) {
		TransportManagementMenuBar = transportManagementMenuBar;
	}

	public WebElement getManageTransportMenuBar() {
		return ManageTransportMenuBar;
	}

	public void setManageTransportMenuBar(WebElement manageTransportMenuBar) {
		ManageTransportMenuBar = manageTransportMenuBar;
	}

	@FindBy(css = ".vehicle_add_validation")
	private WebElement btnAddVehicles;
	@FindBy(css = ".vehicle_input #name16")
	private WebElement txtVehicleID;
	@FindBy(id = "name17")
	private WebElement txtVehicleRegNum;
	@FindBy(id = "name18")
	private WebElement txtVehicleBoughtDate;
	@FindBy(css = ".manufacturer")
	private WebElement ddnManufacturerName;
	@FindBy(id = "name20")
	private WebElement txtVehicleModel;
	@FindBy(id = "name21")
	private WebElement txtVehicleGPSID;
	@FindBy(id = "name22")
	private WebElement txtVehicleCapacity;
	@FindBy(css = ".vehicle_input:nth-child(1) #name22")
	private WebElement txtVehicleFCNoNum;
	@FindBy(id = "name23")
	private WebElement txtFcStartDate;
	@FindBy(id = "name24")
	private WebElement txtFcEndDate;
	@FindBy(id = "name25")
	private WebElement txtTotalFc;
	@FindBy(id = "name26")
	private WebElement txtInsuranceNum;
	@FindBy(id = "name27")
	private WebElement txtInsuranceStartDate;
	@FindBy(id = "name28")
	private WebElement txtInsuranceEndDate;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[1]")
	private WebElement AtcFCDoc;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[2]")
	private WebElement AtcInsuranceDoc;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[3]")
	private WebElement AtcRCDoc;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[4]")
	private WebElement AtcPollutionDocument;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[5]")
	private WebElement AtcVehicleImage1;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[6]")
	private WebElement AtcVehicleImage2;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[7]")
	private WebElement AtcVehicleImage3;

	public WebElement getBtnAddVehicles() {
		return btnAddVehicles;
	}

	public void setBtnAddVehicles(WebElement btnAddVehicles) {
		this.btnAddVehicles = btnAddVehicles;
	}

	public WebElement getTxtVehicleID() {
		return txtVehicleID;
	}

	public void setTxtVehicleID(WebElement txtVehicleID) {
		this.txtVehicleID = txtVehicleID;
	}

	public WebElement getTxtVehicleRegNum() {
		return txtVehicleRegNum;
	}

	public void setTxtVehicleRegNum(WebElement txtVehicleRegNum) {
		this.txtVehicleRegNum = txtVehicleRegNum;
	}

	public WebElement getTxtVehicleBoughtDate() {
		return txtVehicleBoughtDate;
	}

	public void setTxtVehicleBoughtDate(WebElement txtVehicleBoughtDate) {
		this.txtVehicleBoughtDate = txtVehicleBoughtDate;
	}

	public WebElement getDdnManufacturerName() {
		return ddnManufacturerName;
	}

	public void setDdnManufacturerName(WebElement ddnManufacturerName) {
		this.ddnManufacturerName = ddnManufacturerName;
	}

	public WebElement getTxtVehicleModel() {
		return txtVehicleModel;
	}

	public void setTxtVehicleModel(WebElement txtVehicleModel) {
		this.txtVehicleModel = txtVehicleModel;
	}

	public WebElement getTxtVehicleGPSID() {
		return txtVehicleGPSID;
	}

	public void setTxtVehicleGPSID(WebElement txtVehicleGPSID) {
		this.txtVehicleGPSID = txtVehicleGPSID;
	}

	public WebElement getTxtVehicleCapacity() {
		return txtVehicleCapacity;
	}

	public void setTxtVehicleCapacity(WebElement txtVehicleCapacity) {
		this.txtVehicleCapacity = txtVehicleCapacity;
	}

	public WebElement getTxtVehicleFCNoNum() {
		return txtVehicleFCNoNum;
	}

	public void setTxtVehicleFCNoNum(WebElement txtVehicleFCNoNum) {
		this.txtVehicleFCNoNum = txtVehicleFCNoNum;
	}

	public WebElement getTxtFcStartDate() {
		return txtFcStartDate;
	}

	public void setTxtFcStartDate(WebElement txtFcStartDate) {
		this.txtFcStartDate = txtFcStartDate;
	}

	public WebElement getTxtFcEndDate() {
		return txtFcEndDate;
	}

	public void setTxtFcEndDate(WebElement txtFcEndDate) {
		this.txtFcEndDate = txtFcEndDate;
	}

	public WebElement getTxtTotalFc() {
		return txtTotalFc;
	}

	public void setTxtTotalFc(WebElement txtTotalFc) {
		this.txtTotalFc = txtTotalFc;
	}

	public WebElement getTxtInsuranceNum() {
		return txtInsuranceNum;
	}

	public void setTxtInsuranceNum(WebElement txtInsuranceNum) {
		this.txtInsuranceNum = txtInsuranceNum;
	}

	public WebElement getTxtInsuranceStartDate() {
		return txtInsuranceStartDate;
	}

	public void setTxtInsuranceStartDate(WebElement txtInsuranceStartDate) {
		this.txtInsuranceStartDate = txtInsuranceStartDate;
	}

	public WebElement getTxtInsuranceEndDate() {
		return txtInsuranceEndDate;
	}

	public void setTxtInsuranceEndDate(WebElement txtInsuranceEndDate) {
		this.txtInsuranceEndDate = txtInsuranceEndDate;
	}

	public WebElement getAtcFCDoc() {
		return AtcFCDoc;
	}

	public void setAtcFCDoc(WebElement atcFCDoc) {
		AtcFCDoc = atcFCDoc;
	}

	public WebElement getAtcInsuranceDoc() {
		return AtcInsuranceDoc;
	}

	public void setAtcInsuranceDoc(WebElement atcInsuranceDoc) {
		AtcInsuranceDoc = atcInsuranceDoc;
	}

	public WebElement getAtcRCDoc() {
		return AtcRCDoc;
	}

	public void setAtcRCDoc(WebElement atcRCDoc) {
		AtcRCDoc = atcRCDoc;
	}

	public WebElement getAtcPollutionDocument() {
		return AtcPollutionDocument;
	}

	public void setAtcPollutionDocument(WebElement atcPollutionDocument) {
		AtcPollutionDocument = atcPollutionDocument;
	}

	public WebElement getAtcVehicleImage1() {
		return AtcVehicleImage1;
	}

	public void setAtcVehicleImage1(WebElement atcVehicleImage1) {
		AtcVehicleImage1 = atcVehicleImage1;
	}

	public WebElement getAtcVehicleImage2() {
		return AtcVehicleImage2;
	}

	public void setAtcVehicleImage2(WebElement atcVehicleImage2) {
		AtcVehicleImage2 = atcVehicleImage2;
	}

	public WebElement getAtcVehicleImage3() {
		return AtcVehicleImage3;
	}

	public void setAtcVehicleImage3(WebElement atcVehicleImage3) {
		AtcVehicleImage3 = atcVehicleImage3;
	}

	@FindBy(xpath = "//button[contains(.,'OK')]")
	private WebElement successPopup;
	@FindBy(css = ".swal-text")
	private WebElement successPopupText;

	public WebElement getSuccessPopupText() {
		return successPopupText;
	}

	public void setSuccessPopupText(WebElement successPopupText) {
		this.successPopupText = successPopupText;
	}

	public WebElement getSuccessPopup() {
		return successPopup;
	}

	public void setSuccessPopup(WebElement successPopup) {
		this.successPopup = successPopup;
	}

	/*
	 * Bulk upload Vehicle using Csv
	 */

	@FindBy(xpath = "//button[contains(.,'Uplode CSV')]")
	private WebElement btnUploadCSV;
	@FindBy(id = "csv_view_add")
	private WebElement UploadCSV;
	@FindBy(xpath = "//button[contains(.,'Submit')]")
	private WebElement btnSubmitCSV;

	public WebElement getUploadCSV() {
		return UploadCSV;
	}

	public void setUploadCSV(WebElement uploadCSV) {
		UploadCSV = uploadCSV;
	}

	public WebElement getBtnSubmitCSV() {
		return btnSubmitCSV;
	}

	public void setBtnSubmitCSV(WebElement btnSubmitCSV) {
		this.btnSubmitCSV = btnSubmitCSV;
	}

	public WebElement getBtnUploadCSV() {
		return btnUploadCSV;
	}

	public void setBtnUploadCSV(WebElement btnUploadCSV) {
		this.btnUploadCSV = btnUploadCSV;
	}

	/*
	 * 2. Verify Vehicle Is Created
	 */

	/*
	 * 3. Create new Route
	 */

	@FindBy(xpath = "//button[contains(.,'Routes')]")
	private WebElement RouteTab;
	@FindBy(xpath = "//button[contains(.,'Add Route')]")
	private WebElement btnAddRoute;
	@FindBy(css = ".route_name")
	private WebElement txtRouteName;
	@FindBy(css = ".vehicle_list_dropdown")
	private WebElement ddnVehicleName;
	@FindBy(css = ".trip_start_time")
	private WebElement datepickerStartTime;
	@FindBy(xpath = "//input[@id='checkbox_1']")
	private WebElement radiobtnPickup;
	@FindBy(css = ".starting_point")
	private WebElement txtStartingPoint;
	@FindBy(css = ".ending_point")
	private WebElement txtEndingPoint;
	@FindBy(css = ".driver_name")
	private WebElement ddnDriverName;
	@FindBy(css = ".caretaker")
	private WebElement ddnCaretakerName;
	@FindBy(xpath = "//input[@name='route_fee_type'and @id='checkbox_4']")
	private WebElement radiobtnFeeType;
	@FindBy(css = ".add_route_fixed_fee")
	private WebElement txtFeeAmount;
	@FindBy(css = ".route_location")
	private WebElement txtRouteLoc;
	@FindBy(css = ".arriving_time")
	private WebElement txtRouteTime;
	@FindBy(css = ".gps")
	private WebElement txtGPS;
	@FindBy(css = ".create_btn")
	private WebElement btnCreate;

	public WebElement getRouteTab() {
		return RouteTab;
	}

	public void setRouteTab(WebElement routeTab) {
		RouteTab = routeTab;
	}

	public WebElement getBtnAddRoute() {
		return btnAddRoute;
	}

	public void setBtnAddRoute(WebElement btnAddRoute) {
		this.btnAddRoute = btnAddRoute;
	}

	public WebElement getTxtRouteName() {
		return txtRouteName;
	}

	public void setTxtRouteName(WebElement txtRouteName) {
		this.txtRouteName = txtRouteName;
	}

	public WebElement getDdnVehicleName() {
		return ddnVehicleName;
	}

	public void setDdnVehicleName(WebElement ddnVehicleName) {
		this.ddnVehicleName = ddnVehicleName;
	}

	public WebElement getDatepickerStartTime() {
		return datepickerStartTime;
	}

	public void setDatepickerStartTime(WebElement datepickerStartTime) {
		this.datepickerStartTime = datepickerStartTime;
	}

	public WebElement getRadiobtnPickup() {
		return radiobtnPickup;
	}

	public void setRadiobtnPickup(WebElement radiobtnPickup) {
		this.radiobtnPickup = radiobtnPickup;
	}

	public WebElement getTxtStartingPoint() {
		return txtStartingPoint;
	}

	public void setTxtStartingPoint(WebElement txtStartingPoint) {
		this.txtStartingPoint = txtStartingPoint;
	}

	public WebElement getTxtEndingPoint() {
		return txtEndingPoint;
	}

	public void setTxtEndingPoint(WebElement txtEndingPoint) {
		this.txtEndingPoint = txtEndingPoint;
	}

	public WebElement getDdnDriverName() {
		return ddnDriverName;
	}

	public void setDdnDriverName(WebElement ddnDriverName) {
		this.ddnDriverName = ddnDriverName;
	}

	public WebElement getDdnCaretakerName() {
		return ddnCaretakerName;
	}

	public void setDdnCaretakerName(WebElement ddnCaretakerName) {
		this.ddnCaretakerName = ddnCaretakerName;
	}

	public WebElement getRadiobtnFeeType() {
		return radiobtnFeeType;
	}

	public void setRadiobtnFeeType(WebElement radiobtnFeeType) {
		this.radiobtnFeeType = radiobtnFeeType;
	}

	public WebElement getTxtFeeAmount() {
		return txtFeeAmount;
	}

	public void setTxtFeeAmount(WebElement txtFeeAmount) {
		this.txtFeeAmount = txtFeeAmount;
	}

	public WebElement getTxtRouteLoc() {
		return txtRouteLoc;
	}

	public void setTxtRouteLoc(WebElement txtRouteLoc) {
		this.txtRouteLoc = txtRouteLoc;
	}

	public WebElement getTxtRouteTime() {
		return txtRouteTime;
	}

	public void setTxtRouteTime(WebElement txtRouteTime) {
		this.txtRouteTime = txtRouteTime;
	}

	public WebElement getTxtGPS() {
		return txtGPS;
	}

	public void setTxtGPS(WebElement txtGPS) {
		this.txtGPS = txtGPS;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	/*
	 * 4. Verify Vehicle Route is Created
	 */

	/**
	 * Method Start Here
	 * 
	 * @throws InterruptedException
	 * @throws CsvException
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws AWTException
	 */

	public void CreatesNewVehiclesManuallyAndUsingACSVFile()
			throws InterruptedException, FileNotFoundException, IOException, CsvException, AWTException {

		Robot robot = new Robot();

		robot.delay(1000);

		command_TabRobot(robot);

		robot.delay(1000);

		mouseOverActionMoveToElement(getVisitorMenuBar());

		explicitWaitClickable(20, getTransportManagementMenuBar());
		clickWithRetry(getTransportManagementMenuBar());
		explicitWaitClickable(20, getTransportManagementMenuBar());
		clickWithMultipleRetry(getManageTransportMenuBar(), 10, 1000);

		explicitWaitClickable(20, getBtnAddVehicles());
		clickWithMultipleRetry(getBtnAddVehicles(), 10, 1000);

		explicitWaitClickable(20, getTxtVehicleID());
		clickWithMultipleRetry(getTxtVehicleID(), 10, 1000);
		String cell0 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 0);
		System.out.println(cell0);
		EnterInTextbox(getTxtVehicleID(), cell0);

		String cell1 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 1);
		System.out.println(cell1);
		EnterInTextbox(getTxtVehicleRegNum(), cell1);

		/**
		 * Handling Vehicle Bought Date Date-Picker
		 */

		String desiredDate = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 2);
		String desiredMonth = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 3);
		String desiredYear = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 4);
		System.out.println(desiredDate + desiredMonth + desiredYear);
		selectDate(desiredDate, desiredMonth, desiredYear, getTxtVehicleBoughtDate());

		String cell5 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 5);
		System.out.println(cell5);
		selectDdnByText(getDdnManufacturerName(), cell5);

		String cell6 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 6);
		System.out.println(cell6);
		EnterInTextbox(getTxtVehicleModel(), cell6);

		String cell7 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 7);
		System.out.println(cell7);
		EnterInTextbox(getTxtVehicleGPSID(), cell7);

		String cell8 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 8);
		System.out.println(cell8);
		EnterInTextbox(getTxtVehicleCapacity(), cell8);

		explicitWaitClickable(20, getTxtVehicleFCNoNum());
		clickWithMultipleRetry(getTxtVehicleFCNoNum(), 10, 1000);
		String cell9 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 9);
		System.out.println(cell9);
		EnterInTextbox(getTxtVehicleFCNoNum(), cell9);

		String desiredDate2 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 10);
		String desiredMonth2 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 11);
		String desiredYear2 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 12);
		System.out.println(desiredDate2 + desiredMonth2 + desiredYear2);
		selectDate(desiredDate2, desiredMonth2, desiredYear2, getTxtFcStartDate());

		String desiredDate3 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 13);
		String desiredMonth3 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 14);
		String desiredYear3 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 15);
		System.out.println(desiredDate3 + desiredMonth3 + desiredYear3);
		selectDate(desiredDate3, desiredMonth3, desiredYear3, getTxtFcEndDate());

		String cell16 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 16);
		System.out.println(cell16);
		EnterInTextbox(getTxtTotalFc(), cell16);

		String cell17 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 17);
		System.out.println(cell17);
		EnterInTextbox(getTxtInsuranceNum(), cell17);

		String desiredDate4 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 18);
		String desiredMonth4 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 19);
		String desiredYear4 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 20);
		System.out.println(desiredDate4 + desiredMonth4 + desiredYear4);
		selectDate(desiredDate4, desiredMonth4, desiredYear4, getTxtInsuranceStartDate());

		String desiredDate5 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 21);
		String desiredMonth5 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 22);
		String desiredYear5 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 23);
		System.out.println(desiredDate5 + desiredMonth5 + desiredYear5);
		selectDate(desiredDate5, desiredMonth5, desiredYear5, getTxtInsuranceEndDate());

		/*
		 * Upload FC Document
		 */

		explicitWaitClickable(20, getAtcFCDoc());
		clickWithRetry(getAtcFCDoc());
		String cell24 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 24);
		System.out.println(cell24);

		robot.delay(1500);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection1 = new StringSelection(cell24);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload Insurance Document
		 */

		explicitWaitClickable(20, getAtcInsuranceDoc());
		clickWithRetry(getAtcInsuranceDoc());
		String cell25 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 25);
		System.out.println(cell25);

		robot.delay(1000);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection2 = new StringSelection(cell25);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

//		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload RC Document
		 */

		explicitWaitClickable(20, getAtcRCDoc());
		clickWithRetry(getAtcRCDoc());
		String cell26 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 26);
		System.out.println(cell26);

		robot.delay(1000);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection3 = new StringSelection(cell26);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection3, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

//		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload Pollution Document
		 */

		explicitWaitClickable(20, getAtcPollutionDocument());
		clickWithRetry(getAtcPollutionDocument());
		String cell27 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 27);
		System.out.println(cell27);

		robot.delay(1000);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection4 = new StringSelection(cell27);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection4, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

//		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload Vehicle Image 1
		 */

		String cell28 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 28);
		System.out.println(cell28);
		explicitWaitClickable(20, getAtcVehicleImage1());
		clickWithRetry(getAtcVehicleImage1());

		robot.delay(1000);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection5 = new StringSelection(cell28);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection5, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		/*
		 * Upload Vehicle Image 2
		 */

		explicitWaitClickable(20, getAtcVehicleImage2());
		clickWithRetry(getAtcVehicleImage2());
		String cell29 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 29);
		System.out.println(cell29);

		robot.delay(1000);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection6 = new StringSelection(cell29);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection6, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		/*
		 * Upload Vehicle Image 3
		 */

		explicitWaitClickable(20, getAtcVehicleImage3());
		clickWithRetry(getAtcVehicleImage3());
		String cell30 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 30);
		System.out.println(cell30);

		robot.delay(1000);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection7 = new StringSelection(cell30);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection7, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				WebElement AddVehicleBtn = driver.findElement(By.cssSelector(".vehicle_add"));
				AddVehicleBtn.click();

				break;
			} catch (Exception e) {
				System.out.println("Handling Exception - Attempt " + attempt);
				Thread.sleep(500);

				CancelRobot(robot);

			}
		}

		explicitWaitClickable(10, getSuccessPopup());

		String successPopupMsz = getText(getSuccessPopupText());
		System.out.println(successPopupMsz);
		Assert.assertEquals("Vehicle created successfully", successPopupMsz);
		HighlightOutput("Assertion Passed Success Popup Message is " + successPopupMsz);

		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Bulk Upload
		 */

		clickWithMultipleRetry(getBtnUploadCSV(), 10, 1000);

		explicitWaitClickable(20, getUploadCSV());
		clickWithRetry(getUploadCSV());
		String cell31 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 31);
		System.out.println(cell31);

		robot.delay(1000);

		openSearchTabRobot(robot);
		robot.delay(1000);

		StringSelection stringSelection8 = new StringSelection(cell31);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection8, null);

		pasteTextRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		robot.delay(1000);

		EnterRobot(robot);

		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		explicitWaitClickable(20, getBtnSubmitCSV());
		clickWithMultipleRetry(getBtnSubmitCSV(), 10, 1000);

	}

	public void VerifyVehicleCreated() {

		explicitWaitClickable(10, getSuccessPopup());

		String successPopupMsz = getText(getSuccessPopupText());
		System.out.println(successPopupMsz);
		Assert.assertEquals("vehicle uploaded successfully", successPopupMsz);
		HighlightOutput("Assertion Passed Success Popup Message is " + successPopupMsz);

		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

	}

	public void CreateNewRoute() throws FileNotFoundException, IOException, CsvException, AWTException {

		Robot robot = new Robot();

		explicitWaitClickable(20, getRouteTab());
		clickWithMultipleRetry(getRouteTab(), 10, 1000);

		explicitWaitClickable(20, getBtnAddRoute());
		clickWithMultipleRetry(getBtnAddRoute(), 10, 1000);

		explicitWaitClickable(20, getTxtRouteName());
		clickWithMultipleRetry(getTxtRouteName(), 10, 1000);
		String cell1 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 32);
		System.out.println(cell1);
		EnterInTextbox(getTxtRouteName(), cell1);

		String cell2 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 33);
		System.out.println(cell2);
		selectDdnByText(getDdnVehicleName(), cell2);

		explicitWaitClickable(20, getDatepickerStartTime());
		clickWithMultipleRetry(getDatepickerStartTime(), 10, 1000);
		clearText(getDatepickerStartTime());
		String cell3 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 34);
		System.out.println(cell3);
		EnterInTextbox(getDatepickerStartTime(), cell3);

		tabRobot(robot);

//		explicitWaitClickable(20, getRadiobtnPickup());
//		clickWithMultipleRetry(getRadiobtnPickup(), 10, 1000);
		String cell4 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 35);
		System.out.println(cell4);

		explicitWaitClickable(20, getTxtStartingPoint());
		clickWithMultipleRetry(getTxtStartingPoint(), 10, 1000);
		String cell5 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 36);
		System.out.println(cell5);
		EnterInTextbox(getTxtStartingPoint(), cell5);

		explicitWaitClickable(20, getTxtEndingPoint());
		clickWithMultipleRetry(getTxtEndingPoint(), 10, 1000);
		String cell6 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 37);
		System.out.println(cell6);
		EnterInTextbox(getTxtEndingPoint(), cell6);

		String cell7 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 38);
		System.out.println(cell7);
		selectDdnByIndex(getDdnDriverName(), rowNum);

		String cell8 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 39);
		System.out.println(cell8);
		selectDdnByIndex(getDdnCaretakerName(), rowNum);

//		explicitWaitClickable(20, getRadiobtnFeeType());
//		clickWithMultipleRetry(getRadiobtnFeeType(), 10, 1000);
		String cell9 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 40);
		System.out.println(cell9);

		explicitWaitClickable(20, getTxtFeeAmount());
		clickWithMultipleRetry(getTxtFeeAmount(), 10, 1000);
		String cell10 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 41);
		System.out.println(cell10);
		EnterInTextbox(getTxtFeeAmount(), cell10);

		explicitWaitClickable(20, getTxtRouteLoc());
		clickWithMultipleRetry(getTxtRouteLoc(), 10, 1000);
		String cell11 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 42);
		System.out.println(cell11);
		EnterInTextbox(getTxtRouteLoc(), cell11);

		explicitWaitClickable(20, getTxtRouteTime());
		clickWithMultipleRetry(getTxtRouteTime(), 10, 1000);
		clearText(getTxtRouteTime());
		String cell12 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 43);
		System.out.println(cell12);
		EnterInTextbox(getTxtRouteTime(), cell12);

		tabRobot(robot);

		explicitWaitClickable(20, getTxtGPS());
		clickWithMultipleRetry(getTxtGPS(), 10, 1000);
		String cell13 = readSpecificCell(getPropertyFileValue("manageTransport"), rowNum, 44);
		System.out.println(cell13);
		EnterInTextbox(getTxtGPS(), cell13);

		explicitWaitClickable(20, getBtnCreate());
		clickWithMultipleRetry(getBtnCreate(), 10, 1000);

		explicitWaitClickable(20, getRouteTab());
		clickWithMultipleRetry(getRouteTab(), 10, 1000);

//		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

	}

	public void VerifyVehicleRouteCreated() {

	}

}
