package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WorkingDragAndDropTest {
    @Test
    void workingDragAndDropTest() {
        Configuration.browserSize = "1920x1080";
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));

        // Check column-a header after dragAndDropTo
        $("#column-a header").shouldHave(text("B"));

        // Check column-b header after dragAndDropTo
        $("#column-b header").shouldHave(text("A"));

    }
}
