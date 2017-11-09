package com.ZippSlipAutomation.utilities;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelReadEvent {

	private String loginid;
	private String password;
	private String EventName;
	private String Location;
	private String Description;
	private String DoNotAllowRespondNo;
	private String AdvancedSettings;
	private String ShowFormDifference;
	private String SummaryPage;
	private String AllForms;
	private String PrintInstruction;
	private String AllowResponseEdit;
	private String DoNotAllowZippNote;
	private String RecipientToUploadFiles;
	private String SpecifyDocs;
	private String GroupName;
	private String EventConsentResponse;
	private String ActivityType;
	private String FormName;
	private String NewFormName;
	private String NewFormDescription;
	private String TextQuestion;
	private String PhoneNumber;
	private String DateQuestion;
	private String FirstNameQuestion;
	private String LastNameQuestion;
	private String StreetNumberQuestion;
	private String MailingAddressQuestion;
	private String StreetTypeQuestion;
	private String MailingAddressApartmentQuestion;
	private String CityTownQuestion;
	private String ZippCodeQuestion;
	private String EmailQuestion;
	private String ParentFirstName;
	private String EnrolledStudentDOB;
	private String EnrolledStudentID;
	private String NewStudentFirstName;
	private String NewStudentLastName;
	private String NewStudentDOB;
	private String ParentLastName;
	private String ParentEmail;
	private String ParentPassword;
	private String ParentConfirmPassword;
	private String ParentMobileNumber;
	private String EnrolledStatus;
	private String ElectronicPin;
	private String ConfirmElectronicPin;
	private String DataStatus;
	private String SchoolName;
	private String SchoolKey;
	private String SchoolID;
	private String SchoolURL;
	private String FirstName;
	private String LastName;
	private String AdminEmail;
	private String AdminPassword;
	
	public String getDataStatus() {
		return DataStatus;
	}

	public void setDataStatus(String dataStatus) {
		DataStatus = dataStatus;
	}

	public String getElectronicPin() {
		return ElectronicPin;
	}

	public void setElectronicPin(String electronicPin) {
		ElectronicPin = electronicPin;
	}

	public String getConfirmElectronicPin() {
		return ConfirmElectronicPin;
	}

	public void setConfirmElectronicPin(String confirmElectronicPin) {
		ConfirmElectronicPin = confirmElectronicPin;
	}

	public String getEnrolledStatus() {
		return EnrolledStatus;
	}

	public void setEnrolledStatus(String enrolledStatus) {
		EnrolledStatus = enrolledStatus;
	}

	public String getParentPassword() {
		return ParentPassword;
	}

	public void setParentPassword(String parentPassword) {
		ParentPassword = parentPassword;
	}

	public String getParentConfirmPassword() {
		return ParentConfirmPassword;
	}

	public void setParentConfirmPassword(String parentConfirmPassword) {
		ParentConfirmPassword = parentConfirmPassword;
	}

	public String getParentMobileNumber() {
		return ParentMobileNumber;
	}

	public void setParentMobileNumber(String parentMobileNumber) {
		ParentMobileNumber = parentMobileNumber;
	}
	
	public String getEnrolledStudentID() {
		return EnrolledStudentID;
	}

	public void setEnrolledStudentID(String enrolledStudentID) {
		EnrolledStudentID = enrolledStudentID;
	}

	public String getEnrolledStudentDOB() {
		return EnrolledStudentDOB;
	}

	public void setEnrolledStudentDOB(String enrolledStudentDOB) {
		EnrolledStudentDOB = enrolledStudentDOB;
	}

	public String getNewStudentFirstName() {
		return NewStudentFirstName;
	}

	public void setNewStudentFirstName(String newStudentFirstName) {
		NewStudentFirstName = newStudentFirstName;
	}

	public String getNewStudentLastName() {
		return NewStudentLastName;
	}

	public void setNewStudentLastName(String newStudentLastName) {
		NewStudentLastName = newStudentLastName;
	}

	public String getNewStudentDOB() {
		return NewStudentDOB;
	}

	public void setNewStudentDOB(String newStudentDOB) {
		NewStudentDOB = newStudentDOB;
	}	
	
	public String getParentFirstName() {
		return ParentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		ParentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return ParentLastName;
	}

	public void setParentLastName(String parentLastName) {
		ParentLastName = parentLastName;
	}

	public String getParentEmail() {
		return ParentEmail;
	}

	public void setParentEmail(String parentEmail) {
		ParentEmail = parentEmail;
	}



	public String getEmailQuestion() {
		return EmailQuestion;
	}

	public void setEmailQuestion(String emailQuestion) {
		EmailQuestion = emailQuestion;
	}

	public String getTextQuestion() {
		return TextQuestion;
	}

	public void setTextQuestion(String textQuestion) {
		TextQuestion = textQuestion;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getDateQuestion() {
		return DateQuestion;
	}

	public void setDateQuestion(String dateQuestion) {
		DateQuestion = dateQuestion;
	}

	public String getFirstNameQuestion() {
		return FirstNameQuestion;
	}

	public void setFirstNameQuestion(String firstNameQuestion) {
		FirstNameQuestion = firstNameQuestion;
	}

	public String getLastNameQuestion() {
		return LastNameQuestion;
	}

	public void setLastNameQuestion(String lastNameQuestion) {
		LastNameQuestion = lastNameQuestion;
	}
	
	public String getStreetNumberQuestion() {
		return StreetNumberQuestion;
	}

	public void setStreetNumberQuestion(String streetNumberQuestion) {
		StreetNumberQuestion = streetNumberQuestion;
	}
	
		public String getMailingAddressQuestion() {
		return MailingAddressQuestion;
	}

	public void setMailingAddressQuestion(String mailingAddressQuestion) {
		MailingAddressQuestion = mailingAddressQuestion;
	}
	
		public String getStreetTypeQuestion() {
		return StreetTypeQuestion;
	}

	public void setStreetTypeQuestion(String streetTypeQuestion) {
		StreetTypeQuestion = streetTypeQuestion;
	}
	
		public String getMailingAddressApartmentQuestion() {
		return MailingAddressApartmentQuestion;
	}

	public void setMailingAddressApartmentQuestion(String mailingAddressApartmentQuestion) {
		MailingAddressApartmentQuestion = mailingAddressApartmentQuestion;
	}
	
		public String getCityTownQuestion() {
		return CityTownQuestion;
	}

	public void setCityTownQuestion(String cityTownQuestion) {
		CityTownQuestion = cityTownQuestion;
	}
	
		public String getZippCodeQuestion() {
		return ZippCodeQuestion;
	}

	public void setZippCodeQuestion(String zippCodeQuestion) {
		ZippCodeQuestion = zippCodeQuestion;
	}
	
	

	public String getFormName() {
		return FormName;
	}

	public void setFormName(String formName) {
		FormName = formName;
	}

	public String getActivityType() {
		return ActivityType;
	}

	public void setActivityType(String activityType) {
		ActivityType = activityType;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEventName() {
		return EventName;
	}
	
	public void setEventName(String eventName) {
		EventName = eventName;
	}

	public String getNewFormName() {
		return  NewFormName;
	}

	public void setNewFormName(String newFormName) {
		NewFormName = newFormName;
	}
	
	public String getFormDescription() {
		return  NewFormDescription;
	}

	public void setFormDescription(String newFormDescription) {
		NewFormDescription = newFormDescription;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getDoNotAllowRespondNo() {
		return DoNotAllowRespondNo;
	}

	public void setDoNotAllowRespondNo(String doNotAllowRespondNo) {
		DoNotAllowRespondNo = doNotAllowRespondNo;
	}

	public String getAdvancedSettings() {
		return AdvancedSettings;
	}

	public void setAdvancedSettings(String advancedSettings) {
		AdvancedSettings = advancedSettings;
	}

	public String getShowFormDifference() {
		return ShowFormDifference;
	}

	public void setShowFormDifference(String showFormDifference) {
		ShowFormDifference = showFormDifference;
	}

	public String getSummaryPage() {
		return SummaryPage;
	}

	public void setSummaryPage(String summaryPage) {
		SummaryPage = summaryPage;
	}

	public String getAllForms() {
		return AllForms;
	}

	public void setAllForms(String allForms) {
		AllForms = allForms;
	}

	public String getPrintInstruction() {
		return PrintInstruction;
	}

	public void setPrintInstruction(String printInstruction) {
		PrintInstruction = printInstruction;
	}

	public String getAllowResponseEdit() {
		return AllowResponseEdit;
	}

	public void setAllowResponseEdit(String allowResponseEdit) {
		AllowResponseEdit = allowResponseEdit;
	}

	public String getDoNotAllowZippNote() {
		return DoNotAllowZippNote;
	}

	public void setDoNotAllowZippNote(String doNotAllowZippNote) {
		DoNotAllowZippNote = doNotAllowZippNote;
	}

	public String getRecipientToUploadFiles() {
		return RecipientToUploadFiles;
	}

	public void setRecipientToUploadFiles(String recipientToUploadFiles) {
		RecipientToUploadFiles = recipientToUploadFiles;
	}

	public String getSpecifyDocs() {
		return SpecifyDocs;
	}

	public void setSpecifyDocs(String specifyDocs) {
		SpecifyDocs = specifyDocs;
	}

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}

	public String getEventConsentResponse() {
		return EventConsentResponse;
	}

	public void setEventConsentResponse(String eventConsentResponse) {
		EventConsentResponse = eventConsentResponse;
	}
	
	
	public String getSchoolName() {
		return  SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	
	
	public String getSchoolKey() {
		return  SchoolKey;
	}

	public void setSchoolKey(String schoolKey) {
		SchoolKey = schoolKey;
	}
	
	public String getSchoolID() {
		return  SchoolID;
	}

	public void setSchoolID(String schoolID) {
		SchoolID = schoolID;
	}
	
	public String getSchoolURL() {
		return  SchoolURL;
	}

	public void setSchoolURL(String schoolURL) {
		SchoolURL = schoolURL;
	}
	
	
	public String getAdminFirstName() {
		return  FirstName;
	}

	public void setAdminFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getAdminlastName() {
		return  LastName;
	}

	public void setAdminlastName(String lastName) {
		LastName = lastName;
	}
	
	

	public String getAdminEmail() {
		return  AdminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}
	
	public String getAdminPassword() {
		return  AdminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	
	/*
	public boolean readFromExcel(int sheet, int row) throws Exception {

		boolean noFound = false;
		String FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
		
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
		Sheet sh = wb.getSheet(sheet);

		// To get the number of rows present in sheet
		// int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		String[] singlerow = new String[totalNoOfCols];

		// for (int row = a; row < totalNoOfRows; row++) {

		String strcellvalue = null;
		for (int col = 0; col < totalNoOfCols; col++) {
			strcellvalue = sh.getCell(col, row).getContents().toString();
			singlerow[col] = strcellvalue;

		}
		
		if(singlerow[2].contains("abc")){
			noFound=true;
		}
		
		if(singlerow[2].contains("no")){
			noFound=true;
		}
		
		
		
		switch (sheet) {
		case 0:
			setLoginid(singlerow[0]);
			setPassword(singlerow[1]);
			break;

		case 1:
			setEventName(singlerow[0]);
			setLocation(singlerow[1]);
			setDescription(singlerow[2]);
			setDoNotAllowRespondNo(singlerow[3]);
			setAdvancedSettings(singlerow[4]);
			setShowFormDifference(singlerow[5]);
			setSummaryPage(singlerow[6]);
			setAllForms(singlerow[7]);
			setPrintInstruction(singlerow[8]);
			setAllowResponseEdit(singlerow[9]);
			setDoNotAllowZippNote(singlerow[10]);
			setRecipientToUploadFiles(singlerow[11]);
			setSpecifyDocs(singlerow[12]);
			setGroupName(singlerow[13]);
			setActivityType(singlerow[14]);
			setFormName(singlerow[15]);
			break;

		case 2:
			setEventConsentResponse(singlerow[0]);
			setTextQuestion(singlerow[1]);
			setPhoneNumber(singlerow[2]);
			setDateQuestion(singlerow[3]);
			setEmailQuestion(singlerow[4]);
			setFirstNameQuestion(singlerow[5]);
			setLastNameQuestion(singlerow[6]);
			setStreetNumberQuestion(singlerow[7]);
			setMailingAddressQuestion(singlerow[8]);
			setStreetTypeQuestion(singlerow[9]);
			setMailingAddressApartmentQuestion(singlerow[10]);
			setCityTownQuestion(singlerow[11]);
			setZippCodeQuestion(singlerow[12]);
			break;
			
		case 3:
			setParentFirstName(singlerow[0]);
			setParentLastName(singlerow[1]);
			setParentEmail(singlerow[2]);
			setParentPassword(singlerow[3]);
			setParentConfirmPassword(singlerow[4]);
			setParentMobileNumber(singlerow[5]);
			setElectronicPin(singlerow[6]);
			setConfirmElectronicPin(singlerow[7]);
			setDataStatus(singlerow[8]);
			break;
			
		case 4:
			setEnrolledStudentID(singlerow[0]);
			setEnrolledStudentDOB(singlerow[1]);
			setEnrolledStatus(singlerow[2]);
			break;
			
		case 5:
			setNewStudentFirstName(singlerow[0]);
			setNewStudentLastName(singlerow[1]);
			setNewStudentDOB(singlerow[2]);
			break;
			
		case 6:
			setParentFirstName(singlerow[0]);
			setParentLastName(singlerow[1]);
			setParentEmail(singlerow[2]);
			setParentPassword(singlerow[3]);
			setParentConfirmPassword(singlerow[4]);
			setParentMobileNumber(singlerow[5]);
			setElectronicPin(singlerow[6]);
			setConfirmElectronicPin(singlerow[7]);
			setDataStatus(singlerow[8]);
			break;
			
		case 7:
			setEnrolledStudentID(singlerow[0]);
			setEnrolledStudentDOB(singlerow[1]);
			setEnrolledStatus(singlerow[2]);
			break;	
			
		case 10:
			setSchoolName(singlerow[0]);
			setSchoolKey(singlerow[1]);
			setSchoolID(singlerow[2]);
			setSchoolURL(singlerow[3]);
			setAdminFirstName(singlerow[4]);
			setAdminlastName(singlerow[5]);
			setAdminEmail(singlerow[6]);
			setAdminPassword(singlerow[7]);
			setDataStatus(singlerow[8]);
			break;	
		default:
			break;

		}
		return noFound;

	}
	
	*/
	
	public boolean readFromExcel(int sheet, int row,ExcelTypes excelType) throws Exception {

		boolean noFound = false;
		String FilePath="";
		if(excelType==ExcelTypes.Excel1) {
		FilePath = System.getProperty("user.dir") + "//src//resource//TestDataSheet.xls";
		}
		else if(excelType==ExcelTypes.Excel2) {
			FilePath = System.getProperty("user.dir") + "//src//resource//TestDataForPastFutureAbsences.xls";	
		}
		else if(excelType==ExcelTypes.Excel3) {
			FilePath = System.getProperty("user.dir") + "//src//resource//ParentImport.xls";	
		}
		else {
			return false;
		}
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
		Sheet sh = wb.getSheet(sheet);

		// To get the number of rows present in sheet
		// int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		String[] singlerow = new String[totalNoOfCols];

		// for (int row = a; row < totalNoOfRows; row++) {

		String strcellvalue = null;
		for (int col = 0; col < totalNoOfCols; col++) {
			strcellvalue = sh.getCell(col, row).getContents().toString();
			singlerow[col] = strcellvalue;

		}
		
		if(singlerow[2].contains("abc")){
			noFound=true;
		}
		
		if(singlerow[2].contains("no")){
			noFound=true;
		}

		if(excelType==ExcelTypes.Excel1) {
		return excel1Work(sheet, noFound, singlerow);
		}
		else if(excelType==ExcelTypes.Excel2) {
			return excel2Work(sheet, noFound, singlerow);
			}
		else if(excelType==ExcelTypes.Excel3) {
			return excel3Work(sheet, noFound, singlerow);
			}
			
		else {
			return false;
		}
		

	}
	
	private boolean excel1Work(int sheet, boolean noFound, String[] singlerow) {
		switch (sheet) {
		case 0:
			setLoginid(singlerow[0]);
			setPassword(singlerow[1]);
			break;

		case 1:
			setEventName(singlerow[0]);
			setLocation(singlerow[1]);
			setDescription(singlerow[2]);
			setDoNotAllowRespondNo(singlerow[3]);
			setAdvancedSettings(singlerow[4]);
			setShowFormDifference(singlerow[5]);
			setSummaryPage(singlerow[6]);
			setAllForms(singlerow[7]);
			setPrintInstruction(singlerow[8]);
			setAllowResponseEdit(singlerow[9]);
			setDoNotAllowZippNote(singlerow[10]);
			setRecipientToUploadFiles(singlerow[11]);
			setSpecifyDocs(singlerow[12]);
			setGroupName(singlerow[13]);
			setActivityType(singlerow[14]);
			setFormName(singlerow[15]);
			break;

		case 2:
			setEventConsentResponse(singlerow[0]);
			setTextQuestion(singlerow[1]);
			setPhoneNumber(singlerow[2]);
			setDateQuestion(singlerow[3]);
			setEmailQuestion(singlerow[4]);
			setFirstNameQuestion(singlerow[5]);
			setLastNameQuestion(singlerow[6]);
			setStreetNumberQuestion(singlerow[7]);
			setMailingAddressQuestion(singlerow[8]);
			setStreetTypeQuestion(singlerow[9]);
			setMailingAddressApartmentQuestion(singlerow[10]);
			setCityTownQuestion(singlerow[11]);
			setZippCodeQuestion(singlerow[12]);
			break;
			
		case 3:
			setParentFirstName(singlerow[0]);
			setParentLastName(singlerow[1]);
			setParentEmail(singlerow[2]);
			setParentPassword(singlerow[3]);
			setParentConfirmPassword(singlerow[4]);
			setParentMobileNumber(singlerow[5]);
			setElectronicPin(singlerow[6]);
			setConfirmElectronicPin(singlerow[7]);
			setDataStatus(singlerow[8]);
			break;
			
		case 4:
			setEnrolledStudentID(singlerow[0]);
			setEnrolledStudentDOB(singlerow[1]);
			setEnrolledStatus(singlerow[2]);
			break;
			
		case 5:
			setNewStudentFirstName(singlerow[0]);
			setNewStudentLastName(singlerow[1]);
			setNewStudentDOB(singlerow[2]);
			break;
			
		case 6:
			setParentFirstName(singlerow[0]);
			setParentLastName(singlerow[1]);
			setParentEmail(singlerow[2]);
			setParentPassword(singlerow[3]);
			setParentConfirmPassword(singlerow[4]);
			setParentMobileNumber(singlerow[5]);
			setElectronicPin(singlerow[6]);
			setConfirmElectronicPin(singlerow[7]);
			setDataStatus(singlerow[8]);
			break;
			
		case 7:
			setEnrolledStudentID(singlerow[0]);
			setEnrolledStudentDOB(singlerow[1]);
			setEnrolledStatus(singlerow[2]);
			break;	
			
		case 10:
			setSchoolName(singlerow[0]);
			setSchoolKey(singlerow[1]);
			setSchoolID(singlerow[2]);
			setSchoolURL(singlerow[3]);
			setAdminFirstName(singlerow[4]);
			setAdminlastName(singlerow[5]);
			setAdminEmail(singlerow[6]);
			setAdminPassword(singlerow[7]);
			setDataStatus(singlerow[8]);
			break;	
		default:
			break;

		}
		return noFound;
	}
	
	private boolean excel2Work(int sheet, boolean noFound, String[] singlerow) {
		switch (sheet) {
		case 0:
			
			setPhoneNumber(singlerow[0]);
			setDateQuestion(singlerow[1]);
			setEmailQuestion(singlerow[2]);
			setFirstNameQuestion(singlerow[3]);
			setLastNameQuestion(singlerow[4]);	
			setMailingAddressQuestion(singlerow[5]);
			setCityTownQuestion(singlerow[6]);
			setZippCodeQuestion(singlerow[7]);
			setElectronicPin(singlerow[8]);
			break;

		
		default:
			break;

		}
		return noFound;
	}
	private boolean excel3Work(int sheet, boolean noFound, String[] singlerow) {
		switch (sheet) {
		case 0:
			setLoginid(singlerow[4]);
			setPassword(singlerow[5]);
			break;

		
		default:
			break;

		}
		return noFound;
	}
	


}
