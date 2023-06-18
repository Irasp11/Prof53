package e2e;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected static ApplicationContact app = new ApplicationContact();

    @BeforeMethod
    public void setupTest() {

        app.init();
    }

    @AfterMethod
    public void tearDown() {

        app.stop();
    }
}