package e2e;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddContactPage;
import pages.ContactPage;
import pages.ContactsPage;

public class CreateNewContactAndDeleteTest extends TestBase {

    Faker faker = new Faker();
    ContactsPage contactsPage;
    AddContactPage addContactPage;
    ContactPage contactPage;

    @Test
            public void createNewContactAndDeleteTest() {


        String firstName = faker.internet().uuid();
        String lastName = faker.internet().uuid();
        String description = faker.internet().uuid();

        contactPage = new ContactPage(app.driver);
        contactPage.clickOnContactsButton();

        addContactPage = new AddContactPage(app.driver);
        addContactPage.clickOnAddContactButton();

        addContactPage.fillFirstNameForm(firstName);
        addContactPage.fillLastNameForm(lastName);
        addContactPage.fillDescriptionForm(description);
        addContactPage.clickOnAddContactButton();

        String expectedSuccessfullyAlertText = "Customer added successfully with customer id";
        String err = "Actual alert text is not contains expected alert text";
        Assert.assertTrue(addContactPage.getAlertText().contains(expectedSuccessfullyAlertText), err);
        addContactPage.applyAlert();
    }
}
