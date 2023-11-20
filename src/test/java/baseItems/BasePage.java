package baseItems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @FindBy(xpath = "//span[@class='title']")
    WebElement pageTitle;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        PageFactory.initElements(driver, this);
    }

    public boolean isLoaded(String expectedTitle) {
        return driver.getTitle().equals(expectedTitle);
    }

    public boolean isPageTitleCorrect(String expectedTitle) {
        return pageTitle.getText().equals(expectedTitle);
    }
}
