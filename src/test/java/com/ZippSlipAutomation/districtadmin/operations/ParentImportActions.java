package com.ZippSlipAutomation.districtadmin.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ZippSlipAutomation.admin.objectRepository.UploadPastAbsencesRepository;
import com.ZippSlipAutomation.districtadmin.objectRepository.ParentImportRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;
import com.ZippSlipAutomation.utilities.ReturnElement;

public class ParentImportActions {
	CommonFunctions commonFunctions = new CommonFunctions();
	ParentImportRepository parentImportRepository = PageFactory.initElements(DriverInitiation.getDriver(),ParentImportRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();
	
	public void importParent() throws Exception {
		
		Thread.sleep(2000);
		//commonFunctions.hoverOverElement(parentImportRepository.getAdministrationLink().getElement());
	//	parentImportRepository.getImportTemplate().getElement().click();
		parentImportRepository.getTemplateSearch().getElement().sendKeys("Parent Profile Import Template1");
		parentImportRepository.getTemplateSearch().getElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		parentImportRepository.getImportBtn().getElement().click();
		parentImportRepository.getuploadfileBtn().getElement().click();
		String Filepath = System.getProperty("user.dir") + "\\src\\resource\\Parent Import.xlsx";
		CommonFunctions.uploadFile(Filepath);
		Thread.sleep(2000);
		parentImportRepository.getPopupImportBtn().getElement().click();
		Thread.sleep(5000);
		
	}
	
	public void checkLogs() throws Exception
	{
		parentImportRepository.getRefreshLogsBtn().getElement().click();
	}
	
	public void deleteTempplate() throws Exception
	{
	
		parentImportRepository.getTemplateSearch().getElement().sendKeys("Parent Profile Import Template1");
		parentImportRepository.getTemplateSearch().getElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		parentImportRepository.getDeleteTemplate().getElement().click();
		parentImportRepository.getDeleteTemplateConfirmation().getElement().click();
		WebDriverWait wait = new WebDriverWait(DriverInitiation.getDriver(), 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='divPreviewError']/div")));
		Thread.sleep(2000);
	}
	
	}
	

