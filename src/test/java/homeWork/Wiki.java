package homeWork;

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
        browserSize = "1920x1080";
        open("https://github.com/selenide/selenide/");
        $("#wiki-tab").click();
        Thread.sleep(3000);
        Selenide.executeJavaScript("window.scroll(0, 1000);");
        $x("//*[contains(text(), 'Show 2 more pages')]").click();
        // $$("ul.m-0 p-0 list-style-none li").get(19).$(byText("Show 2 more pages")).click();
        $x("//*[contains(text(), 'SoftAssertions')]").shouldHave(text("SoftAssertions"));
        $x("//*[contains(text(), 'SoftAssertions')]").click();
        Thread.sleep(3000);
       // $$("ul.m-0 p-0 list-style-none li").get(19).shouldHave(text("Show 2 more pages"));
       // $$("ul.m-0 p-0 list-style-none li").get(19).$("a").click();
       // $.shouldHave(text("3. Using JUnit5 extend test class:"));
        Selenide.executeJavaScript("window.scroll(0, 1800);");
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
        $("#wiki-body").shouldHave(text("@Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }"));
        Thread.sleep(5000);


    }


}
