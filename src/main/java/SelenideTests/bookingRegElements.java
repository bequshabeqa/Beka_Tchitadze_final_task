package SelenideTests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class bookingRegElements {

        public SelenideElement dropDown = $(Selectors.byText("Account"));

        public SelenideElement singUp = $(Selectors.byText("Signup"));

        public SelenideElement signUpSubmitButton = $(Selectors.byId("submitBTN"));

        public SelenideElement scrollElement = $(Selectors.byId("firstname"));

        public SelenideElement userNameInput = $(Selectors.byId("firstname"));

        public SelenideElement userLastNameInput = $(Selectors.byId("last_name"));

        public SelenideElement selectCountryButton = $(Selectors.byXpath("//*[@id=\"signup\"]/div/div/div/div[3]/div[1]/div/div/button"));

        public SelenideElement countryInput = $(Selectors.byXpath("//*[@id=\"signup\"]/div/div/div/div[3]/div[1]/div/div/div/div[1]/input"));

        public SelenideElement choiseCountryText = $(Selectors.byXpath("//*[@id=\"signup\"]/div/div/div/div[3]/div[1]/div/div/button/div/div/div/span"));

        public SelenideElement phoneNumber = $(Selectors.byId("phone"));

        public SelenideElement emailAddress = $(Selectors.byId("user_email"));

        public SelenideElement password = $(Selectors.byId("password"));

        public SelenideElement checkBox = $(Selectors.byAttribute("class","g-recaptcha"));

        public SelenideElement getCheckBox = $(Selectors.byAttribute("aria-checked","true"));

        public SelenideElement checkBoxClick = $(Selectors.byAttribute("class","recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox"));

        public SelenideElement checkBoxCorrect = $(Selectors.byAttribute("data-callback","cottectCaptcha"));



}
