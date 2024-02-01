package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I scroll down to footer")
    public void iScrollDownToFooter() {
        new HomePage().scrollDownToFooter();
    }

    @Then("I should be able to see a privacy policy text {string}")
    public void iShouldBeAbleToSeeAPrivacyPolicyText(String text) {
        Assert.assertEquals(new HomePage().verifyPrivacyPolicyText(), text, "Incorrect Text");
    }

    @And("I click on privacy policy button")
    public void iClickOnPrivacyPolicyButton() {
        new HomePage().clickOnPrivacyPolicy();
    }

    @Then("I should navigate to the {string} page")
    public void iShouldNavigateToThePage(String url) {
        new HomePage().navigateToPrivacyPolicyPage(url);
    }

    @Then("I should get a {string} title")
    public void iShouldGetATitle(String title) {
        Assert.assertEquals(new HomePage().verifyTheTitleText(), title, "Incorrect Title");
    }
}
