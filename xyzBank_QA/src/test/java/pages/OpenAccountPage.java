package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage extends BankManagerLoginPage {
    public OpenAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='userSelect']")
    WebElement customerNameDropdown;

    @FindBy(xpath = "//*[@id='currency']")
    WebElement currencyDropdown;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement processButtonDropdown;

    public void customerName(String expectedFirstAndLastName) {
        Select select = new Select(customerNameDropdown);
        select.selectByVisibleText(expectedFirstAndLastName);
    }

    public void currency(String ) {
        Select select = new Select(currencyDropdown);
        select.selectByVisibleText();
    }

    public void processButton(String ) {
        Select select = new Select(processButtonDropdown);
        select.selectByVisibleText();
    }
}