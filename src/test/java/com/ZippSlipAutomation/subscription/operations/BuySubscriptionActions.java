package com.ZippSlipAutomation.subscription.operations;

import com.ZippSlipAutomation.utilities.DatabaseConnection;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.CreateZippGramPageRepository;
import com.ZippSlipAutomation.subscription.objectRepository.BuySubscriptionObjectRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelTypes;
import com.ZippSlipAutomation.utilities.ExcelWrite;
import com.ZippSlipAutomation.utilities.URLTypes;

	public class BuySubscriptionActions {

		Actions action = new Actions(DriverInitiation.getDriver());
		JavascriptExecutor jse = (JavascriptExecutor)DriverInitiation.getDriver();
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		Logger logger = Logger.getLogger("devpinoyLogger"); // To generate the log file

		BuySubscriptionObjectRepository buySubscriptionObjectRepository = PageFactory.initElements(DriverInitiation.getDriver(),
				BuySubscriptionObjectRepository.class);
		CreateZippGramPageRepository createZippGramPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
				CreateZippGramPageRepository.class);
		CommonFunctions commonFunctions = new CommonFunctions();
		DatabaseConnection databaseConnection = new DatabaseConnection();
		ExcelWrite excelWrite = new ExcelWrite();
		public void buyFlyerFunctionality() throws Exception{
			
			buySubscriptionObjectRepository.getStartFlyerButton().getElement().click();
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getZippCode().getElement());
			
			buySubscriptionObjectRepository.getZippCode().getElement().sendKeys("11111");
			Thread.sleep(1000);
			
			buySubscriptionObjectRepository.getInstitution().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getInstitution().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getSelectInstitutionFromDropdown().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getContinueButton().getElement().click();
			Thread.sleep(1000);
			
		}
		
		public void registerNewTeacherFunctionality() throws Exception {

			ExcelReadEvent excelReadEvent = new ExcelReadEvent();

			if (CommonVariables.recipient == URLTypes.socialenglishSubscription) {
				excelReadEvent.readFromExcel(3, CommonVariables.rownumber, ExcelTypes.Excel1);
			}

			else if (CommonVariables.recipient == URLTypes.prodenglishSubscription) {
				excelReadEvent.readFromExcel(6, CommonVariables.rownumber, ExcelTypes.Excel1);
			}

		
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getEmail().getElement());

			
			buySubscriptionObjectRepository.getEmail().getElement().sendKeys(excelReadEvent.getParentEmail());
			Thread.sleep(1000);
			
			buySubscriptionObjectRepository.getMobile().getElement().sendKeys(excelReadEvent.getParentMobileNumber());
			Thread.sleep(1000);

			buySubscriptionObjectRepository.getPassword().getElement().sendKeys(excelReadEvent.getParentPassword());
			Thread.sleep(1000);

			buySubscriptionObjectRepository.getSubmitButton().getElement().click();

		}
		

		

		public void enterOTPFunctionality() throws Exception {
			String OTP =	databaseConnection.getOTP();
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getOtp().getElement());
		
			buySubscriptionObjectRepository.getOtp().getElement().sendKeys(OTP);
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getVerifyOtp().getElement().click();
			Thread.sleep(1000);
			
		}
		
		public void autoLoginFunctionality() throws Exception {
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getLoginButton().getElement());
			buySubscriptionObjectRepository.getLoginButton().getElement().click();
			
			System.out.println("Subscription Completed");
			
		if (CommonVariables.recipient == URLTypes.socialenglishSubscription) {
			excelWrite.writeresultinexcel(3, 8, CommonVariables.rownumber, "Data Used");
		}

		else if (CommonVariables.recipient == URLTypes.prodenglishSubscription) {
			excelWrite.writeresultinexcel(6, 8, CommonVariables.rownumber, "Data Used");
		}
	
				
	}
		
		public void AddClassroom() throws Exception {
			
			buySubscriptionObjectRepository.getAddClassButton().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getClassName().getElement().sendKeys("New Class");
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getGradeDropdown().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getSelectGrade().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getCreateClass().getElement().click();
			Thread.sleep(3000);
			
		}
		
		public void InviteParent() throws Exception {
			buySubscriptionObjectRepository.getInviteParentStep().getElement().click();
			Thread.sleep(1000);
		//	commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getInviteParentButton().getElement());
			buySubscriptionObjectRepository.getInviteParentButton().getElement().click();
			Thread.sleep(2000);
		//	formCreationPageRepository.getNewFormName().getElement().sendKeys(excelReadEvent.getFormName() + " " + dtf.format(localDate));
			buySubscriptionObjectRepository.getParentEmail().getElement().sendKeys("Test@yopmail.com");
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getSendInvite().getElement().click();
			Thread.sleep(1000);
					
		}

		public void SendZippGramWindow() throws Exception {
			buySubscriptionObjectRepository.getCreateZippGramStep().getElement().click();
		//	commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getCreateZippGram().getElement());
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getCreateZippGram().getElement().click();
			Thread.sleep(5000);
			
		}
		public void SendZippGram() throws Exception {
			
			buySubscriptionObjectRepository.getSendZippGramButton().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getDoNotNotify().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getConfirmPublishUnpublish().getElement().click();
			Thread.sleep(1000);
			
			
		}
		
		public void SendZippMessage() throws Exception {
			buySubscriptionObjectRepository.getCreateZippMessageStep().getElement().click();
		//	commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getCreateoCreateZippMessage().getElement());
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getCreateoCreateZippMessage().getElement().click();
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getZippMessageTitle().getElement().sendKeys("Zipp Message Title");
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getZippMessageText().getElement().sendKeys("Test Message");
			Thread.sleep(2000);
			//buySubscriptionObjectRepository.getZippMessageEmailText().getElement().sendKeys("Email text");
			//Thread.sleep(1000);
			buySubscriptionObjectRepository.getSendZippMessage().getElement().click();
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getSendZippMessageConfirmation().getElement().click();
			Thread.sleep(2000);
			
			
		}
		
		public void verifyZippGramNameIsMandatory() throws Exception {
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getSendZippGramButton().getElement().click();
			Thread.sleep(1000);
			commonFunctions.verifyElementIsPresent(createZippGramPageRepository.getErrorMessageForZippGramname());
			createZippGramPageRepository.getZippGramName().getElement().sendKeys("Test ZippGram");
			Thread.sleep(1000);
			createZippGramPageRepository.getParagraph().getElement().sendKeys("ZippGram by Parag");
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
	}
