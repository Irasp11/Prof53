package HomeworkQA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=defaultRegisterFormEmail]")
    WebElement emailInput;

    @FindBy(xpath = "//*[@id=login-form]/div[2]/div[1]/div/input")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@class='nav-link' and @href='/contacts']")
    WebElement addNewContactButton;

    public void clickOnEmailInput() {
        click(emailInput);
    }

    public void clickOnPasswordInput() {
        click(passwordInput);
    }

    public void clickOnLoginButton() {

        click(addNewContactButton);
    }


}