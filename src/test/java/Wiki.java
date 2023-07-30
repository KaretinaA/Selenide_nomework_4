import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Wiki {
    @Test
    void selenideHomework() throws InterruptedException {
        browserSize="1920x1080";
        open("https://github.com/selenide/selenide/");
       $("#wiki-tab").click();

        Thread.sleep(3000);
        Selenide.executeJavaScript("window.scroll(0, 1000);");
        // $("div.Layout-sidebar").$(byText("Show 2 more pages…")).click();
        $$("ul.m-0 p-0 list-style-none li").get(19).$(byText("Show 2 more pages")).click();
        Thread.sleep(5000);





    }


}
