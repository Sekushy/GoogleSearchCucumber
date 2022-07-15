package org.example;

import PageObjects.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();
    GoogleSearchPage googleSearchPage;

    public StepDefinitions (){
        driver.manage().window().maximize();
        googleSearchPage = new GoogleSearchPage(driver);
    }

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        driver.get("https://www.google.com");
        googleSearchPage.setRejectAllButton();
    }
    @When("I search for {string}")
    public void i_search_for(String string) {
        googleSearchPage.searchItemInSearchBar(string);
    }
    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
