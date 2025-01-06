package SelenideTests;

import SelenideSteps.bookingRegSteps;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

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
        bookingSteps.signUpSubmitButton.scrollTo().shouldBe(visible);
        bookingSteps.signUpSubmitButton.isEnabled();
        System.out.println("SignUp ღილაკი არ არის აქტიური");
        bookingSteps.scrollElement.scrollTo();
        bookingSteps.userNameInput.setValue("Beka");
        bookingSteps.userLastNameInput.setValue("Tchitadze");
        bookingSteps.selectCountryButton.click();
        bookingSteps.countryInput.setValue("georgia").pressEnter();
        bookingSteps.selectCountryButton.click();
        bookingSteps.checkChoiseCountryText("Georgia");
        bookingSteps.phoneNumber.setValue("598434697");
        bookingSteps.emailAddress.setValue("bekatchitadze@gmail.com");
        bookingSteps.password.setValue("Beqa123!@#");

        bookingSteps.checkBox.click();

        bookingSteps.signUpSubmitButton.click();

        System.out.println("მომხმარებელი წარმატებით დარეგისტრირდა ");
    }
}
