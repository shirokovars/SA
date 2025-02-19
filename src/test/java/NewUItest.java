import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.io.File;

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

public class NewUItest {
@Test
    void successfulUITest() {
    Configuration.holdBrowserOpen = true;

    Configuration.browserSize = "1900x1600";

    open("https://github.com");
    $("[data-target='qbsearch-input.inputButtonText']").setValue("Arts").pressEnter();
    $("[data-target='qbsearch-input.inputButtonText']").click();


    }
}
