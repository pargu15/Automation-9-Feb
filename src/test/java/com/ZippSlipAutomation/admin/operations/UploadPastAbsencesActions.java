package com.ZippSlipAutomation.admin.operations;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.ZippSlipAutomation.admin.objectRepository.UploadPastAbsencesRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

public class UploadPastAbsencesActions {

	CommonFunctions commonFunctions = new CommonFunctions();
	UploadPastAbsencesRepository uploadPastAbsencesRepository = PageFactory.initElements(DriverInitiation.getDriver(),UploadPastAbsencesRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();
	
	public void uploadPastAbsences() throws Exception {
		
		Thread.sleep(2000);
		commonFunctions.hoverOverElement(uploadPastAbsencesRepository.getAdministrationLink().getElement());
		uploadPastAbsencesRepository.getImportTemplate().getElement().click();
		uploadPastAbsencesRepository.getTemplateSearch().getElement().sendKeys("Past absences Student");
		uploadPastAbsencesRepository.getTemplateSearch().getElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		uploadPastAbsencesRepository.getImportBtn().getElement().click();
		uploadPastAbsencesRepository.getuploadfileBtn().getElement().click();
		String Filepath = System.getProperty("user.dir") + "\\src\\resource\\Student Absences.xlsx";
		System.out.println(Filepath);
		CommonFunctions.uploadFile(Filepath);
		Thread.sleep(2000);
		uploadPastAbsencesRepository.getPopupImportBtn().getElement().click();
		Thread.sleep(5000);
		
	}
	

}
