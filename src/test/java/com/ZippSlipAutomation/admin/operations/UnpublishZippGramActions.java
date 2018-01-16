package com.ZippSlipAutomation.admin.operations;


import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.CreateZippGramPageRepository;
import com.ZippSlipAutomation.admin.objectRepository.EventPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

public class UnpublishZippGramActions {

	CommonFunctions commonFunctions = new CommonFunctions();
	CreateZippGramPageRepository createZippGramPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),CreateZippGramPageRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();

	public void selectPublishedZippGram() throws Exception {

		commonFunctions.waitUntilElementDisplayed(createZippGramPageRepository.getParentActivitiesDropdown().getElement());

		commonFunctions.hoverOverElement(createZippGramPageRepository.getParentActivitiesDropdown().getElement());
		createZippGramPageRepository.getZippGramFieldInDropdown().getElement().click();

		/*WebElement element = DriverInitiation.getDriver().findElement(By.className("AspNet-Menu-Link"));
		JavascriptExecutor executor = (JavascriptExecutor)DriverInitiation.getDriver();
		executor.executeScript("arguments[0].click();", element);*/

		Thread.sleep(3000);
		commonFunctions.clickOnZippGram();	

	}

	public void unpublishZippGram() throws Exception {

		commonFunctions.waitUntilElementDisplayed(createZippGramPageRepository.getZippGramCurrentStatus().getElement());

		createZippGramPageRepository.getZippGramCurrentStatus().getElement().click();
		Thread.sleep(2000);
		createZippGramPageRepository.getChangeZippGramPublishStatus().getElement().click();
		Thread.sleep(3000);
		createZippGramPageRepository.getClickOnConfirmToUnpublish().getElement().click();
		Thread.sleep(5000);

	}

}
