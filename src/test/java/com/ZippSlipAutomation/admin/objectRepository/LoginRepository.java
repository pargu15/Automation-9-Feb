package com.ZippSlipAutomation.admin.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.DriverInitiation;
import com.ZippSlipAutomation.utilities.ReturnElement;

public class LoginRepository {

	@FindBy(id = "MainContent_txtUserName")
	private WebElement oUserName;

	public ReturnElement getUserName() {
		return new ReturnElement(oUserName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "txtPassword")
	private WebElement oPassword;

	public ReturnElement getPassword() {
		return new ReturnElement(oPassword, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "MainContent_btnSignIn")
	private WebElement oSubmitButton;

	public ReturnElement getSubmitButton() {
		return new ReturnElement(oSubmitButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulInstitution']/li[2]")
	private WebElement oSocialEnglishInstitutionName;

	public ReturnElement getSocialEnglishInstitutionName() {
		return new ReturnElement(oSocialEnglishInstitutionName,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulInstitution']/li[1]")
	private WebElement oSocialFrenchInstitutionName;

	public ReturnElement getSocialFrenchInstitutionName() {
		return new ReturnElement(oSocialFrenchInstitutionName,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulInstitution']/li[1]")
	private WebElement oProdEnglishInstitutionName;

	public ReturnElement getProdEnglishInstitutionName() {
		return new ReturnElement(oProdEnglishInstitutionName,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(xpath = ".//*[@id='ulInstitution']/li[5]")
	private WebElement oProdFrenchInstitutionName;

	public ReturnElement getProdFrenchInstitutionName() {
		return new ReturnElement(oProdFrenchInstitutionName, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	public static void clickOnLogoutButton() {
		WebElement oLogoutButton = DriverInitiation.getDriver().findElement(By.id("lbLogout"));
		oLogoutButton.click();
	}

}
