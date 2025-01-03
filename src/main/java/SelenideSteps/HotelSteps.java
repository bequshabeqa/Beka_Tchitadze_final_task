package SelenideSteps;

import SelenideElements.HotelElements;
import java.io.FileNotFoundException;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class HotelSteps extends HotelElements {

    public void actions() throws FileNotFoundException {

        searchButton.click();
        dropDownCountry.click();
        countrys.click();
        resetButton.click();
        roomInfo.click();
        bookingConfirmButton.click();
    }

    public void checkIn(String datein) {
        CheckIn.click();
        CheckIn.setValue(datein);
    }

    public void checkOut(String dateOut) {
        CheckOut.click();
        CheckOut.setValue(dateOut);
    }

    public void roomsDropDown(){
        roomsDropDown.click();
    }

    public void rooms (String quantity) {
        roomsCount.setValue(quantity);
    }
    public void adults (String quantity) {
        adultsCount.setValue(quantity);
    }
    public void childs (String quantity) {
        childsCount.setValue(quantity);
    }

    public void priceSortButton() {

        priceSort.scrollTo();
        priceSort.shouldBe(visible);
        priceSort.click();
    }
    public void applyFilters() {

        ApplyFilters.scrollTo();
        ApplyFilters.shouldBe(visible);
        ApplyFilters.click();
    }

    public void roomBookingInfo() {

        roomBooking.scrollTo();
        roomBooking.shouldBe(visible);
        roomBooking.click();
    }

    public void userFirstName(String username) {
        userNameInput.setValue(username);
    }
    public void userLastName(String userlastname) {
        userLastNameInput.setValue(userlastname);
    }
    public void userEmailInput(String email) {
        userEmailInput.setValue(email);
    }
    public void userPhoneInput(String phonenumber) {
        userPhoneInput.setValue(phonenumber);
    }
    public void userAddressInput(String address) {
        userAddressInput.setValue(address);
    }
    public void MrChoiseValue() {
        MrChoise.click();
        MrChoiseInput.selectOption("Mrs");

    }
    public void adultTravelFirstName(String adultname) {
        AdultTravelName.setValue(adultname);
    }
    public void adultTravelLastName(String adultLastname) {
        AdultTravelLastName.setValue(adultLastname);
    }

    public void payOptionInfo() {
        payOption.scrollTo();
        payOption.shouldBe(visible);
        payOption.shouldBe(enabled);
        payOption.click();
    }
    public void agreeCheckBoxInfo() {
        agreeCheckBox.scrollTo();
        agreeCheckBox.shouldBe(visible);
        agreeCheckBox.click();
    }
    public void downloadFile() {
        reservationDownload.scrollTo();
        reservationDownload.shouldBe(enabled);
        reservationDownload.click();
    }

}
