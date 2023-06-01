//package HomeworkQA.e2e;
//
//import com.github.javafaker.Faker;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//import pages.HomePage;
//
//public class CreateNewContact extends TestBase {
//
//    Faker faker = new Faker();
//
//    HomePage homePage;
//
//    @Test
//    public void addNewContact() {
//        String firstName = faker.internet().uuid();
//        String lastName = faker.internet().uuid();
//        String description = faker.internet().uuid();
//        String expectedFirstAndLastName = firstName + " " + lastName;
//        homePage = new HomePage(app.driver);
//        homePage.clickOnEmailInput();
//        homePage.clickOnPasswordInput();
//        app.driver.switchTo().alert().accept();
//        WebElement addNewContactDropdown = app.driver.findElement(By.xpath("//*[@]"));
//        Select select = new Select(addNewContactDropdown);
//        select.selectByVisibleText(expectedFirstAndLastName);
//    }
//}
