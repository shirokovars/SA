import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$$;

public class ContributorToSelenide {

    @Test
    void AlexeiVinogradovShouldBeTheFirstContributor() {
        Configuration.holdBrowserOpen = true;

        Configuration.browserSize = "1900x1600";

        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(Selectors.byText("Contributors"))
        .closest("h2").parent().$$("li").get(2).hover();
        $$(".Popover").findBy(Condition.visible).shouldHave(Condition.text("Vinogradov"));

    }
}
