package com.liferay.pages;

import com.liferay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    public FormPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_kldx___menu")
    public WebElement languageLogo;

    @FindBy(css = "span.taglib-text-icon")
    public WebElement languagePopUp;

    @FindBy(xpath = "//span[@class='btn-section']")
    public WebElement languageAbbreviation;

    @FindBy(css = "input.ddm-field-text.form-control")
    public WebElement nameInputBox;

    @FindBy(xpath = "(//input[@data-onblur='null'])[2]")
    public WebElement dateOfBirthPanel;

    @FindBy(css = "textarea.ddm-field-text.form-control")
    public WebElement commentInputBox;

    @FindBy(css = "button.btn.btn-primary.lfr-ddm-form-submit.pull-right")
    public WebElement submitButton;

    @FindBy(xpath = "(//div[@class='form-feedback-group'])[1]")
    public WebElement nameRequiredMessage;

}
