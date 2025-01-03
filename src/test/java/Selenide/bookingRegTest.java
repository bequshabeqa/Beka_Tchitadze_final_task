package Selenide;

import SelenideSteps.bookingRegSteps;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class bookingRegTest {

    bookingRegSteps bookingSteps = new bookingRegSteps();

    @BeforeMethod
    public static void SetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        Configuration.browser = "chrome";
        Configuration.timeout = 15000;
    }

    @Test
    public void registration() {

        open("https://www.phptravels.net/");

        bookingSteps.dropDown.click();
        bookingSteps.singUp.click();
        sleep(3000);
        bookingSteps.signUpSubmitButton.scrollTo().shouldBe(visible);
        bookingSteps.signUpSubmitButton.isEnabled();
        System.out.println("SignUp ღილაკი არ არის აქტიური");
        bookingSteps.scrollElement.scrollTo();
        sleep(1500);
        bookingSteps.userNameInput.setValue("John");
        bookingSteps.userLastNameInput.setValue("Doe");
        bookingSteps.selectCountryButton.click();
        bookingSteps.countryInput.setValue("georgia").pressEnter();
        bookingSteps.selectCountryButton.click();
        bookingSteps.checkChoiseCountryText("Georgia");
        bookingSteps.phoneNumber.setValue("123123123");
        bookingSteps.emailAddress.setValue("johndoe@example.com");
        bookingSteps.password.setValue("123123");

        bookingSteps.checkBox.click();
        bookingSteps.getCheckBox.click();
        sleep(1000);
        bookingSteps.checkBoxClick.click();

        bookingSteps.signUpSubmitButton.click();
        sleep(2000);

        System.out.println("მომხმარებელი წარმატებით დარეგისტრირდა ");
    }
}
