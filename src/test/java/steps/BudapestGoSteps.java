package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

import static pages.BasePage.driver;


public class BudapestGoSteps {

    @BeforeAll
    public static void setup (){
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
    }

    @AfterAll
    public static void cleanup(){
        driver.quit();
    }

    @Given("I open BudapestGO website")
    public void iOpenBudapestGOWebsite() {
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
    }

    @When("I search for {string} as Start Location")
    public void iSearchForStartLocation (String arg0) {
    }

    @And("I search for {string} as End Location")
    public void iSearchForEndLocation (String arg0) {
    }

    @And("I click on the Search button")
    public void iClickOnTheSearchButton() {
    }

    @Then("possible routes should be displayed")
    public void possibleRoutesShouldBeDisplayed() {
    }
}
