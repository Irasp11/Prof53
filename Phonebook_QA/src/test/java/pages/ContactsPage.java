package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends PageBase {

    public ContactsPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//*[@id='input-search-contact']")
    WebElement searchContactInputField;

    public String findContact() {
        return driver.findElements(By.xpath(" ")).toString();
    }
}

