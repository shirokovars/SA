import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContributorToSelenide {

    @Test
    void AlexeiVinogradovShouldBeTheFirstContributor() {
        Configuration.holdBrowserOpen = true;

        Configuration.browserSize = "1900x1600";

        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(Selectors.byText("Contributors")
    }
}
