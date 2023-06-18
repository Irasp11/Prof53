package e2e;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ApplicationContact {
    public WebDriver driver;

    public void init() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://phonebook.telran-edu.de:8080/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void stop() {

        driver.quit();
    }

}