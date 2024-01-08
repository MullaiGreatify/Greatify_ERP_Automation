package com.pagemanager;

import com.pages.CreateNewStudentPage;
import com.pages.StudentInformationPage;

public class PageObjectManager {

	private StudentInformationPage studentInformationPage;

	public StudentInformationPage getStudentInformationPage() {
		return (studentInformationPage == null) ? studentInformationPage = new StudentInformationPage()
				: studentInformationPage;
	}

	private CreateNewStudentPage createNewStudentPage;

	public CreateNewStudentPage getCreateNewStudentPage() {
		return (createNewStudentPage == null) ? createNewStudentPage = new CreateNewStudentPage()
				: createNewStudentPage;
	}

}
