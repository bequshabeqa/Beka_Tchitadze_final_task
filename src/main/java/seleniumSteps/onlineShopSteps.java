package seleniumSteps;

import SeleniumElements.onlineShopElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utils.SetUpClass.driver;


public class onlineShopSteps extends onlineShopElements {

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void dropDownButton () {

        driver.findElement(dropDown).click();
    }
    public void priceSort () {

        driver.findElement(priceValue).click();
    }
    public void PriceSorts () {

        driver.findElement(sortOfPrice).click();
    }

    public void filterOfJS () {

        driver.findElement(filter);
    }
//    public void filterByJS() {
//        wait.until(ExpectedConditions.elementToBeClickable(filterJS)).click();
//    }

//    public void applyPriceFilter(int minPrice) {
//        WebElement minPriceInputElement = (WebElement) ExpectedConditions.visibilityOfElementLocated(minPriceInput);
//        minPriceInputElement.clear();
//        minPriceInputElement.sendKeys(String.valueOf(minPrice));
//
//        WebElement maxPriceInputElement = (WebElement) ExpectedConditions.visibilityOfElementLocated(maxPriceInput);
//        maxPriceInputElement.clear();
//
//        WebElement filterButtonElement = (WebElement) ExpectedConditions.elementToBeClickable(filterButton);
//        filterButtonElement.click();
//    }
    public boolean verifyJavaScriptBooks() {
        return driver.findElements(jsBooksTitle).size() > 0;
    }
    public boolean verifySingleProductDisplayed() {
        return driver.findElements(productTitles).size() == 1;
    }
    public void BasketInfo () {

        driver.findElement(addBasket).click();
    }
    public void addProductBassket() {
        driver.findElement(addBasket).click();
    }
    public boolean isCartUpdated() {
        WebElement cartIconElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartIcon));
        return !cartIconElement.getText().isEmpty();
    }
    public boolean verifyProductInCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
        WebElement productInCart = wait.until(ExpectedConditions.visibilityOfElementLocated(cartProductTitle));
        return productInCart != null;
    }
    public void removeProductFromCart() {
        WebElement removeButton = wait.until(ExpectedConditions.elementToBeClickable(removeProductButton));
        removeButton.click();
    }
    public boolean isCartEmpty() {
        return driver.findElements(cartProductTitle).size() == 0;
    }

}
