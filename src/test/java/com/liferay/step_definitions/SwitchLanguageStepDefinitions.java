package com.liferay.step_definitions;

import com.liferay.pages.FormPage;
import com.liferay.utilities.BrowserUtils;
import com.liferay.utilities.ConfigurationReader;
import com.liferay.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SwitchLanguageStepDefinitions {

    @Given("the user is on the form page")
    public void the_user_is_on_the_form_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user clicks language logo")
    public void the_user_clicks_language_logo() {
        new FormPage().languageLogo.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks Portuguese option")
    public void the_user_clicks_Portuguese_option() {
        new FormPage().languagePopUp.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the language of the form page should be Portuguese")
    public void the_language_of_the_form_page_should_be_Portuguese() {
        String expectedLanguage = "pt-BR";
        String actualLanguage = new FormPage().languageAbbreviation.getText();
        Assert.assertEquals(expectedLanguage, actualLanguage);
    }

    @Given("the user is on the Portugurse form page")
    public void the_user_is_on_the_Portugurse_form_page() {
        Driver.get().get("https://forms.liferay.com/web/forms/shared/-/form/122548?p_p_state=pop_up&p_p_auth=IyET9bn4&_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_languageId=pt_BR");
    }

    @When("the user clicks English option")
    public void the_user_clicks_English_option() {
        new FormPage().languagePopUp.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the language of the form page should be English")
    public void the_language_of_the_form_page_should_be_English() {
        String expectedLanguage = "en-US";
        String actualLanguage = new FormPage().languageAbbreviation.getText();
        Assert.assertEquals(expectedLanguage, actualLanguage);
    }

}
