package com.pagemanager;

import com.pages.CreateNewStudentPage;
import com.pages.StudentInformationPage;
import com.pages.TeacherInformationPage;

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

}
