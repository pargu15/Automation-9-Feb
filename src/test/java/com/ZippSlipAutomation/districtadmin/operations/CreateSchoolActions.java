	package com.ZippSlipAutomation.districtadmin.operations;

import java.io.FileInputStream;

import org.openqa.selenium.support.PageFactory;

import com.ZippSlipAutomation.admin.objectRepository.EventPageRepository;
import com.ZippSlipAutomation.districtadmin.objectRepository.CreateSchoolPageRepository;
import com.ZippSlipAutomation.utilities.CommonFunctions;
import com.ZippSlipAutomation.utilities.CommonVariables;
import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ExcelReadEvent;

import jxl.Sheet;
import jxl.Workbook;

public class CreateSchoolActions {
	CommonFunctions commonFunctions = new CommonFunctions();
	CreateSchoolPageRepository createSchoolPageRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			CreateSchoolPageRepository.class);
	ExcelReadEvent excelReadEvent = new ExcelReadEvent();
	



	public void selectSchoolListLink() throws Exception {

		commonFunctions.waitUntilElementDisplayed(createSchoolPageRepository.getSchoolList().getElement());
		createSchoolPageRepository.getSchoolList().getElement().click();
		Thread.sleep(2000);

	}

	public void selectCreateSchoolLink() throws Exception {

		createSchoolPageRepository.getCreateSchool().getElement().click();
		Thread.sleep(2000);
	}

	


}
