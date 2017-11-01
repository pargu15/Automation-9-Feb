package com.ZippSlipAutomation.utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ZippSlipAutomation.admin.objectRepository.EventPageRepository;
import com.ZippSlipAutomation.parent.objectRepository.EventConsentFlowRepository;
import com.ZippSlipAutomation.parent.objectRepository.EventFormDataEntryRepository;
import com.ZippSlipAutomation.parent.objectRepository.ProdEventFormDataVerifyRepository;
import com.ZippSlipAutomation.parent.objectRepository.SocialEventFormDataVerifyRepository;

public class CommonFunctions {

	EventPageRepository eventPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			EventPageRepository.class);

	EventConsentFlowRepository eventConsentFlowRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			EventConsentFlowRepository.class);

	EventFormDataEntryRepository EventFormDataEntryRepository = PageFactory
			.initElements(DriverInitiation.getDriver(), EventFormDataEntryRepository.class);

	SocialEventFormDataVerifyRepository socialEventFormDataVerifyRepository = PageFactory
			.initElements(DriverInitiation.getDriver(), SocialEventFormDataVerifyRepository.class);

	ProdEventFormDataVerifyRepository prodEventFormDataVerifyRepository = PageFactory
			.initElements(DriverInitiation.getDriver(), ProdEventFormDataVerifyRepository.class);

	// Check for the confirmation modal window correct on the Event page.
	public void checkForModalWindow() {

		if (DriverInitiation.getDriver().findElement(By.id("MainContent_btnOkconfirm")) != null
				&& DriverInitiation.getDriver().findElement(By.id("MainContent_btnOkconfirm")).isDisplayed()) {
			eventPageRepository.getButtonOkConfirm().getElement().click();
		}

	}

	// Responding Yes to the Event having form attached in it
	public void respondYesForFormEvent() throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcel(1, CommonVariables.rownumber);

		waitUntilElementDisplayed(eventConsentFlowRepository.getBackButton().getElement());
		try {
			eventConsentFlowRepository.getRespondYesButton().getElement().click();
			Thread.sleep(5000);

			eventConsentFlowRepository.getOkConfirmAfterYesResponse().getElement().click();
			Thread.sleep(10000);
		}

		catch (Exception e) {
			eventConsentFlowRepository.getRespondYesForFormEvent().getElement().click();
			Thread.sleep(10000);
		}

		List<WebElement> Questions = DriverInitiation.getDriver()
				.findElements(By.xpath("//*[contains(@id,'_lblQuestionText')]"));

		System.out.println("Questions present in the form are: ");

		for (WebElement singlerow : Questions) {
			System.out.println(singlerow.getText());
		}

		if (CommonVariables.recipient == URLTypes.socialenglishparent) {

			excelReadEvent.readFromExcel(2, CommonVariables.rownumber);

			if (excelReadEvent.getEventName().contains("Event For Automation With A Form In Which Data Is Blank")) {

				eventConsentFlowRepository.getSaveNNextButton().getElement().click();
				Thread.sleep(3000);

				if (checkForErrorMessage()) {

					EventFormDataEntryRepository.getTextQuestion().getElement()
							.sendKeys(excelReadEvent.getTextQuestion());
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getSingleSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getMultiSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					selectFromDropDown(EventFormDataEntryRepository.getDropDownQuestion().getElement(), 1);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();
					
					EventFormDataEntryRepository.getPhoneQuestion().getElement()
							.sendKeys(excelReadEvent.getPhoneNumber());
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getDateQuestion().getElement()
							.sendKeys(excelReadEvent.getDateQuestion());
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getEmailQuestion().getElement()
							.sendKeys(excelReadEvent.getEmailQuestion());
					Thread.sleep(1000);
				
					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getFirstNameQuestion().getElement()
							.sendKeys(excelReadEvent.getFirstNameQuestion());
					Thread.sleep(1000);

					EventFormDataEntryRepository.getLastNameQuestion().getElement()
							.sendKeys(excelReadEvent.getLastNameQuestion());
					Thread.sleep(1000);
					
					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();
					
					EventFormDataEntryRepository.getStreetNumberQuestion().getElement()
					.sendKeys(excelReadEvent.getStreetNumberQuestion());
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getMailingAddressQuestion().getElement()
							.sendKeys(excelReadEvent.getMailingAddressQuestion());
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getStreetTypeQuestion().getElement()
							.sendKeys(excelReadEvent.getStreetTypeQuestion());
					Thread.sleep(2000);
					
					selectFromDropDown(EventFormDataEntryRepository.getStreetDirectionQuestion().getElement(), 4);
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getMailingAddressApartmentQuestion().getElement()
							.sendKeys(excelReadEvent.getMailingAddressApartmentQuestion());
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getCityTownQuestion().getElement()
							.sendKeys(excelReadEvent.getCityTownQuestion());
					Thread.sleep(1000);
		
					selectFromDropDown(EventFormDataEntryRepository.getAddressStatesQuestion().getElement(), 8);
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getZippCodeQuestion().getElement()
							.sendKeys(excelReadEvent.getZippCodeQuestion());
					Thread.sleep(1000);
				}

			} else if (excelReadEvent.getEventName()
					.contains("Event For Automation With A Form Which Have All Data Prefilled")) {

				verifyElementIsPresent(socialEventFormDataVerifyRepository.getTextQuestionCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getSingleSelectAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getPhoneAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getDateAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getEMailAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getFirstNameCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getLastNameCheckPrefilled());

				if (socialEventFormDataVerifyRepository.getDropDownAnsCheckPrefilled().getElement().getText()
						.contains("Male")) {
					System.out.println("Drop down data is correct");
				} else {
					System.err.println("Drop down data is not correct");
				}

			}

			else {
				System.err.println("Form specified is not present");

			}

		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparent) {

			excelReadEvent.readFromExcel(2, CommonVariables.rownumber);

			if (excelReadEvent.getEventName().contains("Event For Automation With A Form In Which Data Is Blank")) {

				eventConsentFlowRepository.getSaveNNextButton().getElement().click();
				Thread.sleep(3000);

				if (checkForErrorMessage()) {

					EventFormDataEntryRepository.getTextQuestion().getElement()
							.sendKeys(excelReadEvent.getTextQuestion());
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getSingleSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getMultiSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					selectFromDropDown(EventFormDataEntryRepository.getDropDownQuestion().getElement(), 1);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();
					
					EventFormDataEntryRepository.getPhoneQuestion().getElement()
							.sendKeys(excelReadEvent.getPhoneNumber());
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getDateQuestion().getElement()
							.sendKeys(excelReadEvent.getDateQuestion());
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getEmailQuestion().getElement()
							.sendKeys(excelReadEvent.getEmailQuestion());
					Thread.sleep(1000);

					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();

					EventFormDataEntryRepository.getFirstNameQuestion().getElement()
							.sendKeys(excelReadEvent.getFirstNameQuestion());
					Thread.sleep(1000);

					EventFormDataEntryRepository.getLastNameQuestion().getElement()
							.sendKeys(excelReadEvent.getLastNameQuestion());
					Thread.sleep(1000);
					
					eventConsentFlowRepository.getSaveNNextButton().getElement().click();
					Thread.sleep(2000);
					displayErrorMessage();
					
					EventFormDataEntryRepository.getStreetNumberQuestion().getElement()
					.sendKeys(excelReadEvent.getStreetNumberQuestion());
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getMailingAddressQuestion().getElement()
							.sendKeys(excelReadEvent.getMailingAddressQuestion());
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getStreetTypeQuestion().getElement()
							.sendKeys(excelReadEvent.getStreetTypeQuestion());
					Thread.sleep(2000);
					
					selectFromDropDown(EventFormDataEntryRepository.getStreetDirectionQuestion().getElement(), 4);
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getMailingAddressApartmentQuestion().getElement()
							.sendKeys(excelReadEvent.getMailingAddressApartmentQuestion());
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getCityTownQuestion().getElement()
							.sendKeys(excelReadEvent.getCityTownQuestion());
					Thread.sleep(1000);
		
					selectFromDropDown(EventFormDataEntryRepository.getAddressStatesQuestion().getElement(), 8);
					Thread.sleep(1000);
					
					EventFormDataEntryRepository.getZippCodeQuestion().getElement()
							.sendKeys(excelReadEvent.getZippCodeQuestion());
					Thread.sleep(1000);
					
					
					
				}

			} else if (excelReadEvent.getEventName()
					.contains("Event For Automation With A Form Which Have All Data Prefilled")) {

				verifyElementIsPresent(prodEventFormDataVerifyRepository.getTextQuestionCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getSingleSelectAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getPhoneAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getDateAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getEMailAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getFirstNameCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getLastNameCheckPrefilled());

				if (prodEventFormDataVerifyRepository.getDropDownAnsCheckPrefilled().getElement().getText()
						.contains("None")) {
					System.out.println("Drop down data is correct");
				} else {
					System.err.println("Drop down data is not correct");
				}
			}

			else {
				System.err.println("Form specified is not present");

			}

		}

		eventConsentFlowRepository.getSaveNNextButton().getElement().click();
		Thread.sleep(15000);

		eventConsentFlowRepository.getZippNoteTextBox().getElement().sendKeys("Testing note");
		Thread.sleep(2000);

		try {
			eventConsentFlowRepository.getAcceptNPay().getElement().click();
			Thread.sleep(6000);
		} catch (Exception e) {
			eventConsentFlowRepository.getSubmitFormsButton().getElement().click();
			Thread.sleep(2000);
		}

		try {
			waitUntilElementDisplayed(eventConsentFlowRepository.getDontShowMessageButton().getElement());
			eventConsentFlowRepository.getDontShowMessageButton().getElement().click();
			Thread.sleep(2000);
			eventConsentFlowRepository.getFinalOkButton().getElement().click();
			Thread.sleep(3000);
			System.out.println("Moving to verification part....");
		} catch (Exception e) {
			System.out.println("Moving to verification part....");
		}
	}

	//Test
	
	public void respondYesForFormEventforProductionData(String childname) throws Exception {

		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcel(1, CommonVariables.rownumber);

		waitUntilElementDisplayed(eventConsentFlowRepository.getBackButton().getElement());
		try {
			eventConsentFlowRepository.getRespondYesButton().getElement().click();
			Thread.sleep(5000);

			eventConsentFlowRepository.getOkConfirmAfterYesResponse().getElement().click();
			Thread.sleep(10000);
		}

		catch (Exception e) {
			eventConsentFlowRepository.getRespondYesForFormEvent().getElement().click();
			Thread.sleep(10000);
		}

		List<WebElement> Questions = DriverInitiation.getDriver()
				.findElements(By.xpath("//*[contains(@id,'_lblQuestionText')]"));

		System.out.println("Questions present in the form are: ");

		for (WebElement singlerow : Questions) {
			System.out.println(singlerow.getText());
		}

		if (CommonVariables.recipient == URLTypes.socialenglishparent) {

			excelReadEvent.readFromExcel(2, CommonVariables.rownumber);

			if (excelReadEvent.getEventName().contains("Event For Automation With A Form In Which Data Is Blank")) {

				eventConsentFlowRepository.getSaveNNextButton().getElement().click();
				Thread.sleep(3000);

				if (checkForErrorMessage()) {

					EventFormDataEntryRepository.getTextQuestion().getElement()
							.sendKeys(childname);
					Thread.sleep(1000);

					EventFormDataEntryRepository.getSingleSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					EventFormDataEntryRepository.getMultiSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					selectFromDropDown(EventFormDataEntryRepository.getDropDownQuestion().getElement(), 1);

					EventFormDataEntryRepository.getPhoneQuestion().getElement()
							.sendKeys(excelReadEvent.getPhoneNumber());
					Thread.sleep(1000);

					EventFormDataEntryRepository.getDateQuestion().getElement()
							.sendKeys(excelReadEvent.getDateQuestion());
					Thread.sleep(1000);

					EventFormDataEntryRepository.getEmailQuestion().getElement()
							.sendKeys(excelReadEvent.getEmailQuestion());
					Thread.sleep(1000);

					EventFormDataEntryRepository.getFirstNameQuestion().getElement()
							.sendKeys(childname);
					Thread.sleep(1000);

					EventFormDataEntryRepository.getLastNameQuestion().getElement()
							.sendKeys(excelReadEvent.getLastNameQuestion());
					Thread.sleep(1000);

				}

			} else if (excelReadEvent.getEventName()
					.contains("Event For Automation With A Form Which Have All Data Prefilled")) {

				verifyElementIsPresent(socialEventFormDataVerifyRepository.getTextQuestionCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getSingleSelectAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getPhoneAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getDateAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getEMailAnsCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getFirstNameCheckPrefilled());
				verifyElementIsPresent(socialEventFormDataVerifyRepository.getLastNameCheckPrefilled());

				if (socialEventFormDataVerifyRepository.getDropDownAnsCheckPrefilled().getElement().getText()
						.contains("Male")) {
					System.out.println("Drop down data is correct");
				} else {
					System.err.println("Drop down data is not correct");
				}

			}

			else {
				System.err.println("Form specified is not present");

			}

		}

		else if (CommonVariables.recipient == URLTypes.prodenglishparent) {

			excelReadEvent.readFromExcel(2, CommonVariables.rownumber);

			if (excelReadEvent.getEventName().contains("Event For Automation With A Form In Which Data Is Blank")) {

				eventConsentFlowRepository.getSaveNNextButton().getElement().click();
				Thread.sleep(3000);

				if (checkForErrorMessage()) {

					EventFormDataEntryRepository.getTextQuestion().getElement()
							.sendKeys(childname);
					Thread.sleep(1000);

					EventFormDataEntryRepository.getSingleSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					EventFormDataEntryRepository.getMultiSelectOptionOne().getElement().click();
					Thread.sleep(1000);

					selectFromDropDown(EventFormDataEntryRepository.getDropDownQuestion().getElement(), 1);

					EventFormDataEntryRepository.getPhoneQuestion().getElement()
							.sendKeys(excelReadEvent.getPhoneNumber());
					Thread.sleep(1000);

					EventFormDataEntryRepository.getDateQuestion().getElement()
							.sendKeys(excelReadEvent.getDateQuestion());
					Thread.sleep(1000);


					EventFormDataEntryRepository.getEmailQuestion().getElement()
							.sendKeys(excelReadEvent.getEmailQuestion());
					Thread.sleep(1000);

					EventFormDataEntryRepository.getFirstNameQuestion().getElement()
							.sendKeys(childname);
					Thread.sleep(1000);

					EventFormDataEntryRepository.getLastNameQuestion().getElement()
							.sendKeys(excelReadEvent.getLastNameQuestion());
					Thread.sleep(1000);

				}

			} else if (excelReadEvent.getEventName()
					.contains("Event For Automation With A Form Which Have All Data Prefilled")) {

				verifyElementIsPresent(prodEventFormDataVerifyRepository.getTextQuestionCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getSingleSelectAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getPhoneAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getDateAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getEMailAnsCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getFirstNameCheckPrefilled());
				verifyElementIsPresent(prodEventFormDataVerifyRepository.getLastNameCheckPrefilled());

				if (prodEventFormDataVerifyRepository.getDropDownAnsCheckPrefilled().getElement().getText()
						.contains("None")) {
					System.out.println("Drop down data is correct");
				} else {
					System.err.println("Drop down data is not correct");
				}
			}

			else {
				System.err.println("Form specified is not present");

			}

		}

		eventConsentFlowRepository.getSaveNNextButton().getElement().click();
		Thread.sleep(15000);

	//	eventConsentFlowRepository.getZippNoteTextBox().getElement().sendKeys("Testing note");
		Thread.sleep(2000);

		try {
			eventConsentFlowRepository.getAcceptNPay().getElement().click();
			Thread.sleep(6000);
		} catch (Exception e) {
			eventConsentFlowRepository.getSubmitFormsButton().getElement().click();
			Thread.sleep(2000);
		}

		try {
			
			waitUntilElementDisplayed(eventConsentFlowRepository.getDontShowMessageButton().getElement());
			eventConsentFlowRepository.getDontShowMessageButton().getElement().click();
			Thread.sleep(2000);
			eventConsentFlowRepository.getFinalOkButton().getElement().click();
			Thread.sleep(3000);
			System.out.println("Moving to verification part....");
		} catch (Exception e) {
			System.out.println("Moving to verification part....");
		}
	}
	
	// Click on the event correct
	public void clickOnEvent() throws Exception {
		Thread.sleep(5000);
		boolean eventcorrect = false;
		do {
			if (checkEventOnPage()) {
				eventcorrect = true;
				Thread.sleep(15000);
			} else {
				eventConsentFlowRepository.getNextButton().getElement().click();
				Thread.sleep(15000);
			}
		} while (!eventcorrect);
	}
	
	// Overloaded function Click on the event correct
		public void clickOnEvent(String childname) throws Exception {
			Thread.sleep(5000);
			boolean eventcorrect = false;
			do {
				if (checkEventOnPage(childname)) {
					eventcorrect = true;
					Thread.sleep(15000);
				} else {
					eventConsentFlowRepository.getNextButton().getElement().click();
					Thread.sleep(15000);
				}
			} while (!eventcorrect);
		}

	// To verify if the element is present on the page or not
	public void verifyElementIsPresent(ReturnElement object) {
		try {
			if (object.getElement().isDisplayed()) {
				System.out.println(("Element (" + object.getName() + ") is present"));
			}
		} catch (NoSuchElementException e) {
			System.err.println(("Element (" + object.getName() + ") is not present"));
		} catch (Exception e) {
			System.err.println(("Element (" + object.getName() + ") is not present"));
		}
	}

	// Check if the event is correct on the page
	public boolean checkEventOnPage() throws Exception {
		Thread.sleep(2000);
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcel(1, CommonVariables.rownumber);
		String eventname = excelReadEvent.getEventName();

		boolean eventdisplay = false;
		List<WebElement> MobileDevices = DriverInitiation.getDriver().findElements(By.id("hlEventName"));

		for (WebElement singlerow : MobileDevices) {
			if (singlerow.getText().contains(eventname)) {
				eventdisplay = true;
				System.out.println("Event is present");
				WebElement oClickonEvent = DriverInitiation.getDriver()
						.findElement(By.xpath("//a[@id='hlEventName' and text()='" + eventname + "']"));
				oClickonEvent.click();
				break;
			}
		}
		return eventdisplay;
	}
	
	// Overloaded function to Check if the event is correct on the page
		public boolean checkEventOnPage(String childname) throws Exception {
			Thread.sleep(2000);
			ExcelReadEvent excelReadEvent = new ExcelReadEvent();
			excelReadEvent.readFromExcel(1, CommonVariables.rownumber);
			String eventname = excelReadEvent.getEventName();
			
			boolean eventdisplay = false;
			List<WebElement> MobileDevices = DriverInitiation.getDriver().findElements(By.id("hlEventName"));

			for (WebElement singlerow : MobileDevices) {
				
				if (singlerow.getText().contains(eventname)) {
					eventdisplay = true;
					System.out.println("Event is present");
					WebElement oClickonEvent = DriverInitiation.getDriver()
							.findElement(By.xpath(".//a[@id='hlEventName' and text()='" + eventname + "']/parent::*/parent::*/following-sibling::td[1]/a[@id='anchor' and text()='" + childname + "']/parent::*/preceding-sibling::td[1]//a[@id='hlEventName']"));
					oClickonEvent.click();
					break;
				}
			}
			return eventdisplay;
		}
	
	
	// Reading from excel and return the value on the basis of a key
	public String readExcel(String sheetName, String searchedString) {

		String valueReceived = null;
		File file = new File(System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls");
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		HSSFSheet sh = wb.getSheet(sheetName);

		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount + 1; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				row.getCell(j).setCellType(CellType.STRING);
				if ((row.getCell(j).getStringCellValue().equals(searchedString)))
					valueReceived = row.getCell(++j).getStringCellValue();
				break;
			}

		}
		return valueReceived;
	}

	
	// Reading from excel and returning a string of values by checking the String Name
	public String[] readExcelMultiValue(String sheetName, String searchedString) {

		String firstValueReceived = null;
		String secondValueReceived = null;
		
		File file = new File(System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls");
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		HSSFSheet sh = wb.getSheet(sheetName);

		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		
		String[] singlerow = new String[2];
		
		// Create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount + 1; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				row.getCell(j).setCellType(CellType.STRING);
				if ((row.getCell(j).getStringCellValue().equals(searchedString))){
					firstValueReceived = row.getCell(j+1).getStringCellValue();
					secondValueReceived = row.getCell(j+2).getStringCellValue();
					singlerow[0]=firstValueReceived;
					singlerow[1]=secondValueReceived;
					break;
			}

		}

	}
	return (singlerow);

	}
	
	//Writing into an excel
	public void writeExcel(String sheetName, String searchedString, String value) {

		File file = new File(System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls");
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(fs);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		HSSFSheet sh = wb.getSheet(sheetName);

		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();

		for (int i = 0; i < rowCount + 1; i++) {
			Row row = sh.getRow(i);
			// Create a loop through the cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {
				// Get to exact cell in excel data
				if ((row.getCell(j).getStringCellValue().equals(searchedString))) {
					org.apache.poi.ss.usermodel.Cell cell = row.createCell(++j);
					cell.setCellValue(value);
				}

			}

		}

		try {
			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(file);
			wb.write(out);
			out.close();
			System.out.println("Excel file written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// Hover over an element
	public void hoverOverElement(WebElement element) {
		Actions action = new Actions(DriverInitiation.getDriver());
		action.moveToElement(element).perform();
	}

	// Double click on an element
	public void doubleClickOnElement(WebElement element) {
		Actions action = new Actions(DriverInitiation.getDriver());
		action.doubleClick(element).perform();
	}

	// Check if the error message is displayed on the page or not
	public boolean checkForErrorMessage() {
		boolean error;
		try {
			System.out.println("Error message displayed is: "
					+ EventFormDataEntryRepository.getErrorMessage().getElement().getText());
			error = true;
			return error;
		} catch (Exception e) {
			error = false;
			System.err.println("Error message not displayed");
			return error;
		}
	}

	// To display the error message shown on the page
	public void displayErrorMessage() {

		try {
			System.out.println("Error message displayed is: "
					+ EventFormDataEntryRepository.getErrorMessage().getElement().getText());
		} catch (Exception e) {
			System.err.println("Error message not displayed");

		}
	}

	// To select from a dropdown
	public void selectFromDropDown(WebElement element, int index) {
		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);
	}

	// To switch the driver to a new window
	public void switchDriverToNewWindow() {
		for (String winHandle : DriverInitiation.getDriver().getWindowHandles()) {
			DriverInitiation.getDriver().switchTo().window(winHandle);
		}
	}

	private final int TIMEOUT = 10;
	// Implicit wait function

	public void waitUntilElementDisplayed(final WebElement webElement) {
		DriverInitiation.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(DriverInitiation.getDriver(), TIMEOUT);
		ExpectedCondition elementIsDisplayed = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver arg0) {
				try {
					webElement.isDisplayed();
					return true;
				} catch (NoSuchElementException e) {
					return false;
				} catch (StaleElementReferenceException f) {
					return false;
				}
			}
		};
		wait.until(elementIsDisplayed);
		DriverInitiation.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	//Upload file Functionality
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	public static void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
    }
	
	/*
	 * // Takes Screenshot public void takeScreenshot(String path) throws
	 * IOException { File scrFile = ((TakesScreenshot)
	 * DriverInitiation.getDriver()).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(scrFile, new File(path));
	 * 
	 * }
	 */

}
