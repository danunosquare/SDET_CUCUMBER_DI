package actions;

import elements.EbayAdvancedSearchElements;
import org.openqa.selenium.WebDriver;
import steps.CommontSteps;

public class EbayAdvancedSearchActions {

    WebDriver webDriver;
    EbayAdvancedSearchElements ebayAdvancedSearchElements;

    public EbayAdvancedSearchActions(CommontSteps commontSteps){
        webDriver = commontSteps.getWebDriver();
        ebayAdvancedSearchElements = new EbayAdvancedSearchElements(webDriver);
    }

    public void goToAdvancedSearch() {
        ebayAdvancedSearchElements.ebayLogo.click();
    }

    public void clickOnSearchButton() {
        ebayAdvancedSearchElements.searchingButton.click();
    }

    public void enterMaxPrice(String max) {
        ebayAdvancedSearchElements.maxPrice.sendKeys(max);
    }

    public void enterMinPrice(String min) {
        ebayAdvancedSearchElements.minPrice.sendKeys(min);
    }

    public void enterExcludeItem(String item) {
        ebayAdvancedSearchElements.excludeString.sendKeys(item);
    }

    public void enterSearchItem(String item) {
        ebayAdvancedSearchElements.searchString.sendKeys(item);
    }
}
