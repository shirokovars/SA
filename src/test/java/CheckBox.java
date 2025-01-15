import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckBox {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;

        open("https://demoqa.com/checkbox");



    }
}
