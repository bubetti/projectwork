package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(xpath = "//button[text()='Elfogadom']")
    private WebElement cookieButton;

    @FindBy(xpath = "//input[@placeholder='Honnan']")
    private WebElement fromField;

    @FindBy(xpath = "(//input[@placeholder='Hova'])")
    private WebElement toField;

    @FindBy(xpath = "//input[@value='Tervezés']")
    private WebElement planButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        cookieButton.click();
    }

    public void isLoaded() {
        super.isLoaded();
        Assertions.assertEquals("https://futar.bkk.hu/", driver.getCurrentUrl());
    }


    public void fillFromField(String value) {
        fromField.sendKeys(value + Keys.TAB);
    }

    public void fillToField(String value) {
        toField.sendKeys(value + Keys.TAB);
    }

    public void clickOnSearch() {
        planButton.click();
    }

    public PlannedRoutesPage plan(String from, String to) {
        fillFromField(from);
        fillToField(to);
        planButton.click();
        return new PlannedRoutesPage(driver);
    }
}
