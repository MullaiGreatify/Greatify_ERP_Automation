package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class TeacherInformationPage extends BaseClass {

	public TeacherInformationPage() {
		PageFactory.initElements(driver, this);
	}

	static Map<String, String> jsonMap2;
	static Map<String, String> jsonMap1;
	static Map<String, String> jsonMap3;

	// 1. School Admin
	// Naviagte To The Teacher Management Of The School Admin

	@FindBy(xpath = "//p[contains(text(),'Teacher and Staffs')]")
	private WebElement mainmenuTeacherAndStaff;
	@FindBy(xpath = "//span[contains(text(),'Teachers')]")
	private WebElement mainmenuTeacher;
	@FindBy(className = "search__field")
	private WebElement searchTab;
	@FindBy(xpath = "//td[@onclick='student_views()']")
	private WebElement teacherID;

	public WebElement getMainmenuTeacherAndStaff() {
		return mainmenuTeacherAndStaff;
	}

	public void setMainmenuTeacherAndStaff(WebElement mainmenuTeacherAndStaff) {
		this.mainmenuTeacherAndStaff = mainmenuTeacherAndStaff;
	}

	public WebElement getMainmenuTeacher() {
		return mainmenuTeacher;
	}

	public void setMainmenuTeacher(WebElement mainmenuTeacher) {
		this.mainmenuTeacher = mainmenuTeacher;
	}

	public WebElement getSearchTab() {
		return searchTab;
	}

	public void setSearchTab(WebElement searchTab) {
		this.searchTab = searchTab;
	}

	public WebElement getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(WebElement teacherID) {
		this.teacherID = teacherID;
	}

	// Verify Teacher ID

	@FindBy(className = "teacher_id")
	private WebElement teacherId;

	public WebElement getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(WebElement teacherId) {
		this.teacherId = teacherId;
	}

	// Identify And Record The Teacher Details In School Admin

	@FindBy(className = "details-info")
	private WebElement teacherDetails;

	public WebElement getTeacherDetails() {
		return teacherDetails;
	}

	public void setTeacherDetails(WebElement teacherDetails) {
		this.teacherDetails = teacherDetails;
	}

	@FindBy(className = "gender")
	private WebElement gender;
	@FindBy(className = "teacher_mob_num")
	private WebElement teacher_mob_num;
	@FindBy(className = "email")
	private WebElement email;
	@FindBy(className = "address")
	private WebElement address;

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getTeacher_mob_num() {
		return teacher_mob_num;
	}

	public void setTeacher_mob_num(WebElement teacher_mob_num) {
		this.teacher_mob_num = teacher_mob_num;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	// 2. Teacher Dashboard
	// Naviagte To The Teacher Details Page
	@FindBy(xpath = "//div[@id=\"community\"]")
	private WebElement teacherProfile;
	@FindBy(xpath = "//a[contains(text(),' My Profile')]")
	private WebElement profile;

	public WebElement getProfile() {
		return profile;
	}

	public void setProfile(WebElement profile) {
		this.profile = profile;
	}

	public WebElement getTeacherProfile() {
		return teacherProfile;
	}

	public void setTeacherProfile(WebElement teacherProfile) {
		this.teacherProfile = teacherProfile;
	}

	// Verify Teacher ID In The Teacher Dashboard

	@FindBy(xpath = "(//p[contains(text(),'VDTECH001')])[2]")
	private WebElement teacherid;

	public WebElement getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(WebElement teacherid) {
		this.teacherid = teacherid;
	}

	// Identify And Record The Teacher Details In Teacher Dashboard

	@FindBy(className = "student_info")
	private WebElement teacherInfo;
	@FindBy(id = "tgender")
	private WebElement tgender;
	@FindBy(id = "tadd")
	private WebElement tadd;

	public WebElement getTgender() {
		return tgender;
	}

	public void setTgender(WebElement tgender) {
		this.tgender = tgender;
	}

	public WebElement getTadd() {
		return tadd;
	}

	public void setTadd(WebElement tadd) {
		this.tadd = tadd;
	}

	public WebElement getTeacherInfo() {
		return teacherInfo;
	}

	public void setTeacherInfo(WebElement teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

	// VerifyTheRecordedDetailsOfTeacherInTeacherDashboardWithSchoolAdmin

	// 3. Principal Dashboard
	// Naviagte To The Teacher Page Of Principal Dashboard

	@FindBy(xpath = "//span[text()='Teachers']")
	private WebElement mainmenubarTeacher;
	@FindBy(className = "search__field")
	private WebElement searchIcon;
	@FindBy(xpath = "//td[@onclick=\"student_views()\"]")
	private WebElement teacherIdlink;

	public WebElement getMainmenubarTeacher() {
		return mainmenubarTeacher;
	}

	public void setMainmenubarTeacher(WebElement mainmenubarTeacher) {
		this.mainmenubarTeacher = mainmenubarTeacher;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public void setSearchIcon(WebElement searchIcon) {
		this.searchIcon = searchIcon;
	}

	public WebElement getTeacherIdlink() {
		return teacherIdlink;
	}

	public void setTeacherIdlink(WebElement teacherIdlink) {
		this.teacherIdlink = teacherIdlink;
	}

	// Verify Teacher ID In The Principal Dashboard

	@FindBy(xpath = "//p[@class=\"teacher-details_id\"]")
	private WebElement teacherDetail;

	public WebElement getTeacherDetail() {
		return teacherDetail;
	}

	public void setTeacherDetail(WebElement teacherDetail) {
		this.teacherDetail = teacherDetail;
	}

	// Identify And Record The Teacher Details In Principal Dashboard
	@FindBy(id = "teacher-details_personaldata")
	private WebElement teacherPersonalData;

	public WebElement getTeacherPersonalData() {
		return teacherPersonalData;
	}

	public void setTeacherPersonalData(WebElement teacherPersonalData) {
		this.teacherPersonalData = teacherPersonalData;
	}

	// Verify The Recorded Details Of Teacher In Principal Dashboard With School
	// Admin

	public void NaviagteToTheTeacherManagementOfTheSchoolAdmin()
			throws FileNotFoundException, IOException, InterruptedException {

		Thread.sleep(3000);
		explicitWaitClickable(30, getMainmenuTeacherAndStaff());
		clickWithRetry(getMainmenuTeacherAndStaff());
		explicitWaitClickable(20, getMainmenuTeacher());
		clickWithRetry(getMainmenuTeacher());
		explicitWaitClickable(20, getSearchTab());
		clickWithRetry(getSearchTab());
		EnterInTextbox(getSearchTab(), getPropertyFileValue("teacherid"));
		explicitWaitClickable(20, getTeacherID());
		clickWithRetry(getTeacherID());

	}

	public void VerifyTeacherID() throws FileNotFoundException, IOException {
		String TeacherID = getText(getTeacherId());
		Assert.assertEquals(TeacherID, getPropertyFileValue("teacherid"));
		HighlightOutput("Assertion Passed Teacher ID is " + TeacherID);

	}

	public void IdentifyAndRecordTheTeacherDetailsInSchoolAdmin() {

		String Std_Details1 = getText(getTeacherDetails());

		// Split the string based on newline characters
		String[] keyValuePairs = Std_Details1.split("\\n");

		jsonMap1 = new TreeMap<>();

		// int Size = keyValuePairs.length / 2;

		// String[] arr1 = new String[Size];

		// for (int i = 0, j = 0; i < keyValuePairs.length - 1; i += 2, j++) {

		for (int i = 0; i < keyValuePairs.length - 1; i += 2) {
			String key = keyValuePairs[i];
			String value = keyValuePairs[i + 1];
			jsonMap1.put(key, value);
			// arr1[j] = value;
		}

		// System.out.println("Array values are :" + Arrays.toString(arr1));

		JSONObject jsonObject1 = new JSONObject(jsonMap1);

		String jsonString = jsonObject1.toString();

		System.out.println("JSON String: " + jsonString);

	}

	public void NaviagteToTheTeacherDetailsPage() {

		mouseOverAction(getTeacherProfile());
		// eleClick(getTeacherProfile());
		clickWithRetry(getTeacherProfile());
		explicitWaitClickable(20, getProfile());
		eleClick(getProfile());

	}

	public void VerifyTeacherIDInTheTeacherDashboard() throws FileNotFoundException, IOException {
		String TeacherID = getText(getTeacherid());
		Assert.assertEquals(TeacherID, getPropertyFileValue("teacherid"));
		HighlightOutput("Assertion Passed Teacher ID is " + TeacherID);

	}

	public void IdentifyAndRecordTheTeacherDetailsInTeacherDashboard() {
		String Std_Details2 = getText(getTeacherInfo());

		String[] keyValuePairs = Std_Details2.split("\\n");

		jsonMap2 = new TreeMap<>();

		// int Size = keyValuePairs.length / 2;

		// String[] arr1 = new String[Size];

		// for (int i = 0, j = 0; i < keyValuePairs.length - 1; i += 2, j++) {

		for (int i = 0; i < keyValuePairs.length - 1; i += 2) {
			String key = keyValuePairs[i];
			String value = keyValuePairs[i + 1];
			jsonMap2.put(key, value);
			// arr1[j] = value;
		}

		// System.out.println("Array values are :" + Arrays.toString(arr1));

		JSONObject jsonObject1 = new JSONObject(jsonMap2);

		String jsonString = jsonObject1.toString();

		System.out.println("JSON String: " + jsonString);

	}

	public void VerifyTheRecordedDetailsOfTeacherInTeacherDashboardWithSchoolAdmin() {
		System.out.println("Teacher_Details: " + jsonMap2);
		System.out.println("Teacher_Details: " + jsonMap1);

		for (Map.Entry<String, String> entry : jsonMap2.entrySet()) {
			String key = entry.getKey();
			String value1 = entry.getValue();

			if (jsonMap1.containsKey(key)) {
				String value2 = jsonMap1.get(key);
				// HighlightOutput("Key: " + key + ", Value in Map1: " + value1 + ", Value in
				// Map2: " + value2);
				// System.out.println("Key: " + key + ", Value in Map1: " + value1 + ", Value in
				// Map2: " + value2);
				HighlightOutput1("Key: ");
				System.out.println(key);
				HighlightOutput1("Value in Map1: ");
				System.out.println(value1);
				HighlightOutput1("Value in Map2: ");
				System.out.println(value2);
			}
		}
	}

	public void NaviagteToTheTeacherPageOfPrincipalDashboard()
			throws FileNotFoundException, IOException, InterruptedException {

		explicitWaitClickable(20, getMainmenubarTeacher());
		clickWithRetry(getMainmenubarTeacher());

		explicitWaitClickable(20, getSearchIcon());
		clickWithRetry(getSearchIcon());

		EnterInTextbox(getSearchIcon(), getPropertyFileValue("teacherid"));

		explicitWaitClickable(20, getTeacherIdlink());
		clickWithRetry(getTeacherIdlink());
		Thread.sleep(3000);
	}

	public void VerifyTeacherIDInThePrincipalDashboard() throws FileNotFoundException, IOException {

		String TeacherID = getText(getTeacherDetail());
		Assert.assertEquals(TeacherID, getPropertyFileValue("teacherid"));
		HighlightOutput("Assertion Passed Teacher ID is " + TeacherID);

	}

	public void IdentifyAndRecordTheTeacherDetailsInPrincipalDashboard() {

		String Std_Details2 = getText(getTeacherPersonalData());
		System.out.println(Std_Details2);

		String Std_Details = getText(getTeacherPersonalData());

//Regular Expression Concept (Regex)
//Pattern Class is used to define the pattern
		Pattern pattern = Pattern.compile("([a-zA-Z ]+) (.+)$");

//Create a map to store key-value pairs
		jsonMap3 = new HashMap<>();

//Split the input into lines
		String[] lines = Std_Details.split("\n");

//Process each line
		for (String line : lines) {
			// Matcher is used to search the pattern
			Matcher matcher = pattern.matcher(line);

			// If a match is found, extract key and value and put them in the map
			if (matcher.find()) {
				String key = matcher.group(1).trim();
				String value = matcher.group(2).trim();
				jsonMap3.put(key, value);
			}
		}

		JSONObject jsonObject = new JSONObject(jsonMap3);

		String jsonString = jsonObject.toString();

		System.out.println("JSON String of Principal Dashboard: " + jsonString);

	}

	public void VerifyTheRecordedDetailsOfTeacherInPrincipalDashboardWithSchoolAdmin() {

		System.out.println("Teacher_Details: " + jsonMap1);
		System.out.println("Teacher_Details: " + jsonMap3);

		for (Map.Entry<String, String> entry : jsonMap3.entrySet()) {
			String key = entry.getKey();
			String value1 = entry.getValue();

			if (jsonMap1.containsKey(key)) {
				String value2 = jsonMap1.get(key);
				// HighlightOutput("Key: " + key + ", Value in Map1: " + value1 + ", Value in
				// Map2: " + value2);
				// System.out.println("Key: " + key + ", Value in Map1: " + value1 + ", Value in
				// Map2: " + value2);
				HighlightOutput1("Key: ");
				System.out.println(key);
				HighlightOutput1("Value in Map1: ");
				System.out.println(value1);
				HighlightOutput1("Value in Map2: ");
				System.out.println(value2);
			}
		}

	}

}
