package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    public WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@href='/' and @class='nav-link']")
    WebElement contactsButton;

    public void click(WebElement element) {
        element.isDisplayed();
        element.click();
    }

    public void clickOnContactsButton() {
        click(contactsButton);
    }
}
