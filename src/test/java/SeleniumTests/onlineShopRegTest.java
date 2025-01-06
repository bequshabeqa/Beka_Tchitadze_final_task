package SeleniumTests;

import Utils.SetUpClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import seleniumSteps.onlineShopRegSteps;

public class onlineShopRegTest extends SetUpClass {

    onlineShopRegSteps onlineShopRegSteps = new onlineShopRegSteps();

    @BeforeSuite
    public void suit() {
        setUpGlobalWait();
    }


    @Test
    public void RegSuccessTest() {

        driver.get("https://practice.automationtesting.in/my-account/");

        onlineShopRegSteps.emailInput("bekatchitadze@gmail.com");
        onlineShopRegSteps.setPassword("Beqa123!@#");
        onlineShopRegSteps.clickLogInButton();

    }
}