package com.ZippSlipAutomation.admin.operations;


import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.EventPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

public class UnpublishActivityActions {

	CommonFunctions commonFunctions = new CommonFunctions();
	EventPageRepository eventPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),EventPageRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();
	
	public void selectPublishedEvent() throws Exception {

		commonFunctions.waitUntilElementDisplayed(eventPageRepository.getParentActivitiesDropdown().getElement());
		
		commonFunctions.hoverOverElement(eventPageRepository.getParentActivitiesDropdown().getElement());
		eventPageRepository.getEventFieldInDropdown().getElement().click();
		
		/*WebElement element = DriverInitiation.getDriver().findElement(By.className("AspNet-Menu-Link"));
		JavascriptExecutor executor = (JavascriptExecutor)DriverInitiation.getDriver();
		executor.executeScript("arguments[0].click();", element);*/

		Thread.sleep(3000);
		commonFunctions.clickOnEvent();
	}

	public void unpublishEvent() throws Exception {

		commonFunctions.waitUntilElementDisplayed(eventPageRepository.getEventCurrentStatus().getElement());

		eventPageRepository.getEventCurrentStatus().getElement().click();
		Thread.sleep(2000);
		eventPageRepository.getChangeEventPublishStatus().getElement().click();
		Thread.sleep(3000);
		eventPageRepository.getClickOnConfirmToUnpublish().getElement().click();
		Thread.sleep(5000);

	}

}
