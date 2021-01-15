package com.liferay.step_definitions;

import com.liferay.pages.FormPage;
import com.liferay.pages.InformationSentPage;
import com.liferay.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SubmitFormStepDefinitions {

    @When("the user enters {string} {string} {string}")
    public void the_user_enters(String name, String dateOfBirth, String comment) {
            new FormPage().nameInputBox.sendKeys(name);
            BrowserUtils.waitFor(2);
            new FormPage().nameInputBox.sendKeys(Keys.TAB);
            new FormPage().dateOfBirthPanel.sendKeys(dateOfBirth);
            BrowserUtils.waitFor(2);
            new FormPage().dateOfBirthPanel.sendKeys(Keys.TAB);
            new FormPage().commentInputBox.sendKeys(comment);
            BrowserUtils.waitFor(2);

    }

    @When("the user clicks submit button")
    public void the_user_clicks_submit_button() {
        new FormPage().submitButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Information sent page should be open")
    public void information_sent_page_should_be_open() {
        String expectedPageHeader = "Information sent";
        String actualPageHeader = new InformationSentPage().pageHeader.getText();
        Assert.assertEquals(expectedPageHeader, actualPageHeader);
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedMessage) {
        String actualMessage = new InformationSentPage().successfullMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Then("{string} message should be displayed under the empty input box")
    public void message_should_be_displayed_under_the_empty_input_box(String expectedMessage) {
        Boolean flag = true;
        String actualMessage = new FormPage().nameRequiredMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
