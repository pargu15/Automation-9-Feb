package com.ZippSlipAutomation.admin.operations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.ZippSlipAutomation.admin.objectRepository.CreateZippGramPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import org.apache.log4j.Logger;

public class CreateZippGramActions {
	CommonFunctions commonFunctions = new CommonFunctions();
	Actions action = new Actions(DriverInitiation.getDriver());
	JavascriptExecutor jse = (JavascriptExecutor)DriverInitiation.getDriver();

	CreateZippGramPageRepository createZippGramPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			CreateZippGramPageRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();
	Logger logger = Logger.getLogger("devpinoyLogger"); // To generate the log file

	public void selectZippGram() throws Exception {

		//commonFunctions.waitUntilElementDisplayed(createZippGramPageRepository.getActivityDropDown().getElement());

		logger.debug("Test Case Started: Get_Title_of_Estimate_Details_Page");
		System.out.println("yes11");
		createZippGramPageRepository.getCreateZippGram().getElement().click();
		Thread.sleep(4000);

	}

	public void verifyZippGramNameIsMandatory() throws Exception {

		excelReadEvent.readFromExcel(1, CommonVariables.rownumber, ExcelTypes.Excel1);
		logger.debug("Clicking the Create Zippgram Link2");
		createZippGramPageRepository.getNextButton().getElement().click();
		Thread.sleep(2000);
		commonFunctions.verifyElementIsPresent(createZippGramPageRepository.getErrorMessageForZippGramname());
		logger.debug("Clicking the Create Zippgram Link3");
		createZippGramPageRepository.getZippGramName().getElement().sendKeys("ZippGram by Parag");
		//	createZippGramPageRepository.getZippGramName().getElement().sendKeys(excelReadEvent.getZippGramName());
		Thread.sleep(1000);
		createZippGramPageRepository.getParagraph().getElement().sendKeys("ZippGram by Parag");
		//	createZippGramPageRepository.getParagraph().getElement().sendKeys(excelReadEvent.getParagraph());
		Thread.sleep(2000);
	}

	public void addImageControl() throws Exception {

		action.doubleClick(createZippGramPageRepository.getImageControl().getElement()).build().perform();
		Thread.sleep(1000);
		createZippGramPageRepository.getuploadImageBtn().getElement().click();
		String Filepath = System.getProperty("user.dir") + "\\src\\resource\\ImageForUpload.png";
		CommonFunctions.uploadFile(Filepath);
		Thread.sleep(7000);
	}

	public void addVideoControl() throws Exception {

		action.doubleClick(createZippGramPageRepository.getVideoControl().getElement()).build().perform();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,250)", "");
		createZippGramPageRepository.getAddVideo().getElement().click();
		Thread.sleep(1000);
		createZippGramPageRepository.getVideoPath().getElement().sendKeys("https://www.youtube.com/watch?v=ij_0p_6qTss");
		Thread.sleep(1000);
		createZippGramPageRepository.getVideoPathAddBtn().getElement().click();
		Thread.sleep(1000);
	}

	public void addPollControl() throws Exception {


		action.doubleClick(createZippGramPageRepository.getPollControl().getElement()).build().perform();
		Thread.sleep(2000);
		createZippGramPageRepository.getAddPoll().getElement().click();
		createZippGramPageRepository.getSubmitPollQues().getElement().click();

		commonFunctions.verifyElementIsPresent(createZippGramPageRepository.getErrorForAddPollQues());
		commonFunctions.verifyElementIsPresent(createZippGramPageRepository.getErrorForAddPollOptn());

		createZippGramPageRepository.getAddPollQues().getElement().sendKeys("Poll Question");

		createZippGramPageRepository.getAddPollOptn().getElement().sendKeys("Option 1");
		createZippGramPageRepository.getAddPollOptnBtn().getElement().click();

		createZippGramPageRepository.getAddPollOptn().getElement().sendKeys("Option 2");
		createZippGramPageRepository.getAddPollOptnBtn().getElement().click();

		createZippGramPageRepository.getSubmitPollQues().getElement().click();
		Thread.sleep(1000);

	}

	public void directToCommunicationPage() throws InterruptedException {

		createZippGramPageRepository.getNextButton().getElement().click();
		Thread.sleep(4000);

	}


}
