package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(xpath = "(//*[@class='planner-from-to'])[1]")
    private WebElement fromField;

    @FindBy(xpath = "(//*[@class='planner-from-to'])[2]")
    private WebElement toField;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void fillFrom(String from) {
        fromField.sendKeys(from);
    }

    public void fillTo (String to) {
        toField.sendKeys(to);
    }
}
