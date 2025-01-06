package SelenideTests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class HotelElements {

    public SelenideElement dropDownCountry = $(Selectors.byId("select2-hotels_city-container"));

    public SelenideElement countrys = $(Selectors.byXpath("//*[@id=\"select2-hotels_city-results\"]/div/div[1]/div/strong/small"));

    public SelenideElement CheckIn = $(Selectors.byId("checkin"));

    public SelenideElement CheckOut = $(Selectors.byId("checkout"));

    public SelenideElement roomsDropDown = $(Selectors.byAttribute("class", "dropdown dropdown-contain"));

    public SelenideElement roomsCount = $(Selectors.byId("hotels_rooms"));

    public SelenideElement adultsCount = $(Selectors.byId("hotels_adults"));

    public SelenideElement childsCount = $(Selectors.byId("hotels_childs"));

    public SelenideElement searchButton = $(Selectors.byAttribute("type", "submit"));

    public SelenideElement priceSort = $(Selectors.byId("desc"));

    public SelenideElement ApplyFilters = $(Selectors.byText("Apply Filters"));

    public SelenideElement resetButton = $(Selectors.byAttribute("class", "reset--btn"));

    public SelenideElement roomInfo = $(Selectors.byXpath("//*[@id=\"fadein\"]/main/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/a"));

    public SelenideElement roomBooking = $(Selectors.byAttribute("class", "total-price fw-light"));

    public SelenideElement userNameInput = $(Selectors.byAttribute("name", "user[first_name]"));

    public SelenideElement userLastNameInput = $(Selectors.byAttribute("name", "user[last_name]"));

    public SelenideElement userEmailInput = $(Selectors.byAttribute("name", "user[email]"));

    public SelenideElement userPhoneInput = $(Selectors.byId("phone"));

    public SelenideElement userAddressInput = $(Selectors.byAttribute("name", "user[address]"));

    public SelenideElement MrChoise = $(Selectors.byAttribute("name", "title_1"));

    public SelenideElement MrChoiseInput = $(Selectors.byAttribute("value", "Mrs"));

    public SelenideElement AdultTravelName = $(Selectors.byAttribute("name", "firstname_1"));

    public SelenideElement AdultTravelLastName = $(Selectors.byAttribute("name", "lastname_1"));

    public SelenideElement payOption = $(Selectors.byAttribute("value", "pay_later"));

    public SelenideElement agreeCheckBox = $(Selectors.byId("agreechb"));

    public SelenideElement bookingConfirmButton = $(Selectors.byId("booking"));

    public SelenideElement reservationDownload = $(Selectors.byAttribute("class", "btn border no_print w-100 d-flex item-align-center gap-3 justify-content-center p-3 waves-effect"));


}
