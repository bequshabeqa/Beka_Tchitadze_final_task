package seleniumSteps;


import SeleniumElements.onlineShopRegElements;
import org.testng.Assert;

import static Utils.SetUpClass.driver;
import static Utils.SetUpClass.findElement;

public class onlineShopRegSteps extends onlineShopRegElements {

    public void emailInput (String email) {

        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword (String password) {

        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogInButton() {
        driver.findElement(logInButton).click();

    }

    public void checkFlashMessageErrorText(String errorText) {
        Assert.assertTrue(findElement(flashMessage).getText().contains(errorText));
    }
    public void checkSuccessMessageText(String SuccessText) {
        Assert.assertTrue(findElement(SuccessMessage).getText().contains(SuccessText));
    }
}
