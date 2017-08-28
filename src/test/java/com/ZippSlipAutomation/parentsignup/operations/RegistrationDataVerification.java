package com.ZippSlipAutomation.parentsignup.operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.parentsignup.objectRepository.ParentProfileRepository;
import com.ZippSlipAutomation.parentsignup.objectRepository.ParentSignUpFlowRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.URLTypes;

public class RegistrationDataVerification {

	ParentSignUpFlowRepository parentSignUpFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			ParentSignUpFlowRepository.class);

	ParentProfileRepository parentProfileRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			ParentProfileRepository.class);

	CommonFunctions commonFunctions = new CommonFunctions();
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void directToParentProfilePage() throws Exception {

		commonFunctions.waitUntilElementDisplayed(parentProfileRepository.getUserNameButton().getElement());
		parentProfileRepository.getUserNameButton().getElement().click();
		Thread.sleep(2000);
		parentProfileRepository.getProfileButton().getElement().click();

		commonFunctions.switchDriverToNewWindow();
		commonFunctions.waitUntilElementDisplayed(parentProfileRepository.getMyProfilePageHeader().getElement());

		System.out.println("On the Parent Profile Page");
	}

	public void parentDataVerificationFunctionality() throws Exception {

		if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			excelReadEvent.readFromExcel(3, CommonVariables.rownumber);
		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			excelReadEvent.readFromExcel(6, CommonVariables.rownumber);
		}

		Thread.sleep(2000);

		String parentEmail = excelReadEvent.getParentEmail();
		String parentFirstName = excelReadEvent.getParentFirstName();
		String parentLastName = excelReadEvent.getParentLastName();

		try {
			WebElement oParentEmail = DriverInitiation.getDriver().findElement(
					By.xpath(".//*[contains(@id,'MainContent_txtEmail') and contains(@value,'" + parentEmail + "')]"));
			if (oParentEmail.isDisplayed()) {
				System.out.println("Parent Email ID is correct");
			}
		} catch (Exception e) {
			System.err.println("Parent Email ID is not correct");
		}

		try {
			WebElement oParentFirstName = DriverInitiation.getDriver().findElement(By.xpath(
					".//*[contains(@id,'MainContent_txtFirstName') and contains(@value,'" + parentFirstName + "')]"));
			if (oParentFirstName.isDisplayed()) {
				System.out.println("Parent First Name is correct");
			}
		} catch (Exception e) {
			System.err.println("Parent First Name is not correct");
		}

		try {
			WebElement oParentEmail = DriverInitiation.getDriver().findElement(By.xpath(
					".//*[contains(@id,'MainContent_txtLastName') and contains(@value,'" + parentLastName + "')]"));
			if (oParentEmail.isDisplayed()) {
				System.out.println("Parent Last Name is correct");
			}
		} catch (Exception e) {
			System.err.println("Parent Last Name is not correct");
		}

	}

	public void enrolledStudentDataVerificationFunctionality() throws Exception {

		if (CommonVariables.recipient == URLTypes.socialenglishparentsignup) {
			excelReadEvent.readFromExcel(4, CommonVariables.enrolledrownumber);
		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparentsignup) {
			excelReadEvent.readFromExcel(7, CommonVariables.enrolledrownumber);
		}

		if (checkForEnrolledStudentID()) {
			System.out.println("Enrolled Student ID is correct");
		} else {
			System.err.println("Enrolled Student ID is not correct");
		}

		if (checkForEnrolledStudentDOB()) {
			System.out.println("Enrolled Student DOB is correct");
		} else {
			System.err.println("Enrolled Student DOB is not correct");
		}

	}

	public void newAddedStudentDataVerificationFunctionality() throws Exception {

		excelReadEvent.readFromExcel(5, CommonVariables.rownumber);

		if (checkForNewStudentDOB()) {
			System.out.println("New Student DOB is correct");
		} else {
			System.err.println("New Student DOB is not correct");
		}

		boolean firstNameFound = false;
		List<WebElement> FirstNamesList = DriverInitiation.getDriver().findElements(By.id("lblChildFirstName"));
		for (WebElement singlerow : FirstNamesList) {
			if (singlerow.getText().contains(excelReadEvent.getNewStudentFirstName())) {
				firstNameFound = true;
				break;
			}
		}
		if (firstNameFound) {
			System.out.println("New Student First Name data is correct");
		} else {
			System.err.println("New Student First Name data is not correct");
		}

		boolean lastNameFound = false;
		List<WebElement> LastNamesList = DriverInitiation.getDriver().findElements(By.id("lblChildLastName"));
		for (WebElement singlerow : LastNamesList) {
			if (singlerow.getText().contains(excelReadEvent.getNewStudentLastName())) {
				lastNameFound = true;
				break;
			}
		}
		if (lastNameFound) {
			System.out.println("New Student Last Name data is correct");
		} else {
			System.err.println("New Student Last Name data is not correct");
		}

	}

	public boolean checkForEnrolledStudentID() {

		boolean enrolledStudentIdFound = false;
		String enrolledStudentIdAdded = excelReadEvent.getEnrolledStudentID();
		try {
			WebElement oEnrolledStudentIDAdded = DriverInitiation.getDriver().findElement(By.xpath(".//*[contains(@id,'txtChildStudentId_0') and contains(@value,'" + enrolledStudentIdAdded + "')]"));
			if (oEnrolledStudentIDAdded.isDisplayed()) {
				enrolledStudentIdFound = true;
			}
		} catch (Exception e) {
			System.out.println("Checking for enrolled student ID...");
		}

		try {
			WebElement oEnrolledStudentIDAdded = DriverInitiation.getDriver().findElement(By.xpath(".//*[contains(@id,'txtChildStudentId_1') and contains(@value,'" + enrolledStudentIdAdded + "')]"));
			if (oEnrolledStudentIDAdded.isDisplayed()) {
				enrolledStudentIdFound = true;
			}
		} catch (Exception e) {
			System.out.println("Checking for enrolled student ID...");
		}

		return enrolledStudentIdFound;
	}

	public boolean checkForEnrolledStudentDOB() {

		boolean enrolledStudentDOBFound = false;
		String enrolledStudentdob = excelReadEvent.getEnrolledStudentDOB();
		try {
			WebElement oEnrolledStudentDOB = DriverInitiation.getDriver().findElement(By.xpath(
					".//*[contains(@id,'txtChildDOB_0_txtDate_0') and contains(@value,'" + enrolledStudentdob + "')]"));
			if (oEnrolledStudentDOB.isDisplayed()) {
				enrolledStudentDOBFound = true;
			}
		} catch (Exception e) {
			System.out.println("Checking for enrolled student DOB...");
		}

		try {
			WebElement oEnrolledStudentDOB = DriverInitiation.getDriver().findElement(By.xpath(
					".//*[contains(@id,'txtChildDOB_1_txtDate_1') and contains(@value,'" + enrolledStudentdob + "')]"));
			if (oEnrolledStudentDOB.isDisplayed()) {
				enrolledStudentDOBFound = true;
			}
		} catch (Exception e) {
			System.out.println("Checking for enrolled student DOB...");
		}

		return enrolledStudentDOBFound;
	}

	public boolean checkForNewStudentDOB() {

		boolean newStudentDOBfound = false;
		String newStudentdob = excelReadEvent.getNewStudentDOB();
		try {
			WebElement oNewStudentDOB = DriverInitiation.getDriver().findElement(By.xpath(
					".//*[contains(@id,'txtChildDOB_0_txtDate_0') and contains(@value,'" + newStudentdob + "')]"));
			if (oNewStudentDOB.isDisplayed()) {
				newStudentDOBfound = true;
			}
		} catch (Exception e) {
			System.out.println("Checking for new added student DOB...");
		}

		try {
			WebElement oEnrolledStudentIDAdded = DriverInitiation.getDriver().findElement(By.xpath(
					".//*[contains(@id,'txtChildDOB_1_txtDate_1') and contains(@value,'" + newStudentdob + "')]"));
			if (oEnrolledStudentIDAdded.isDisplayed()) {
				newStudentDOBfound = true;
			}
		} catch (Exception e) {
			System.out.println("Checking for new added student DOB...");
		}

		return newStudentDOBfound;
	}

}
