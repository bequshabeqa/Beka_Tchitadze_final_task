package SeleniumTests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import seleniumSteps.onlineShopSteps;
import seleniumSteps.twoShopSteps;

public class twoShopTest extends twoShopSteps {

    twoShopSteps twoShopSteps = new twoShopSteps();

    @BeforeSuite
    public void suit() {
        setUpGlobalWait();
    }

    @Test
    public void TwoShopSuccessTest() {

        driver.get("https://practice.automationtesting.in/shop/");


    }
}
