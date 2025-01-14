import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SubmitTest {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;

        open("https://demoqa.com/text-box");

        $("[type=email]").setValue("test2315@gmail.com");

        $("[type=text]").setValue("Thom Yorke");

        $("[id=currentAddress]").setValue("2649 Post Avenue, 60126");

        $("[id=permanentAddress]").setValue("2746 Snyder Avenue, 73425");

        $("[id=submit]").click();

        $("[id=email]").shouldHave(Condition.text("gmail"));

    }
}
