package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageBase {



    public ContactPage(WebDriver driver) {

        super(driver);

    }
    @FindBy(xpath = "//a[contains(@href, '/contacts')]")
    WebElement newContactButton;
    public void clickOnNewContactButton() {
        click(newContactButton);
    }

}
