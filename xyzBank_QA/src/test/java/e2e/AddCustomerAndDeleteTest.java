package e2e;

import com.github.javafaker.Faker;
import enums.SortDirections;
import enums.SortValues;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.CustomersPage;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerAndDeleteTest extends TestBase {
    Faker faker = new Faker();
    HomePage homePage;
    AddCustomerPage addCustomerPage;
    CustomersPage customersPage;

    @Test
    public void addCustomerAndDeleteTest() {
        String firstName = faker.internet().uuid();
        String lastName = faker.internet().uuid();
        String postCode = faker.address().zipCode();

        List<String> expectedListFirstNamesUp = new ArrayList<>();
        expectedListFirstNamesUp.add("Ron");
        expectedListFirstNamesUp.add("Neville");
        expectedListFirstNamesUp.add("Hermoine");
        expectedListFirstNamesUp.add("Harry");
        expectedListFirstNamesUp.add("Albus");

        List<String> expectedListFirstNamesDown = new ArrayList<>();
        expectedListFirstNamesDown.add("Dumbledore");
        expectedListFirstNamesDown.add("Granger");
        expectedListFirstNamesDown.add("Longbottom");
        expectedListFirstNamesDown.add("Potter");
        expectedListFirstNamesDown.add("Weasly");

        List<String> expectedListLastNamesUp = new ArrayList<>();
        expectedListFirstNamesUp.add("Weasly");
        expectedListFirstNamesUp.add("Potter");
        expectedListFirstNamesUp.add("Longbottom");
        expectedListFirstNamesUp.add("Granger");
        expectedListFirstNamesUp.add("Dumbledore");

        List<String> expectedListLastNamesDown = new ArrayList<>();
        expectedListFirstNamesDown.add("Albus");
        expectedListFirstNamesDown.add("Harry");
        expectedListFirstNamesDown.add("Hermoine");
        expectedListFirstNamesDown.add("Neville");
        expectedListFirstNamesDown.add("Ron");

        List<String> expectedListPostCodesUp = new ArrayList<>();
        expectedListFirstNamesUp.add("E55555");
        expectedListFirstNamesUp.add("E55656");
        expectedListFirstNamesUp.add("E725JB");
        expectedListFirstNamesUp.add("E859AB");
        expectedListFirstNamesUp.add("E89898");

        List<String> expectedListPostCodesDown = new ArrayList<>();
        expectedListFirstNamesDown.add("E89898");
        expectedListFirstNamesDown.add("E859AB");
        expectedListFirstNamesDown.add("E725JB");
        expectedListFirstNamesDown.add("E55656");
        expectedListFirstNamesDown.add("E55555");

        homePage = new HomePage(app.driver);
        homePage.clickOnBankManagerLoginButton();

        addCustomerPage = new AddCustomerPage(app.driver);
        addCustomerPage.openAddCustomerTab();

        addCustomerPage.fillFirstNameField(firstName);
        addCustomerPage.fillLastNameField(lastName);
        addCustomerPage.fillPostCodeField(postCode);
        addCustomerPage.clickOnAddCustomerButton();

        String expectedSuccessfullyAlertText = "Customer added successfully with customer id";
        String err = "Actual alert text is not contains expected alert text";
        Assert.assertTrue(addCustomerPage.getAlertText().contains(expectedSuccessfullyAlertText), err);
        addCustomerPage.applyAlert();

        customersPage = new CustomersPage(app.driver);
        customersPage.openCustomerTab();
        customersPage.filterCustomer(firstName);

        Assert.assertEquals(customersPage.makeCellLocator(firstName).getText(), firstName, "First name is not equals");
        Assert.assertEquals(customersPage.makeCellLocator(lastName).getText(), lastName, "Last name is not equals");
        Assert.assertEquals(customersPage.makeCellLocator(postCode).getText(), postCode, "Post code is not equals");
        Assert.assertEquals(customersPage.countRows(), 1, "Count rows is not equals should be 1 row");

        customersPage.deleteTableRow(firstName);
        customersPage.clearFilterCustomer();
        customersPage.filterCustomer(firstName);
        Assert.assertEquals(customersPage.countRows(), 0, "Count rows is not equals should be 0 row");

        customersPage.clearFilterCustomer();
        customersPage.clickOnSortLink(SortValues.fName);
        customersPage.checkSortDirection(SortDirections.up);
        List<String> actualListFirstNameColumnUp = customersPage.getTextFromCellFirstNameColumn();
        Assert.assertEquals(actualListFirstNameColumnUp, expectedListFirstNamesUp, "Actual list with all cells column First name is not equals expected");

        customersPage.clickOnSortLink(SortValues.fName);
        customersPage.checkSortDirection(SortDirections.down);
        List<String> actualListFirstNameColumnDown = customersPage.getTextFromCellFirstNameColumn();
        Assert.assertEquals(actualListFirstNameColumnDown, expectedListFirstNamesDown, "Actual list with all cells column First name is not equals expected");

        customersPage.clearFilterCustomer();
        customersPage.clickOnSortLink(SortValues.lName);
        customersPage.checkSortDirection(SortDirections.up);
        List<String> actualListLastNameColumnUp = customersPage.getTextFromCellLastNameColumn();
        Assert.assertEquals(actualListLastNameColumnUp, expectedListLastNamesUp, "Actual list with all cells column Last name is not equals expected");

        customersPage.clickOnSortLink(SortValues.lName);
        customersPage.checkSortDirection(SortDirections.down);
        List<String> actualListLastNameColumnDown = customersPage.getTextFromCellLastNameColumn();
        Assert.assertEquals(actualListLastNameColumnDown, expectedListLastNamesDown, "Actual list with all cells column Last name is not equals expected");

        customersPage.clearFilterCustomer();
        customersPage.clickOnSortLink(SortValues.postCd);
        customersPage.checkSortDirection(SortDirections.up);
        List<String> actualListPostCodeColumnUp = customersPage.getTextFromCellPostCodeColumn();
        Assert.assertEquals(actualListPostCodeColumnUp, expectedListPostCodesUp, "Actual list with all cells column Post Code is not equals expected");

        customersPage.clickOnSortLink(SortValues.postCd);
        customersPage.checkSortDirection(SortDirections.down);
        List<String> actualListPostCodeColumnDown = customersPage.getTextFromCellPostCodeColumn();
        Assert.assertEquals(actualListPostCodeColumnDown, expectedListPostCodesDown, "Actual list with all cells column Post Code is not equals expected");

        customersPage.clickOnSortLink(SortValues.lName);
        customersPage.checkSortDirection(SortDirections.up);

        customersPage.clickOnSortLink(SortValues.lName);
        customersPage.checkSortDirection(SortDirections.down);

        customersPage.clickOnSortLink(SortValues.postCd);
        customersPage.checkSortDirection(SortDirections.up);

        customersPage.clickOnSortLink(SortValues.postCd);
        customersPage.checkSortDirection(SortDirections.down);
    }
}