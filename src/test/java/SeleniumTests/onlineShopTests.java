package SeleniumTests;

import Utils.SetUpClass;
import com.codeborne.selenide.conditions.Visible;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import seleniumSteps.onlineShopSteps;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class onlineShopTests extends SetUpClass {

    onlineShopSteps onlineShopSteps = new onlineShopSteps();

    @BeforeSuite
    public void suit() {
        setUpGlobalWait();
    }


    @Test
    public void RegSuccessTest() {

        driver.get("https://practice.automationtesting.in/shop/");

        onlineShopSteps.dropDownButton();
        onlineShopSteps.priceSort();
        onlineShopSteps.PriceSorts();
        onlineShopSteps.filterOfJS();
//        onlineShopSteps.filterByJS();
        boolean areJavaScriptBooksDisplayed = onlineShopSteps.verifyJavaScriptBooks();
        assertTrue(areJavaScriptBooksDisplayed, "No JavaScript books were found after applying the filter.");
//        onlineShopSteps.applyPriceFilter(300);
        boolean isOnlyOneProductDisplayed = onlineShopSteps.verifySingleProductDisplayed();
//        assertTrue(isOnlyOneProductDisplayed, "More than one product was displayed after applying the price filter.");

        onlineShopSteps.BasketInfo();
        onlineShopSteps.addProductToCart();
        boolean isCartUpdated = onlineShopSteps.isCartUpdated();
        assertTrue(isCartUpdated, "The cart icon did not update after adding the product.");

        onlineShopSteps.addProductToCart();
        boolean isProductInCart = onlineShopSteps.verifyProductInCart();
        assertTrue(isProductInCart, "The product is not found in the cart.");

        onlineShopSteps.addProductToCart();
        onlineShopSteps.removeProductFromCart();
        boolean isCartEmpty = onlineShopSteps.isCartEmpty();
        assertTrue(isCartEmpty, "The cart is not empty after removing the product.");



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
