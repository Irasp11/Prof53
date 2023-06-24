package e2e;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.AddCustomerPage;
import pages.CustomerLoginPage;
import pages.HomePage;

public class AddCustomerAndLoginTest extends TestBase {
    Faker faker = new Faker();
    HomePage homePage;
    AddCustomerPage addCustomerPage;
    CustomerLoginPage customerLoginPage;
    AccountPage accountPage;

    @Test
    public void addCustomerAndLogin() {
        String firstName = faker.internet().uuid();
        String lastName = faker.internet().uuid();
        String postCode = faker.address().zipCode();
        String expectedFirstAndLastName = firstName + " " + lastName;
        homePage = new HomePage(app.driver);
        // Click on Bank Manager Login Button
        homePage.clickOnBankManagerLoginButton();
        // Click an Add Customer Tab
        addCustomerPage = new AddCustomerPage(app.driver);
        addCustomerPage.openAddCustomerTab();
        // Fill Add customer form
        addCustomerPage.fillFirstNameField(firstName);
        addCustomerPage.fillLastNameField(lastName);
        addCustomerPage.fillPostCodeField(postCode);
        // Click on Submit Button
        addCustomerPage.clickOnAddCustomerButton();
        // Verify Customer is added successfully (take alert text)
        String expectedSuccessfullyAlertText = "Customer added successfully with customer id";
        String err = "Actual alert text is not contains expected alert text";
        Assert.assertTrue(addCustomerPage.getAlertText().contains(expectedSuccessfullyAlertText), err);
        addCustomerPage.applyAlert();
        // Click on Home button
        homePage.clickOnHomeButton();
        // Click on Customer Login Button
        homePage.clickOnCustomerLoginButton();
        // Choose customer from the dropdown
        customerLoginPage = new CustomerLoginPage(app.driver);
        customerLoginPage.selectCustomerName(expectedFirstAndLastName);
        // Click on Login Button
        customerLoginPage.clickOnLoginButton();
        // Verify correct customer is logged in (take text from the page)
        accountPage = new AccountPage(app.driver);
        err = "Actual first name and last name is not equal expected";
        Assert.assertEquals(accountPage.getCustomerFirstAndLastName(), expectedFirstAndLastName, err);

    }

    @Test
    public void addCustomerWithInvalidData() {
        String firstName = " ";
        String lastName = " ";
        String postCode = " ";

        homePage = new HomePage(app.driver);
        // Click on Bank Manager Login Button
        homePage.clickOnBankManagerLoginButton();
        // Click an Add Customer Tab
        addCustomerPage = new AddCustomerPage(app.driver);
        addCustomerPage.openAddCustomerTab();
        // Fill Add customer form
        addCustomerPage.fillFirstNameField(firstName);
        addCustomerPage.fillLastNameField(lastName);
        addCustomerPage.fillPostCodeField(postCode);
        // Click on Submit Button
        addCustomerPage.clickOnAddCustomerButton();
        // Verify Customer is added successfully (take alert text)
        String expectedUnSuccessfullyAlertText = "Please check the details. Customer may be duplicate.";
        String err = "Actual alert text is not contains expected alert text";
        Assert.assertTrue(addCustomerPage.getAlertText().contains(expectedUnSuccessfullyAlertText), err);
        addCustomerPage.applyAlert();


    }
}



