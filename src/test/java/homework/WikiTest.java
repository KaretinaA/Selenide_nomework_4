package homework;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WikiTest {
    @Test
    void selenideHomeworkTest() {
        Configuration.browserSize = "1920x1080";
        open("https://github.com/selenide/selenide/");
        $("#wiki-tab").click();
        Selenide.executeJavaScript("window.scroll(0, 1000);");
        $x("//*[contains(text(), 'Show 2 more pages')]").click();
        $x("//*[contains(text(), 'SoftAssertions')]").shouldHave(text("SoftAssertions"));
        $x("//*[contains(text(), 'SoftAssertions')]").click();
        Selenide.executeJavaScript("window.scroll(0, 1800);");
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:\n" +
                "@ExtendWith({SoftAssertsExtension.class})\n" +
                        "class Tests {\n" +
                        "  @Test\n" +
                        "  void test() {\n" +
                        "    Configuration.assertionMode = SOFT;\n" +
                        "    open(\"page.html\");\n" +
                        "\n" +
                        "    $(\"#first\").should(visible).click();\n" +
                        "    $(\"#second\").should(visible).click();\n" +
                        "  }\n" +
                        "}"));

    }

}
