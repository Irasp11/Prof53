package e2e;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ADDCustomerAndLoginTest extends TestBase {
    Faker faker = new Faker();
    HomePage homePage;

    @Test
    public void addCustomerAndLogin() {
        String firstName = faker.internet().uuid();
        String lastName = faker.internet().uuid();
        String postCode = faker.address().zipCode();
        String expectedFirstAndLastName = firstName + " " + lastName;
        homePage = new HomePage(app.driver);
        // Click on Bank Manager Login Button
        homePage.click(By.xpath("//*[@ng-click='manager()']"));
        // Click on Add Customer Button
        homePage.clickOnBankManagerLoginButton();
        // Fill Add customer form
        app.driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
        app.driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
        app.driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(postCode);
        // Click on Submit Button
        homePage.click(By.xpath("//button[@type='submit']"));
        // Verify Customer is added successfully (take alert text)
        String actualSuccessfullyAlertText = app.driver.switchTo().alert().getText();
        String expectedSuccessfullyAlertText = "Customer added successfully with customer id";
        String err = "Actual alert text is not contains expected alert text";
        Assert.assertTrue(actualSuccessfullyAlertText.contains(expectedSuccessfullyAlertText), err);
        app.driver.switchTo().alert().accept();
        // Click on Home button
        homePage.clickOnHomeButton();
        // Click on Customer Login Button
        homePage.clickOnCustomerLoginButton();
        // Choose customer from the dropdown
        WebElement customerDropdown = app.driver.findElement(By.xpath("//*[@ng-model='custId']"));
        Select select = new Select(customerDropdown);
        select.selectByVisibleText(expectedFirstAndLastName);
        // Click on Login Button
        homePage.click(By.xpath("//button[@type='submit']"));
        // Verify correct customer is logged in (take text from the page)
        String firstNameAndLastName = app.driver.findElement(By.xpath("//*[@class='fontBig ng-binding']")).getText();
        err = "Actual first name and last name is not equal expected";
        Assert.assertEquals(firstNameAndLastName, expectedFirstAndLastName, err);
    }
}

//        public void firstTest() throws InterruptedException {
//        WebElement managerLoginButton = driver.findElement(By.xpath("//*[@ng-click='customer()']"));
//        managerLoginButton.isDisplayed();
////        Thread.sleep(3000);
//        managerLoginButton.click();
//        driver.findElement(By.id("notch"));
//        driver.findElement(By.tagName("button"));
//        driver.findElement(By.name("email"));
//        driver.findElement(By.className("center"));
//        driver.findElement(By.linkText("/user/registration"));
//        driver.findElement(By.cssSelector("[ng-click='manager()']"));
//        driver.findElement(By.cssSelector("[type='email']"));
//        driver.findElement(By.cssSelector("[name='email]"));
//        driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg"));
//        driver.findElement(By.cssSelector("[ng-click=showCust()]"));
//        driver.findElement(By.xpath("//*[@class='center']//*[@ng-click='openAccount()']"));
////        driver.quit(); // закрывает браузер
////        driver.close(); - закрывает текущую вкладку
//
//        driver.findElement(By.id("registration-form"));
//        driver.findElement(By.tagName("button"));
//        driver.findElement(By.name("password"));
//        driver.findElement(By.className("center"));
//        driver.findElement(By.linkText(""));
//        driver.findElement(By.cssSelector("[type='password']"));
//        driver.findElement(By.cssSelector("[name='password']"));
//        driver.findElement(By.cssSelector("confirm_password"));
//        driver.findElement(By.cssSelector("submit"));
//        driver.findElement(By.cssSelector(""));
//        driver.findElement(By.xpath(""));


