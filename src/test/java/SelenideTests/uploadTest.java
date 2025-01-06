package SelenideTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import java.io.File;
import static com.codeborne.selenide.Selenide.*;

public class uploadTest {

    @Test
    public void pdfUploadTest() {
        open("https://webdriveruniversity.com/File-Upload/index.html");

        $(Selectors.byId("submit-button")).click();
        sleep(1500);
        Alert BeforeAlert = Selenide.switchTo().alert();
        String BeforeAlertText = BeforeAlert.getText();

        if (BeforeAlertText.equals("You need to select a file to upload!")) {
            System.out.println("File is not uploaded!");
        } else {
            System.out.println("Failure: Alert message is incorrect. Found " + BeforeAlertText);
        }

        File file = new File("C:\\Users\\bchitadze\\IdeaProjects\\Beka_Tchitadze_final_task\\src\\main\\resources\\Files\\invoice.pdf");

        $("#myFile").uploadFile(file);

        $(Selectors.byId("myFile")).shouldHave(Condition.value("invoice.pdf"));

        $(Selectors.byId("submit-button")).click();
        Alert alert = Selenide.switchTo().alert();
        String alertText = alert.getText();

        if (alertText.equals("Your file has now been uploaded!")) {
            System.out.println("Success: Alert message is correct.");
        } else {
            System.out.println("Failure: Alert message is incorrect. Found " + alertText);
        }
    }
}
