import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.selector.ByText.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTextCaseInsensitive;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selectors.withTextCaseInsensitive;


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

        $("#dateOfBirthInput").click();

        $(".react-datepicker__month-select").selectOption("March");

        $(".react-datepicker__year-select").selectOption("1995");

        $(".react-datepicker__day--018:not(.react-datepicker__day--outside-month)").click();

        $("#currentAddress").setValue("Lenina apt 145");

        $("#hobbies-checkbox-1").parent().click();

        $("#hobbies-checkbox-2").parent().click();

        $("#hobbies-checkbox-3").parent().click();

        $("#subjectsContainer").setValue("idk what it is?");



        //$("[id=firstName]").setValue("2649 Post Avenue, 60126");

        $("[id=permanentAddress]").setValue("2746 Snyder Avenue, 73425");

        $("[id=submit]").click();

        $("[id=email]").shouldHave(Condition.text("gmail"));

    }
}
