package SelenideElements;

import SelenideSteps.HotelSteps;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class HotelTest {

    HotelSteps hotelSteps = new HotelSteps();

    @BeforeMethod
    public static void SetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
    }

    @Test
    public void hotelReserve() {

        open("https://www.phptravels.net/hotels");


        hotelSteps.dropDownCountry.click();
        hotelSteps.countrys.click();
        hotelSteps.CheckIn.setValue("05-01-2025").click();
        hotelSteps.CheckOut.click();
        hotelSteps.CheckOut.setValue("05-02-2025").click();
        hotelSteps.roomsDropDown.click();
        hotelSteps.roomsCount.setValue("3");
        hotelSteps.adultsCount.setValue("1");
        hotelSteps.childsCount.setValue("0");
        hotelSteps.searchButton.click();

        hotelSteps.priceSort.click();
        hotelSteps.ApplyFilters.click();
        hotelSteps.resetButton.click();
        hotelSteps.priceSort.click();
        hotelSteps.ApplyFilters.click();

        hotelSteps.roomInfo.click();
        hotelSteps.roomBooking.scrollTo().shouldBe(visible).click();

        hotelSteps.userNameInput.setValue("Beka");
        hotelSteps.userLastNameInput.setValue("Tchitadze");
        hotelSteps.userEmailInput.setValue("bekatchitadze@gmail.com");
        hotelSteps.userPhoneInput.setValue("598434697");
        hotelSteps.userAddressInput.setValue("Gmir-kursantta 1, b 120");

        hotelSteps.MrChoise.click();
        hotelSteps.MrChoiseInput.click();
        hotelSteps.AdultTravelName.setValue("Beka");
        hotelSteps.AdultTravelLastName.setValue("Tchitadze");

        hotelSteps.payOption.scrollTo().shouldBe(visible).shouldBe(enabled).click();
        hotelSteps.agreeCheckBox.click();
        hotelSteps.bookingConfirmButton.click();

        hotelSteps.reservationDownload.scrollTo().shouldBe(enabled).click();
    }
}
