package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static final String BUDAPEST_GO_UTAZASTERVEZO = "BudapestGO Utazástervező";
    public static WebDriver driver;
    public static WebDriverWait wait;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void isLoaded() {

        wait.until(ExpectedConditions.titleIs(BUDAPEST_GO_UTAZASTERVEZO));
    }
}

