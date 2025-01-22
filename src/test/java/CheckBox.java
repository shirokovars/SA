import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class CheckBox {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;

        open("https://demoqa.com/checkbox");
        $(".rct-icon").click();
        $("//*[@id='tree-node-private']");
        $("//ul[@class='rct-title']/li[1]").click();
        $x("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]/svg").click();
        $x("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[3]").click();
        $x("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span").click();

/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span


    }
}
