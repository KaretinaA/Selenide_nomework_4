package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class DragAndDropTest {
    @Test
    void dragAndDropTest() {
        Configuration.browserSize = "1920x1080";
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //происходит только зажатие эелемента, но не перенос
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).moveByOffset(300, 200).release().perform();

    }
}
