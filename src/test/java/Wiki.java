import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Wiki {
    @Test
    void selenideHomework() throws InterruptedException {
        browserSize="1920x1080";
        open("https://github.com/selenide/selenide/");
       $("#wiki-tab").click();
      $("#wiki-pages-box").$("div.js-wiki-sidebar-toggle-display").$(byText("button")).click();
             // $(byText("SoftAssertions")).click();


     //$("div.wiki-body").$(byText("3. Using JUnit5 extend test class:"));

        Thread.sleep(5000);
    }


}
