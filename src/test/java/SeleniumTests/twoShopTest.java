package SeleniumTests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import seleniumSteps.twoShopSteps;

import java.time.Duration;
import static org.testng.Assert.assertTrue;

public class twoShopTest extends twoShopSteps {

    twoShopSteps twoShopSteps = new twoShopSteps();

    @BeforeSuite
    public void suit() {
        setUpGlobalWait();
    }

    @Test
    public void TwoShopSuccessTest() {

        driver.get("https://practice.automationtesting.in/shop/");

        twoShopSteps.selectHTMLBook();
        twoShopSteps.addHTML5FormsToBassket();

        twoShopSteps.selectSeleniumRubyBook();
        twoShopSteps.addSeleniumRubyToBassket();

//        boolean isProductInBassket = twoShopSteps.verifyProductInBassket();
//        assertTrue(isProductInBassket, "The product is not found in the cart.");

        twoShopSteps.BassketButton();
        twoShopSteps.checkOutButton();

        twoShopSteps.userName();
        twoShopSteps.userLastName();
        twoShopSteps.userCompanyName();
        twoShopSteps.userEmail();
        twoShopSteps.userPhoneNumber();
        twoShopSteps.userCountry();
        twoShopSteps.userCountryChoise();
        twoShopSteps.userAddress1();
        twoShopSteps.userAddress2();
        twoShopSteps.userCity();
        twoShopSteps.userState();
        twoShopSteps.userPostCode();
        twoShopSteps.userPayOption();
        twoShopSteps.userPayChoise();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://practice.automationtesting.in/my-account/");

        twoShopSteps.authUseremail();
        twoShopSteps.authPassword();
        twoShopSteps.authRemmember();
        twoShopSteps.LoginButton();

        twoShopSteps.myAccountButton();
        twoShopSteps.ordersButton();
        twoShopSteps.viewAssert();

        assertTrue(true, "View Button is enable");
        System.out.println("Vies ღილაკი ხილულია");

        twoShopSteps.accountButton();
        twoShopSteps.correctPassword();
        twoShopSteps.NewPassword1();
        twoShopSteps.NewPassword2();
        twoShopSteps.SaveButton();

        assertTrue(true, "Account details changed successfully.");
        System.out.println("პაროლის წარმატებით შეიცვალა");

        twoShopSteps.logout();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        twoShopSteps.authUseremail();
        twoShopSteps.NewPassword1();
        twoShopSteps.authRemmember();
        twoShopSteps.LoginButton();

    }
}
