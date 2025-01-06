package SeleniumElements;

import Utils.SetUpClass;
import org.openqa.selenium.By;

public class twoShopElements extends SetUpClass {

    public By filterHTML = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[2]/a");

    public By addBasketHTML = By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]");

    public By filterRuby = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[4]/a");

    public By addBasketRuby = By.xpath("//*[@id=\"content\"]/ul/li/a[2]");

    public By cartIcon = By.xpath("//a[contains(@class, 'cart-contents')]");

    public By cartProductTitle = By.xpath("//td[@class='product-name']//a");

    public By BassketInfo = By.xpath("//*[@id=\"wpmenucartli\"]/a");

    public By checkOut = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a");

    public By FirstName = By.id("billing_first_name");

    public By LastName = By.id("billing_last_name");

    public By CompanyName = By.id("billing_company");

    public By eMailAddress = By.id("billing_email");

    public By phoneNumber = By.id("billing_phone");

    public By country = By.id("s2id_billing_country");

    public By countryChoise = By.id("s2id_autogen1_search");

    public By address = By.id("billing_address_1");

    public By address2 = By.id("billing_address_2");

    public By city = By.id("billing_city");

    public By state = By.id("billing_state");

    public By postcode = By.id("billing_postcode");

    public By pay = By.id("payment_method_cod");

    public By payOption = By.id("place_order");

    public By authUserName = By.id("username");

    public By authPassword = By.id("password");

    public By authRemember = By.id("rememberme");

    public By LoginClick =By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");

    public By MyAccount = By.id("menu-item-50");

    public By orders = By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a");

    public By View = By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/table/tbody/tr/td[5]/a");

    public By Account = By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a");

    public By correctFirstName = By.id("account_first_name");

    public By correctLastName = By.id("account_last_name");

    public By correctEmail = By.id("account_email");

    public By passwordNow = By.id("password_current");

    public By password1 = By.id("password_1");

    public By password1double = By.id("password_2");

    public By saveChangeButton = By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[4]/input[3]");

    public By signOut = By.xpath("//*[@id=\"page-36\"]/div/div[1]/div[2]/p[1]/a");

}