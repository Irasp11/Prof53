package e2e;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AddContactPage;
import pages.ContactPage;


public class CreateNewContactAndLoginTest extends TestBase {

    Faker faker = new Faker();
    ContactPage contactPage;
    AddContactPage addContactPage;


    @Test
    public void createNewContactAndLoginTest() {
        String firstName = faker.internet().uuid();
        String lastName = faker.internet().uuid();
        String description = faker.internet().uuid();
        String expectedFirstAndLastName = firstName + " " + lastName;

        contactPage = new ContactPage(app.driver);
        contactPage.clickOnNewContactButton();
        addContactPage = new AddContactPage(app.driver);
//        homePage.clickOnEmailInput();
//        homePage.clickOnPasswordInput();
//        homePage.clickOnDescriptionInput();
        app.driver.switchTo().alert().accept();
        WebElement addNewContactButton = app.driver.findElement(By.xpath("//a[contains(@href, '/contacts')]"));
        Select select = new Select(addNewContactButton);
        select.selectByVisibleText(expectedFirstAndLastName);

        contactPage.clickOnContactsButton();
    }
}