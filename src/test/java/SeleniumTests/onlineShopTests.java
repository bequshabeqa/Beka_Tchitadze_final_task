package SeleniumTests;

import Utils.SetUpClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import seleniumSteps.onlineShopSteps;

public class onlineShopTests extends SetUpClass {

    onlineShopSteps onlineShopSteps = new onlineShopSteps();

    @BeforeSuite
    public void suit() {
        setUpGlobalWait();
    }


    @Test
    public void RegSuccessTest() {

        driver.get("https://practice.automationtesting.in/shop/");

        onlineShopSteps.emailInput("bekatchitadze@gmail.com");
        onlineShopSteps.setPassword("Beqa123!@#");
        onlineShopSteps.clickLogInButton();

    }
}
