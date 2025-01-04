package seleniumSteps;

import SeleniumElements.onlineShopElements;

import static Utils.SetUpClass.findElement;

public class onlineShopSteps extends onlineShopElements {

    public void emailInput (String email) {

        findElement(emailInput).sendKeys(email);
    }
}
