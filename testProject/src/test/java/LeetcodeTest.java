import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class LeetcodeTest {
    private final Logger logger = LoggerFactory.getLogger(LeetcodeTest.class);
    @BeforeClass
    void init() {
        logger.info("Открываем сайт");
        Configuration.baseUrl = "https://leetcode.com";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
    }

    @DataProvider(name = "MenuTabs")
    public static Object[][] tabsProvider() {
        return new Object[][]{
                {"Explore",  "//div[@id='explore']"},
                {"Product", "//div[@id='product']"},
                {"Developer", "//div[@id='developer']"},
                {"Sign in", "/accounts/login"}
        };
    }

    @Test(description = "Тестируем вкладки меню", dataProvider = "MenuTabs")
    public void testMenuTabs(String tabText, String expectedElementXpath) {
        open("/");
        $(By.xpath(String.format("//div[@class='nav-menu']//a/span[text()='%s']", tabText))).click();
        if (tabText.equals("Sign in")) {
            webdriver().shouldHave(urlContaining(expectedElementXpath));
        }
        else {
            $(By.xpath(expectedElementXpath)).shouldBe(visible);
        }
        sleep(1500);
    }

}
