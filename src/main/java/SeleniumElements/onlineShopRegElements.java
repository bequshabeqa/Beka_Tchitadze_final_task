package SeleniumElements;

import org.openqa.selenium.By;

public class onlineShopRegElements {

        public By emailInput = By.id("username");

        public By passwordInput = By.id("password");

        public By logInButton = By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]");

        public By flashMessage;
        public By SuccessMessage;
}
