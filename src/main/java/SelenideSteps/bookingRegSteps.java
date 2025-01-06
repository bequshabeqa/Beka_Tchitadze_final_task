package SelenideSteps;

import SelenideTests.bookingRegElements;
import com.codeborne.selenide.Condition;
import java.io.FileNotFoundException;

public class bookingRegSteps extends bookingRegElements {

    public void actions() throws FileNotFoundException {

        dropDown.click();
        singUp.click();
        scrollElement.scrollTo();
    }
    public void userFirstName(String username){
        userNameInput.setValue(username);
    }

    public void userLastName(String lastname){
        userLastNameInput.setValue(lastname);
    }

    public void selectCountryButton(){
        selectCountryButton.click();
    }

    public void countryInput(String country) {
        countryInput.setValue(country).click();
    }

    public void checkChoiseCountryText(String text) {
        choiseCountryText.shouldHave(Condition.text(text));
    }

    public void phoneNumberInput(String number) {
        phoneNumber.setValue(number);
    }
    public void email(String emailAddres){
        emailAddress.setValue(emailAddres);
    }

    public void password(String pass) {
        password.setValue(pass);
    }

    public void checkSignUpSubmitButton() {
        signUpSubmitButton.isEnabled();
        signUpSubmitButton.click();
    }

    public void checkBoxInfo() {
        checkBox.click();
        checkBoxCorrect.click();
        checkBoxClick.click();
        getCheckBox.click();
    }

}
