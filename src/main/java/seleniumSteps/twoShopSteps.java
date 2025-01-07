package seleniumSteps;

import SeleniumElements.twoShopElements;
import org.openqa.selenium.Keys;

public class twoShopSteps extends twoShopElements {

    public void selectHTMLBook() {
        driver.findElement(filterHTML).click();
    }

    public void selectSeleniumRubyBook() {
        driver.findElement(filterRuby).click();
    }

    public void addHTML5FormsToBassket() {
        driver.findElement(addBasketHTML).click();
    }

    public void addSeleniumRubyToBassket() {
        driver.findElement(addBasketRuby).click();
    }

//    public boolean verifyProductInBassket() {
//        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
//        WebElement productInCart = wait.until(ExpectedConditions.visibilityOfElementLocated(cartProductTitle));
//        return productInCart != null;
//    }

    public void BassketButton() {

        driver.findElement(BassketInfo).click();
    }
    public void checkOutButton() {

        driver.findElement(checkOut).click();
    }
    public void userName() {

        driver.findElement(FirstName).sendKeys("Beka");
    }
    public void userLastName() {

        driver.findElement(LastName).sendKeys("Tchitadze");
    }
    public void userCompanyName() {

        driver.findElement(CompanyName).sendKeys("BEQABEKA");
    }
    public void userEmail() {

        driver.findElement(eMailAddress).sendKeys("bekatchitadze@gmail.com");
    }
    public void userPhoneNumber() {

        driver.findElement(phoneNumber).sendKeys("598434697");
    }
    public void userCountry() {

        driver.findElement(country).click();
    }
    public void userCountryChoise() {

        driver.findElement(countryChoise).sendKeys("Georgia");
        driver.findElement(countryChoise).sendKeys(Keys.ENTER);

    }
    public void userAddress1() {

        driver.findElement(address).sendKeys("Gmir-kursantta 22");
    }
    public void userAddress2() {

        driver.findElement(address2).sendKeys("b. 120");
    }
    public void userCity() {

        driver.findElement(city).sendKeys("Tbilisi");
    }
    public void userState() {

        driver.findElement(state).sendKeys("Gldani");
    }
    public void userPostCode() {

        driver.findElement(postcode).sendKeys("0167");
    }
    public void userPayOption() {

        driver.findElement(pay).click();
    }
    public void userPayChoise() {

        driver.findElement(payOption).click();
    }
    public void authUseremail() {

        driver.findElement(authUserName).sendKeys("bekatchitadze@gmail.com");
    }
    public void authPassword() {

        driver.findElement(authPassword).sendKeys("Beqa123!@#");
    }
    public void authRemmember() {

        driver.findElement(authRemember).click();
    }
    public void LoginButton () {

        driver.findElement(LoginClick).click();
    }
    public void myAccountButton () {

        driver.findElement(MyAccount).click();
    }
    public void ordersButton () {

        driver.findElement(OrdersButton).click();
    }
    public void viewAssert () {

        driver.findElement(View).isDisplayed();
    }
    public void accountButton () {

        driver.findElement(Account).click();
    }
    public void correctName () {

        driver.findElement(correctFirstName).sendKeys("Beqa");
    }
    public void correctLastname () {

        driver.findElement(correctLastName).sendKeys("Tchitadze");
    }
    public void correctemail () {

        driver.findElement(correctEmail).sendKeys("bekatchitadze@gmail.com");
    }
    public void correctPassword () {

        driver.findElement(passwordNow).sendKeys("Beqa123!@#");
    }
    public void NewPassword1 () {

        driver.findElement(password1).sendKeys("Beqa123!@#1");
    }
    public void NewPassword2 () {

        driver.findElement(password1double).sendKeys("Beqa123!@#1");
    }
    public void SaveButton () {

        driver.findElement(saveChangeButton).click();
    }
    public void logout () {

        driver.findElement(signOut).click();
    }

}
