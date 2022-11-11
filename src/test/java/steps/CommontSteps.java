package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommontSteps {

     WebDriver webDriver;

    @Before(order = 1)
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Before(value = "@setCookies", order = 0)
    public void setCookies() {
        System.out.println("set cookies");
    }

    @After
    public void tearDown () throws InterruptedException {
        webDriver.quit();
        Thread.sleep(1000);
    }

    public WebDriver getWebDriver () {
        return webDriver;
    }

}
