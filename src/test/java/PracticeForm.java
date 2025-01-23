import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeForm {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Thom Yorke");

        $("#lastName").setValue("Thom Yorke");

        $("#userEmail").setValue("test2311@gmail.com");

        $("#userNumber").setValue("0605590290");

        $("#gender-radio-3").parent().click();



//
        $("[id=dateOfBirthInput]").setValue("01.01.20");

        $("[id=firstName]").setValue("2649 Post Avenue, 60126");

        $("[id=permanentAddress]").setValue("2746 Snyder Avenue, 73425");

        $("[id=submit]").click();

        $("[id=email]").shouldHave(Condition.text("gmail"));

    }
}
