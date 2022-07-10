package com.project.step_definitions;

import com.project.pages.GooglePages;
import com.project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {
    GooglePages googlePages = new GooglePages();

    @Given("go to google")
    public void go_to_google() {
       Driver.getDriver().get("https://www.google.com/");
    }

    @When("click the Stores")
    public void click_the_stores() {
        googlePages.store.click();
    }

    @Then("Check the title")
    public void check_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google Store for Google Made Devices & Accessories";
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.closeBrowser();
    }

}
