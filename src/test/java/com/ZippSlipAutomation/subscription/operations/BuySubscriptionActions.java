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
		
		
		public void registerNewTeacherFunctionality() throws Exception {
		
			ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		
			if (CommonVariables.recipient == URLTypes.socialenglishSubscription) {
				excelReadEvent.readFromExcel(3, CommonVariables.rownumber, ExcelTypes.Excel1);
			}
		
			else if (CommonVariables.recipient == URLTypes.prodenglishSubscription) {
				excelReadEvent.readFromExcel(6, CommonVariables.rownumber, ExcelTypes.Excel1);
			}
		
		
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getSignupBtn().getElement());
			
			buySubscriptionObjectRepository.getSignupBtn().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getTeacherRole().getElement().click();
			/*	
			buySubscriptionObjectRepository.getFirstName().getElement().sendKeys("Parag");
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getLastName().getElement().sendKeys("Jain");
			Thread.sleep(1000);
		
			
			buySubscriptionObjectRepository.getEmail().getElement().sendKeys("a1m1it@yopmail.com");
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getMobile().getElement().sendKeys("66971111119");
			Thread.sleep(1000);

		
		//	buySubscriptionObjectRepository.getPassword().getElement().sendKeys("zippy1");
			Thread.sleep(1000);
		
			*/
			
			
		
			buySubscriptionObjectRepository.getFirstName().getElement().sendKeys(excelReadEvent.getParentFirstName());
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getLastName().getElement().sendKeys(excelReadEvent.getParentLastName());
			Thread.sleep(1000);
		
			
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
		
		public void FindMySchoolFunctionality() throws Exception{
			
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getZippCode().getElement());
			
			buySubscriptionObjectRepository.getZippCode().getElement().sendKeys("20101");
			Thread.sleep(1000);
		
			buySubscriptionObjectRepository.getInstitution().getElement().click();
			Thread.sleep(5000);
			buySubscriptionObjectRepository.getSelectInstitutionFromDropdown().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getContinueButton().getElement().click();
			Thread.sleep(5000);
			
			
			
			
		}
		
		
	public void	AddMySchoolFunctionality() throws Exception{
		
		commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getSchoolState().getElement());
		
		buySubscriptionObjectRepository.getSchoolState().getElement().click();
		Thread.sleep(2000);
	
		buySubscriptionObjectRepository.getSelectState().getElement().click();
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getSelectSchool().getElement().click();
		Thread.sleep(2000);
	
		buySubscriptionObjectRepository.getAddSchool().getElement().click();
		Thread.sleep(3000);
		
		
	}
		public void autoLoginFunctionality() throws Exception {
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getLoginButton().getElement());
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getLoginButton().getElement().click();
			
			System.out.println("Subscription Completed");
			Thread.sleep(5000);
		if (CommonVariables.recipient == URLTypes.socialenglishSubscription) {
			excelWrite.writeresultinexcel(3, 8, CommonVariables.rownumber, "Data Used");
		}
		
		else if (CommonVariables.recipient == URLTypes.prodenglishSubscription) {
			excelWrite.writeresultinexcel(6, 8, CommonVariables.rownumber, "Data Used");
			}
		Thread.sleep(2000);
				
		}
			
		
			public void TeacherOnboading() throws Exception{
				buySubscriptionObjectRepository.getStartFlyerButton	().getElement().click();
				Thread.sleep(1000);
			}
			
			
			
			public void AddClassroom() throws Exception {
				
			//	buySubscriptionObjectRepository.getAddClassButton().getElement().click();
			//	Thread.sleep(1000);
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
		//	buySubscriptionObjectRepository.getInviteParentStep().getElement().click();
			Thread.sleep(1000);
		//	commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getInviteParentButton().getElement());
		//	buySubscriptionObjectRepository.getInviteParentButton().getElement().click();
		//	Thread.sleep(2000);
			buySubscriptionObjectRepository.getParentEmail().getElement().sendKeys("Test@yopmail.com");
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getSendInvite().getElement().click();
			Thread.sleep(4000);
					
		}
		
		public void SendPermissionSlip() throws Exception {
			buySubscriptionObjectRepository.getCreatePermissionSlipStep().getElement().click();
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getPermissionSlipButton().getElement());
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getPermissionSlipButton().getElement().click();
			Thread.sleep(5000);
			buySubscriptionObjectRepository.getEventName().getElement().sendKeys("Test Event");
			buySubscriptionObjectRepository.getSendButton().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getDoNotNotify().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getConfirmPublishUnpublish().getElement().click();
			Thread.sleep(1000);
			
			
		}
		
		public void SendZippGramWindow() throws Exception {
			
			commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getCreateZippGram().getElement());
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getCreateZippGram().getElement().click();
			Thread.sleep(5000);
			
		}
		public void SendZippGram() throws Exception {
			
			buySubscriptionObjectRepository.getSendButton().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getDoNotNotify().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getConfirmPublishUnpublish().getElement().click();
			Thread.sleep(1000);
			
			
		}
		
		public void verifyZippGramNameIsMandatory() throws Exception {
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getSendButton().getElement().click();
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
		
		public void SendZippMessage() throws Exception {
		buySubscriptionObjectRepository.getSendZippMessage().getElement().click();
		Thread.sleep(3000);
		buySubscriptionObjectRepository.getZippMessageTitle().getElement().sendKeys("Zipp Message Title");
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getZippMessageText().getElement().sendKeys("Test Message");
		Thread.sleep(2000);
		//buySubscriptionObjectRepository.getZippMessageEmailText().getElement().sendKeys("Email text");
		//Thread.sleep(1000);
			buySubscriptionObjectRepository.getSubmitZippMessage().getElement().click();
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getSendZippMessageConfirmation().getElement().click();
			Thread.sleep(2000);
			
		}
		
		public void AddCard() throws Exception {
			buySubscriptionObjectRepository.getAddCardStep().getElement().click();
		//	commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getCardHolderName().getElement());
		Thread.sleep(1000);
		buySubscriptionObjectRepository.getCardHolderName().getElement().sendKeys("Test Card");
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getCreditCardNumber().getElement().sendKeys("4916339731576481");
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getCreditCardExpiryDropdown().getElement().click();
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getCardExpiryYear().getElement().click();
		Thread.sleep(1000);
		buySubscriptionObjectRepository.getCreditCardCVV().getElement().sendKeys("111");
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getAddButton().getElement().click();
			Thread.sleep(2000);
			
		}
		
		public void Start30DaysTrial() throws Exception
		{
			buySubscriptionObjectRepository.getMySubscriptionTab().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getStart30daysTrail().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getConfirm30daysTrail().getElement().click();
			Thread.sleep(7000);
			System.out.println("30 Days Trial Started");
		}
		
		public void UpgradetoPermission() throws Exception
		{
			buySubscriptionObjectRepository.getMySubscriptionTab().getElement().click();
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getPermissionUpgrade().getElement().click();
			Thread.sleep(2000);
			buySubscriptionObjectRepository.getSelectPackage().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getSelectPackageFromDropdown().getElement().click();
			Thread.sleep(1000);
			buySubscriptionObjectRepository.getCardHolderName().getElement().sendKeys("Test Card");
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getCreditCardNumber().getElement().sendKeys("4916339731576481");
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getCreditCardExpiryDropdown().getElement().click();
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getCardExpiryYear().getElement().click();
		Thread.sleep(1000);
		buySubscriptionObjectRepository.getCreditCardCVV().getElement().sendKeys("111");
		Thread.sleep(2000);
		buySubscriptionObjectRepository.getPayButton().getElement().click();
		Thread.sleep(20000);
		commonFunctions.waitUntilElementDisplayed(buySubscriptionObjectRepository.getPaymentSuccessful().getElement());
		System.out.println("Upgrade Successfull");
				buySubscriptionObjectRepository.getPaymentSuccessful().getElement().click();
				Thread.sleep(2000);
			}
		}
