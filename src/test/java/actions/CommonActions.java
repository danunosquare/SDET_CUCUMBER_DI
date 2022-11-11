package actions;

import org.openqa.selenium.WebDriver;
import steps.CommontSteps;

public class CommonActions {
    private WebDriver webDriver;
    CommontSteps commontSteps;

    public CommonActions(CommontSteps commontSteps) {
        this.webDriver = commontSteps.getWebDriver();

    }

    public void goToUrl (String url) {
        webDriver.get(url);
    }

    public String getCurrentUrl () {
        return webDriver.getCurrentUrl();
    }

    public String getCurrentTitle () {
        return webDriver.getTitle();
    }

    public void quiteWebDriver(){
        webDriver.quit();
    }





}
