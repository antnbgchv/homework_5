import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseParams {

    @BeforeAll
    static void config() {
        //config
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterEach
    void webDriverClose() {
        //close driver
        Selenide.closeWebDriver();
    }
}
