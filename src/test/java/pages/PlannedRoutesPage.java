package pages;

import org.openqa.selenium.WebDriver;

public class PlannedRoutesPage extends BasePage {

    public PlannedRoutesPage(WebDriver driver) {
        super(driver);
    }

    public void validatePlannedRoute() {
        //String titleText = driver.findElement(title).getText();
        //Assertions.assertEquals("Lehetséges útvonalak", titleText);
    }
}
