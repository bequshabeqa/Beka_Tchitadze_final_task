package SeleniumElements;

import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

public class onlineShopElements {

    public By dropDown = By.name("orderby");

    public By priceValue = By.xpath("//*[@id=\"content\"]/form/select/option[5]");

    public By sortOfPrice = new ByAttribute("class", "products masonry-done");

    public By filter = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[3]/a");

    public By minPriceInput = By.id("min_price");

    public By maxPriceInput = By.id("max_price");

    public By filterButton = By.xpath("//button[contains(text(), 'Filter')]");

    public By productTitles = By.className("product");

    public By jsBooksTitle = By.xpath("//h3[contains(text(), 'JavaScript')]");

    public By filterJS = By.xpath("//a[text()='JavaScript']");

    public By addBasket = By.xpath("//*[@id=\"content\"]/ul/li/a[2]");

    public By cartIcon = By.xpath("//a[contains(@class, 'cart-contents')]");

    public By cartProductTitle = By.xpath("//td[@class='product-name']//a");

    public By removeProductButton = By.xpath("//a[@class='remove']");
}
