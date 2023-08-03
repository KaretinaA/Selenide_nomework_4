package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SolutionTest {
    @Test
    void solutionTest (){
        Configuration.browserSize = "1920x1080";
        open("https://github.com/");
        $x("//*[contains(text(), 'Solutions')]").hover();
        $x("//*[contains(text(), 'Enterprise')]").click();
        $x("//*[contains(text(), 'Build like the best')]").shouldHave(text("Build like the best"));

    }
}
