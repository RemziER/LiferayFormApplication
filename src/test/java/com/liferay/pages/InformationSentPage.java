package com.liferay.pages;

import com.liferay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationSentPage {

    public InformationSentPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h5")
    public WebElement successfullMessage;

    @FindBy(xpath = "//h1")
    public WebElement pageHeader;
}
