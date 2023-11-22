package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.PlannedRoutesPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class BudapestGoSteps {

    protected static WebDriver driver;
    private static MainPage mainPage;
    private static PlannedRoutesPage plannedRoutesPage;

    // Selenium Webdriver elindítása
    @BeforeAll
    public static void setup() {
        // set chrome options

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        // init driver
        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().setSize(new Dimension(900, 900));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        plannedRoutesPage = new PlannedRoutesPage(driver);
    }

    @AfterAll
    public static void cleanup() {
        driver.quit();
    }

    @Given("I open BudapestGO website")
    public void iOpenBudapestGO() throws InterruptedException {
        driver.get("https://futar.bkk.hu/");
        mainPage.isLoaded();
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        By cookieButton = By.xpath("//button[text()='Elfogadom']");
        driver.findElement(cookieButton).click();
    }

    @When("I search for {string} as start location")
    public void iSearchForStartLocation(String startLocation) {
        By startLocationField = By.xpath("//input[@placeholder='Honnan']");
        driver.findElement(startLocationField).sendKeys(startLocation + Keys.TAB);
    }

    @And("I search for {string} as destination")
    public void iSearchForEndLocation(String destination) {
        By destinationLocationField = By.xpath("//input[@placeholder='Hova']");
        driver.findElement(destinationLocationField).sendKeys(destination + Keys.TAB);
    }

    @And("I click on the Search button")
    public void iClickOnTheSearchButton() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("possible routes should be displayed")
    public void possibleRoutesShouldBeDisplayed() {
        By title = By.tagName("h2");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(title, "Lehetséges útvonalak"));
    }
}
