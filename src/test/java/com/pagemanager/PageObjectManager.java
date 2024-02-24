package com.pagemanager;

import com.pages.CreateNewStudentPage;
import com.pages.FeeManagementPage;
import com.pages.ManageTransportPage;
import com.pages.SchoolOnboardPage;
import com.pages.StudentInformationPage;
import com.pages.TeacherInformationPage;
import com.pages.TimetableConfigurationPage;

public class PageObjectManager {

	private StudentInformationPage studentInformationPage;

	public StudentInformationPage getStudentInformationPage() {
		return (studentInformationPage == null) ? studentInformationPage = new StudentInformationPage()
				: studentInformationPage;
	}

	private TeacherInformationPage teacherInformationPage;

	public TeacherInformationPage getTeacherInformationPage() {
		return (teacherInformationPage == null) ? teacherInformationPage = new TeacherInformationPage()
				: teacherInformationPage;
	}

	private CreateNewStudentPage createNewStudentPage;

	public CreateNewStudentPage getCreateNewStudentPage() {
		return (createNewStudentPage == null) ? createNewStudentPage = new CreateNewStudentPage()
				: createNewStudentPage;
	}

	private SchoolOnboardPage schoolOnboardPage;

	public SchoolOnboardPage getSchoolOnboardPage() {
		return (schoolOnboardPage == null) ? schoolOnboardPage = new SchoolOnboardPage() : schoolOnboardPage;
	}

	private TimetableConfigurationPage timetableConfigurationPage;

	public TimetableConfigurationPage getTimetableConfigurationPage() {
		return (timetableConfigurationPage == null) ? timetableConfigurationPage = new TimetableConfigurationPage()
				: timetableConfigurationPage;
	}

	private FeeManagementPage feeManagementPage;

	public FeeManagementPage getFeeManagementPage() {
		return (feeManagementPage == null) ? feeManagementPage = new FeeManagementPage() : feeManagementPage;
	}

	private ManageTransportPage manageTransportPage;

	public ManageTransportPage getManageTransportPage() {
		return (manageTransportPage == null) ? manageTransportPage = new ManageTransportPage() : manageTransportPage;
	}

}
