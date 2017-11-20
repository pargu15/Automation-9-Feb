package com.ZippSlipAutomation.admin.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ZippSlipAutomation.utilities.ReturnElement;

public class FormCreationPageRepository {

	@FindBy(xpath = ".//span[contains(.,'Administration')]")
	private WebElement oFormList;

	public ReturnElement getFormList() {
		return new ReturnElement(oFormList,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}



	@FindBy(xpath = ".//span[contains(.,'Create Form')]") 
	private WebElement oCreateForm;

	public ReturnElement getCreateFormLink() {
		return new ReturnElement(oCreateForm,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "btnNext")
	private WebElement oNextButton;

	public ReturnElement getNextButton() {
		return new ReturnElement(oNextButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(id = "txtName")
	private WebElement oFormName;

	public ReturnElement getNewFormName() {
		return new ReturnElement(oFormName,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(id = "MainContent_rfcFormName")
	private WebElement errorMessageForFormname;

	public ReturnElement getErrorMessageForFormname() {
		return new ReturnElement(errorMessageForFormname, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(id = "txtDescription")
	private WebElement oFormDescription;

	public ReturnElement getFormDescription() {
		return new ReturnElement(oFormDescription,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[1]") 

	private WebElement oParagraph;

	public ReturnElement getParagraphControl() {
		return new ReturnElement(oParagraph, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[2]") 

	private WebElement oTextBox;

	public ReturnElement getTextBoxControl() {
		return new ReturnElement(oTextBox, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[3]") 

	private WebElement oSingleSelect;

	public ReturnElement getSingleSelectControl() {
		return new ReturnElement(oSingleSelect, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[4]") 

	private WebElement oMultipleSelect;

	public ReturnElement getMultipleSelectControl() {
		return new ReturnElement(oMultipleSelect, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[5]") 

	private WebElement oDropDown;

	public ReturnElement getDropDownControl() {
		return new ReturnElement(oDropDown, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[6]") 

	private WebElement oPhonePicker;

	public ReturnElement getPhoneControl() {
		return new ReturnElement(oPhonePicker, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[7]") 

	private WebElement oDatePicker;

	public ReturnElement getDatePickerControl() {
		return new ReturnElement(oDatePicker, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[8]") 

	private WebElement oEmailPicker;

	public ReturnElement getEmailControl() {
		return new ReturnElement(oEmailPicker, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[9]") 

	private WebElement oNamePicker;

	public ReturnElement getNameControl() {
		return new ReturnElement(oNamePicker, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//*[@id='pnlStep2']/div[1]/div[1]/div[2]/div/div[10]") 

	private WebElement oAddressPicker;

	public ReturnElement getAddressPickerControl() {
		return new ReturnElement(oAddressPicker, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//*[contains(@id,'label') and contains(@controltype,'label')]") 

	private WebElement oParagraphQuesInput;

	public ReturnElement getParagraphQuesInput() {
		return new ReturnElement(oParagraphQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[contains(@id,'text') and contains(@controltype,'text')]") 

	private WebElement oTextBoxQuesInput;

	public ReturnElement getTextBoxQuesInput() {
		return new ReturnElement(oTextBoxQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[contains(@id,'radio') and contains(@controltype,'radio')]") 

	private WebElement oSingleSelectQuesInput;

	public ReturnElement getSingleSelectControlQuesInput() {
		return new ReturnElement(oSingleSelectQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[contains(@id,'checkbox') and contains(@controltype,'checkbox')]") 

	private WebElement oMultipleSelectQuesInput;

	public ReturnElement getMultipleSelectControlQuesInput() {
		return new ReturnElement(oMultipleSelectQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[contains(@id,'select') and contains(@controltype,'select')]") 

	private WebElement oDropDownQuesInput;

	public ReturnElement getDropDownControlQuesInput() {
		return new ReturnElement(oDropDownQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[contains(@id,'phone') and contains(@controltype,'phone')]") 

	private WebElement oPhonePickerQuesInput;

	public ReturnElement getPhoneControlQuesInput() {
		return new ReturnElement(oPhonePickerQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//*[contains(@id,'date') and contains(@controltype,'date')]") 

	private WebElement oDatePickerQuesInput;

	public ReturnElement getDatePickerControlQuesInput() {
		return new ReturnElement(oDatePickerQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//*[contains(@id,'email') and contains(@controltype,'email')]") 

	private WebElement oEmailPickerQuesInput;

	public ReturnElement getEmailControlQuesInput() {
		return new ReturnElement(oEmailPickerQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//*[contains(@id,'name') and contains(@controltype,'name')]") 
	private WebElement oNamePickerQuesInput;

	public ReturnElement getNameControlQuesInput() {
		return new ReturnElement(oNamePickerQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@FindBy(xpath = ".//*[contains(@id,'address') and contains(@controltype,'address')]") 

	private WebElement oAddressPickerQuesInput;

	public ReturnElement getAddressPickerControlQuesInput() {
		return new ReturnElement(oAddressPickerQuesInput, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "txtQuestionText")

	private WebElement oQuestionText;

	public ReturnElement getQuestionText() {
		return new ReturnElement(oQuestionText,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	@FindBy(id = "btnPopupSave")

	private WebElement oSaveButton;

	public ReturnElement getPopupSaveButton() {
		return new ReturnElement(oSaveButton,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	@FindBy(id = "taOptionTextArea")

	private WebElement oOptionTextArea;

	public ReturnElement getOptionTextArea() {
		return new ReturnElement(oOptionTextArea,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "bntAddOptions")

	private WebElement oAddOptionsButton;

	public ReturnElement getAddOptionButton() {
		return new ReturnElement(oAddOptionsButton,
				Thread.currentThread().getStackTrace()[1].getMethodName());

	}


	@FindBy(xpath = ".//input[@name='Title']") 

	private WebElement oHideTitle;

	public ReturnElement getTitleCheckBox() {
		return new ReturnElement(oHideTitle, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(xpath = ".//input[@name='Middle Name']") 

	private WebElement oHideMiddlename;

	public ReturnElement getMiddlenameCheckBox() {
		return new ReturnElement(oHideMiddlename, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@FindBy(id = "btnSavePublish")
	private WebElement oSavePublishButton;

	public ReturnElement getSavePublishButton() {
		return new ReturnElement(oSavePublishButton, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

	@FindBy(id = "chkIsMandatory")
	private WebElement oMandatoryCheckBox;

	public ReturnElement getMandatoryCheckBox() {
		return new ReturnElement(oMandatoryCheckBox, Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}
