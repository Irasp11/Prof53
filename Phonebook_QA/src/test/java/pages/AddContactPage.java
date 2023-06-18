package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContactPage extends ContactPage{
    public AddContactPage(WebDriver driver) {
        super(driver);

    }

        @FindBy(xpath = "//*[@id='form-name']")
        WebElement firstNameForm;

        @FindBy(xpath = "//*[@id='form-lastName']")
        WebElement lastNameForm;

        @FindBy(xpath = "//*[@id='form-about']")
        WebElement descriptionForm;

        @FindBy(xpath = "//a[contains(@href, '/contacts')]")
        WebElement addNewContactButton;

        public void fillFirstNameForm(String firstName) {

            firstNameForm.sendKeys(firstName);
        }

        public void fillLastNameForm(String lastName) {
            lastNameForm.sendKeys(lastName);
        }

        public void fillDescriptionForm(String description) {
            descriptionForm.sendKeys(description);
        }

        public void clickOnAddContactButton() {

            click(addNewContactButton);
    }
        public String getAlertText() {

            return driver.switchTo().alert().getText();
    }
        public void applyAlert() {
            driver.switchTo().alert().accept();
    }
}
