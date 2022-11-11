package actions;

import elements.EbaySellingPageElements;
import elements.EbaySellingPrelistSugestPageElements;
import org.openqa.selenium.WebDriver;
import steps.CommontSteps;

public class EbaySellAProductActions {

    WebDriver webDriver;
    EbaySellingPageElements ebaySellingPageElements;
    EbaySellingPrelistSugestPageElements ebaySellingPrelistSugestPageElements;

    public EbaySellAProductActions (CommontSteps commontSteps) {
        this.webDriver = commontSteps.getWebDriver();
        ebaySellingPageElements = new EbaySellingPageElements(webDriver);
        ebaySellingPrelistSugestPageElements = new EbaySellingPrelistSugestPageElements(webDriver);
    }

    public void clickOnListAnItemButton () {
        ebaySellingPageElements.listAnItemButton.click();
    }

    public void enterAProductOnSuggestionInput (String product) {
        ebaySellingPrelistSugestPageElements.inputProduct.sendKeys(product);
    }

    public void clickOnSearchProduct() {
        ebaySellingPrelistSugestPageElements.searchButton.click();
    }



}
