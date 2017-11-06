package com.ZippSlipAutomation.parent.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class ZippGramConsentFlowRepository {
	
	
	@FindBy(xpath = ".//a[contains(.,'View ZippGram')]")
	private WebElement oViewZippGram;

	public ReturnElement getViewZippGram() {
		return new ReturnElement(oViewZippGram, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "rblPollOptions_0")
	private WebElement oSelectPollOptn;

	public ReturnElement getSelectPollOptn() {
		return new ReturnElement(oSelectPollOptn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(id = "btnSavePoll")
	private WebElement oSavePollOptn;

	public ReturnElement getSavePollOptn() {
		return new ReturnElement(oSavePollOptn, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
	@FindBy(xpath = ".//a[contains(.,'Home')]") 

	private WebElement oHomeScreen;

	public ReturnElement getHomeScreen() {
		return new ReturnElement(oHomeScreen, Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	
}
